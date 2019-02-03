package by.epam.kvirikashvili.sorter;

import by.epam.kvirikashvili.builder.TextBuilder;
import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CompositeSorter {
    private static String containsStr;

    public void sortParagraphBySentencesCount(Part text) {
        if (text.getType().equals(PartType.TEXT)) {
            text.getChildren()
                    .sort(Comparator.comparing(paragraph -> paragraph.getChildren().size()));
        }
    }

    public void sortWordsInSentenceByLength(Part text) {
        if (text.getType().equals(PartType.TEXT)) {
            text.getChildren()
                    .forEach(paragraph -> paragraph.getChildren()
                            .forEach(CompositeSorter::sortWordsByLength));
        }
    }

    public void sortLexemesInSentenceBySymbolCount(Part text, String s) {
        containsStr = s;
        if (text.getType().equals(PartType.TEXT)) {
            text.getChildren()
                    .forEach(paragraph -> paragraph.getChildren()
                            .forEach(sentence -> sortLexemesByChar(sentence)));
        }
    }

    private static void sortWordsByLength(Part sentence) {
        List<Part> words = getAllWordsInSentence(sentence);
        words.sort(Comparator.comparing(word -> word.getChildren().size()));
        setSortedWordsToSentence(sentence, words);
    }

    private static List<Part> getAllWordsInSentence(Part sentence) {
        List<Part> words = new LinkedList<>();
        sentence.getChildren()
                .stream()
                .forEach(lexeme -> lexeme.getChildren()
                        .stream()
                        .filter(part -> part.getType().equals(PartType.WORD))
                        .forEach(part -> words.add(part)));
        return words;
    }

    private static void setSortedWordsToSentence(Part sentence, List<Part> words) {
        sentence.getChildren()
                .stream()
                .forEach(lexeme -> setSortedWordsToLexeme(lexeme, words));
    }

    private static void setSortedWordsToLexeme(Part lexeme, List<Part> words) {
        lexeme.replaceChildren(lexeme.getChildren()
                .stream()
                .map(part -> part.getType().equals(PartType.WORD) ? ((LinkedList<Part>) words).pollFirst() : part)
                .collect(Collectors.toList()));
    }

    private void sortLexemesByChar(Part sentence) {
        sentence.getChildren()
                .sort(Comparator.comparing(CompositeSorter::lexemeContainsSymbolCount)
                        .reversed()
                        .thenComparing(CompositeSorter::lexemeToString)
                );
    }

    private static int lexemeContainsSymbolCount(Part lexeme) {
        int i = (int) lexeme.getChildren()
                .stream()
                .flatMap(part -> part.getChildren().stream())
                .filter(str -> ((Leaf) str).getText().equals(containsStr))
                .count();
        return i;
    }

    private static String lexemeToString(Part lexeme) {
        TextBuilder textBuilder = new TextBuilder();
        String sLexeme = textBuilder.buildText(lexeme).trim();
        return sLexeme;
    }
}
