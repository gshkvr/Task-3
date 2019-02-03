package by.epam.kvirikashvili.builder;

import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import org.testng.annotations.DataProvider;

public class TextBuilderTestData {
    @DataProvider(name = "testText")
    public Object[] testBuildText() {
        Part letter1 = new Leaf("B", PartType.LETTER);
        Part letter2 = new Leaf("e", PartType.LETTER);
        Part letter3 = new Leaf("l", PartType.LETTER);
        Part letter4 = new Leaf("a", PartType.LETTER);
        Part letter5 = new Leaf("r", PartType.LETTER);
        Part letter6 = new Leaf("u", PartType.LETTER);
        Part letter7 = new Leaf("s", PartType.LETTER);
        Part word1 = new Composite(PartType.WORD);
        word1.add(letter1);
        word1.add(letter2);
        word1.add(letter3);
        word1.add(letter4);
        word1.add(letter5);
        word1.add(letter6);
        word1.add(letter7);
        Part lexeme1 = new Composite(PartType.LEXEME);
        lexeme1.add(word1);

        Part letter8 = new Leaf("i", PartType.LETTER);
        Part letter9 = new Leaf("s", PartType.LETTER);
        Part word2 = new Composite(PartType.WORD);
        word2.add(letter8);
        word2.add(letter9);
        Part lexeme2 = new Composite(PartType.LEXEME);
        lexeme2.add(word2);

        Part letter10 = new Leaf("a", PartType.LETTER);
        Part word3 = new Composite(PartType.WORD);
        word3.add(letter10);
        Part lexeme3 = new Composite(PartType.LEXEME);
        lexeme3.add(word3);

        Part letter11 = new Leaf("c", PartType.LETTER);
        Part letter12 = new Leaf("o", PartType.LETTER);
        Part letter13 = new Leaf("u", PartType.LETTER);
        Part letter14 = new Leaf("n", PartType.LETTER);
        Part letter15 = new Leaf("t", PartType.LETTER);
        Part letter16 = new Leaf("r", PartType.LETTER);
        Part letter17 = new Leaf("y", PartType.LETTER);
        Part word4 = new Composite(PartType.WORD);
        word4.add(letter11);
        word4.add(letter12);
        word4.add(letter13);
        word4.add(letter14);
        word4.add(letter15);
        word4.add(letter16);
        word4.add(letter17);
        Part sign1 = new Leaf(".", PartType.SIGN);
        Part symbol1 = new Composite(PartType.SYMBOL);
        symbol1.add(sign1);
        Part lexeme4 = new Composite(PartType.LEXEME);
        lexeme4.add(word4);
        lexeme4.add(symbol1);

        Part sentence1 = new Composite(PartType.SENTENCE);
        sentence1.add(lexeme1);
        sentence1.add(lexeme2);
        sentence1.add(lexeme3);
        sentence1.add(lexeme4);

        Part letter18 = new Leaf("I", PartType.LETTER);
        Part letter19 = new Leaf("t", PartType.LETTER);
        Part word5 = new Composite(PartType.WORD);
        word5.add(letter18);
        word5.add(letter19);
        Part lexeme5 = new Composite(PartType.LEXEME);
        lexeme5.add(word5);

        Part letter20 = new Leaf("s", PartType.LETTER);
        Part letter21 = new Leaf("i", PartType.LETTER);
        Part letter22 = new Leaf("t", PartType.LETTER);
        Part letter23 = new Leaf("u", PartType.LETTER);
        Part letter24 = new Leaf("a", PartType.LETTER);
        Part letter25 = new Leaf("t", PartType.LETTER);
        Part letter26 = new Leaf("e", PartType.LETTER);
        Part letter27 = new Leaf("d", PartType.LETTER);
        Part word6 = new Composite(PartType.WORD);
        word6.add(letter20);
        word6.add(letter21);
        word6.add(letter22);
        word6.add(letter23);
        word6.add(letter24);
        word6.add(letter25);
        word6.add(letter26);
        word6.add(letter27);
        Part lexeme6 = new Composite(PartType.LEXEME);
        lexeme6.add(word6);

        Part letter28 = new Leaf("i", PartType.LETTER);
        Part letter29 = new Leaf("n", PartType.LETTER);
        Part word7 = new Composite(PartType.WORD);
        word7.add(letter28);
        word7.add(letter29);
        Part lexeme7 = new Composite(PartType.LEXEME);
        lexeme7.add(word7);

        Part letter30 = new Leaf("c", PartType.LETTER);
        Part letter31 = new Leaf("e", PartType.LETTER);
        Part letter32 = new Leaf("n", PartType.LETTER);
        Part letter33 = new Leaf("t", PartType.LETTER);
        Part letter34 = new Leaf("e", PartType.LETTER);
        Part letter35 = new Leaf("r", PartType.LETTER);
        Part word8 = new Composite(PartType.WORD);
        word8.add(letter30);
        word8.add(letter31);
        word8.add(letter32);
        word8.add(letter33);
        word8.add(letter34);
        word8.add(letter35);
        Part lexeme8 = new Composite(PartType.LEXEME);
        lexeme8.add(word8);

        Part letter36 = new Leaf("o", PartType.LETTER);
        Part letter37 = new Leaf("f", PartType.LETTER);
        Part word9 = new Composite(PartType.WORD);
        word9.add(letter36);
        word9.add(letter37);
        Part lexeme9 = new Composite(PartType.LEXEME);
        lexeme9.add(word9);

        Part letter38 = new Leaf("E", PartType.LETTER);
        Part letter39 = new Leaf("u", PartType.LETTER);
        Part letter40 = new Leaf("r", PartType.LETTER);
        Part letter41 = new Leaf("o", PartType.LETTER);
        Part letter42 = new Leaf("p", PartType.LETTER);
        Part letter43 = new Leaf("e", PartType.LETTER);
        Part word10 = new Composite(PartType.WORD);
        word10.add(letter38);
        word10.add(letter39);
        word10.add(letter40);
        word10.add(letter41);
        word10.add(letter42);
        word10.add(letter43);
        Part lexeme10 = new Composite(PartType.LEXEME);
        Part sign2 = new Leaf(".", PartType.SIGN);
        Part symbol2 = new Composite(PartType.SYMBOL);
        symbol2.add(sign2);
        lexeme10.add(word10);
        lexeme10.add(symbol2);
        Part sentence2 = new Composite(PartType.SENTENCE);
        sentence2.add(lexeme5);
        sentence2.add(lexeme6);
        sentence2.add(lexeme7);
        sentence2.add(lexeme8);
        sentence2.add(lexeme9);
        sentence2.add(lexeme10);

        Part paragraph1 = new Composite(PartType.PARAGRAPH);
        paragraph1.add(sentence1);
        paragraph1.add(sentence2);

        Part letter44 = new Leaf("M", PartType.LETTER);
        Part letter45 = new Leaf("i", PartType.LETTER);
        Part letter46 = new Leaf("n", PartType.LETTER);
        Part letter47 = new Leaf("s", PartType.LETTER);
        Part letter48 = new Leaf("k", PartType.LETTER);
        Part word11 = new Composite(PartType.WORD);
        word11.add(letter44);
        word11.add(letter45);
        word11.add(letter46);
        word11.add(letter47);
        word11.add(letter48);
        Part lexeme11 = new Composite(PartType.LEXEME);
        lexeme11.add(word11);

        Part symbol3 = new Composite(PartType.SYMBOL);
        Part sign3 = new Leaf("-", PartType.SIGN);
        symbol3.add(sign3);
        Part lexeme12 = new Composite(PartType.LEXEME);
        lexeme12.add(symbol3);

        Part letter49 = new Leaf("c", PartType.LETTER);
        Part letter50 = new Leaf("a", PartType.LETTER);
        Part letter51 = new Leaf("p", PartType.LETTER);
        Part letter52 = new Leaf("i", PartType.LETTER);
        Part letter53 = new Leaf("t", PartType.LETTER);
        Part letter54 = new Leaf("a", PartType.LETTER);
        Part letter55 = new Leaf("l", PartType.LETTER);
        Part word12 = new Composite(PartType.WORD);
        word12.add(letter49);
        word12.add(letter50);
        word12.add(letter51);
        word12.add(letter52);
        word12.add(letter53);
        word12.add(letter54);
        word12.add(letter55);
        Part lexeme13 = new Composite(PartType.LEXEME);
        lexeme13.add(word12);

        Part letter56 = new Leaf("o", PartType.LETTER);
        Part letter57 = new Leaf("f", PartType.LETTER);
        Part word13 = new Composite(PartType.WORD);
        word13.add(letter56);
        word13.add(letter57);
        Part lexeme14 = new Composite(PartType.LEXEME);
        lexeme14.add(word13);

        Part letter58 = new Leaf("B", PartType.LETTER);
        Part letter59 = new Leaf("e", PartType.LETTER);
        Part letter60 = new Leaf("l", PartType.LETTER);
        Part letter61 = new Leaf("a", PartType.LETTER);
        Part letter62 = new Leaf("r", PartType.LETTER);
        Part letter63 = new Leaf("u", PartType.LETTER);
        Part letter64 = new Leaf("s", PartType.LETTER);
        Part word14 = new Composite(PartType.WORD);
        word14.add(letter58);
        word14.add(letter59);
        word14.add(letter60);
        word14.add(letter61);
        word14.add(letter62);
        word14.add(letter63);
        word14.add(letter64);
        Part symbol4 = new Composite(PartType.SYMBOL);
        Part sign4 = new Leaf(".", PartType.SIGN);
        Part sign5 = new Leaf(".", PartType.SIGN);
        Part sign6 = new Leaf(".", PartType.SIGN);
        symbol4.add(sign4);
        symbol4.add(sign5);
        symbol4.add(sign6);
        Part lexeme15 = new Composite(PartType.LEXEME);
        lexeme15.add(word14);
        lexeme15.add(symbol4);

        Part sentence3 = new Composite(PartType.SENTENCE);
        sentence3.add(lexeme11);
        sentence3.add(lexeme12);
        sentence3.add(lexeme13);
        sentence3.add(lexeme14);
        sentence3.add(lexeme15);
        Part paragraph2 = new Composite(PartType.PARAGRAPH);
        paragraph2.add(sentence3);

        Part letter65 = new Leaf("F", PartType.LETTER);
        Part letter66 = new Leaf("o", PartType.LETTER);
        Part letter67 = new Leaf("u", PartType.LETTER);
        Part letter68 = new Leaf("r", PartType.LETTER);
        Part word15 = new Composite(PartType.WORD);
        word15.add(letter65);
        word15.add(letter66);
        word15.add(letter67);
        word15.add(letter68);
        Part lexeme16 = new Composite(PartType.LEXEME);
        lexeme16.add(word15);

        Part letter69 = new Leaf("y", PartType.LETTER);
        Part letter70 = new Leaf("e", PartType.LETTER);
        Part letter71 = new Leaf("a", PartType.LETTER);
        Part letter72 = new Leaf("r", PartType.LETTER);
        Part letter73 = new Leaf("s", PartType.LETTER);
        Part word16 = new Composite(PartType.WORD);
        word16.add(letter69);
        word16.add(letter70);
        word16.add(letter71);
        word16.add(letter72);
        word16.add(letter73);
        Part lexeme17 = new Composite(PartType.LEXEME);
        lexeme17.add(word16);

        Part letter74 = new Leaf("a", PartType.LETTER);
        Part letter75 = new Leaf("g", PartType.LETTER);
        Part letter76 = new Leaf("o", PartType.LETTER);
        Part word17 = new Composite(PartType.WORD);
        word17.add(letter74);
        word17.add(letter75);
        word17.add(letter76);
        Part lexeme18 = new Composite(PartType.LEXEME);
        lexeme18.add(word17);

        Part letter77 = new Leaf("w", PartType.LETTER);
        Part letter78 = new Leaf("a", PartType.LETTER);
        Part letter79 = new Leaf("s", PartType.LETTER);
        Part word18 = new Composite(PartType.WORD);
        word18.add(letter77);
        word18.add(letter78);
        word18.add(letter79);
        Part lexeme19 = new Composite(PartType.LEXEME);
        lexeme19.add(word18);

        Part expression1 = new Composite(PartType.EXPRESSION);
        Part digit1 = new Leaf("2", PartType.DIGIT);
        Part digit2 = new Leaf("0", PartType.DIGIT);
        Part digit3 = new Leaf("1", PartType.DIGIT);
        Part digit4 = new Leaf("5", PartType.DIGIT);
        expression1.add(digit1);
        expression1.add(digit2);
        expression1.add(digit3);
        expression1.add(digit4);
        Part symbol5 = new Composite(PartType.SYMBOL);
        Part sign7 = new Leaf(".", PartType.SIGN);
        symbol5.add(sign7);
        Part lexeme20 = new Composite(PartType.LEXEME);
        lexeme20.add(expression1);
        lexeme20.add(symbol5);

        Part sentence4 = new Composite(PartType.SENTENCE);
        sentence4.add(lexeme16);
        sentence4.add(lexeme17);
        sentence4.add(lexeme18);
        sentence4.add(lexeme19);
        sentence4.add(lexeme20);
        Part paragraph3 = new Composite(PartType.PARAGRAPH);
        paragraph3.add(sentence4);

        Part text = new Composite(PartType.TEXT);
        text.add(paragraph1);
        text.add(paragraph2);
        text.add(paragraph3);

        return new Object[]{text};
    }

    @DataProvider(name = "testParagraph")
    public Object[] testBuildParagraph() {
        Part letter1 = new Leaf("B", PartType.LETTER);
        Part letter2 = new Leaf("e", PartType.LETTER);
        Part letter3 = new Leaf("l", PartType.LETTER);
        Part letter4 = new Leaf("a", PartType.LETTER);
        Part letter5 = new Leaf("r", PartType.LETTER);
        Part letter6 = new Leaf("u", PartType.LETTER);
        Part letter7 = new Leaf("s", PartType.LETTER);
        Part word1 = new Composite(PartType.WORD);
        word1.add(letter1);
        word1.add(letter2);
        word1.add(letter3);
        word1.add(letter4);
        word1.add(letter5);
        word1.add(letter6);
        word1.add(letter7);
        Part lexeme1 = new Composite(PartType.LEXEME);
        lexeme1.add(word1);

        Part letter8 = new Leaf("i", PartType.LETTER);
        Part letter9 = new Leaf("s", PartType.LETTER);
        Part word2 = new Composite(PartType.WORD);
        word2.add(letter8);
        word2.add(letter9);
        Part lexeme2 = new Composite(PartType.LEXEME);
        lexeme2.add(word2);

        Part letter10 = new Leaf("a", PartType.LETTER);
        Part word3 = new Composite(PartType.WORD);
        word3.add(letter10);
        Part lexeme3 = new Composite(PartType.LEXEME);
        lexeme3.add(word3);

        Part letter11 = new Leaf("c", PartType.LETTER);
        Part letter12 = new Leaf("o", PartType.LETTER);
        Part letter13 = new Leaf("u", PartType.LETTER);
        Part letter14 = new Leaf("n", PartType.LETTER);
        Part letter15 = new Leaf("t", PartType.LETTER);
        Part letter16 = new Leaf("r", PartType.LETTER);
        Part letter17 = new Leaf("y", PartType.LETTER);
        Part word4 = new Composite(PartType.WORD);
        word4.add(letter11);
        word4.add(letter12);
        word4.add(letter13);
        word4.add(letter14);
        word4.add(letter15);
        word4.add(letter16);
        word4.add(letter17);
        Part sign1 = new Leaf(".", PartType.SIGN);
        Part symbol1 = new Composite(PartType.SYMBOL);
        symbol1.add(sign1);
        Part lexeme4 = new Composite(PartType.LEXEME);
        lexeme4.add(word4);
        lexeme4.add(symbol1);

        Part sentence1 = new Composite(PartType.SENTENCE);
        sentence1.add(lexeme1);
        sentence1.add(lexeme2);
        sentence1.add(lexeme3);
        sentence1.add(lexeme4);

        Part letter18 = new Leaf("I", PartType.LETTER);
        Part letter19 = new Leaf("t", PartType.LETTER);
        Part word5 = new Composite(PartType.WORD);
        word5.add(letter18);
        word5.add(letter19);
        Part lexeme5 = new Composite(PartType.LEXEME);
        lexeme5.add(word5);

        Part letter20 = new Leaf("s", PartType.LETTER);
        Part letter21 = new Leaf("i", PartType.LETTER);
        Part letter22 = new Leaf("t", PartType.LETTER);
        Part letter23 = new Leaf("u", PartType.LETTER);
        Part letter24 = new Leaf("a", PartType.LETTER);
        Part letter25 = new Leaf("t", PartType.LETTER);
        Part letter26 = new Leaf("e", PartType.LETTER);
        Part letter27 = new Leaf("d", PartType.LETTER);
        Part word6 = new Composite(PartType.WORD);
        word6.add(letter20);
        word6.add(letter21);
        word6.add(letter22);
        word6.add(letter23);
        word6.add(letter24);
        word6.add(letter25);
        word6.add(letter26);
        word6.add(letter27);
        Part lexeme6 = new Composite(PartType.LEXEME);
        lexeme6.add(word6);

        Part letter28 = new Leaf("i", PartType.LETTER);
        Part letter29 = new Leaf("n", PartType.LETTER);
        Part word7 = new Composite(PartType.WORD);
        word7.add(letter28);
        word7.add(letter29);
        Part lexeme7 = new Composite(PartType.LEXEME);
        lexeme7.add(word7);

        Part letter30 = new Leaf("c", PartType.LETTER);
        Part letter31 = new Leaf("e", PartType.LETTER);
        Part letter32 = new Leaf("n", PartType.LETTER);
        Part letter33 = new Leaf("t", PartType.LETTER);
        Part letter34 = new Leaf("e", PartType.LETTER);
        Part letter35 = new Leaf("r", PartType.LETTER);
        Part word8 = new Composite(PartType.WORD);
        word8.add(letter30);
        word8.add(letter31);
        word8.add(letter32);
        word8.add(letter33);
        word8.add(letter34);
        word8.add(letter35);
        Part lexeme8 = new Composite(PartType.LEXEME);
        lexeme8.add(word8);

        Part letter36 = new Leaf("o", PartType.LETTER);
        Part letter37 = new Leaf("f", PartType.LETTER);
        Part word9 = new Composite(PartType.WORD);
        word9.add(letter36);
        word9.add(letter37);
        Part lexeme9 = new Composite(PartType.LEXEME);
        lexeme9.add(word9);

        Part letter38 = new Leaf("E", PartType.LETTER);
        Part letter39 = new Leaf("u", PartType.LETTER);
        Part letter40 = new Leaf("r", PartType.LETTER);
        Part letter41 = new Leaf("o", PartType.LETTER);
        Part letter42 = new Leaf("p", PartType.LETTER);
        Part letter43 = new Leaf("e", PartType.LETTER);
        Part word10 = new Composite(PartType.WORD);
        word10.add(letter38);
        word10.add(letter39);
        word10.add(letter40);
        word10.add(letter41);
        word10.add(letter42);
        word10.add(letter43);
        Part lexeme10 = new Composite(PartType.LEXEME);
        Part sign2 = new Leaf(".", PartType.SIGN);
        Part symbol2 = new Composite(PartType.SYMBOL);
        symbol2.add(sign2);
        lexeme10.add(word10);
        lexeme10.add(symbol2);
        Part sentence2 = new Composite(PartType.SENTENCE);
        sentence2.add(lexeme5);
        sentence2.add(lexeme6);
        sentence2.add(lexeme7);
        sentence2.add(lexeme8);
        sentence2.add(lexeme9);
        sentence2.add(lexeme10);

        Part paragraph = new Composite(PartType.PARAGRAPH);
        paragraph.add(sentence1);
        paragraph.add(sentence2);

        return new Object[]{paragraph};
    }

    @DataProvider(name = "testSentence")
    public Object[] testBuildSentence() {
        Part letter1 = new Leaf("B", PartType.LETTER);
        Part letter2 = new Leaf("e", PartType.LETTER);
        Part letter3 = new Leaf("l", PartType.LETTER);
        Part letter4 = new Leaf("a", PartType.LETTER);
        Part letter5 = new Leaf("r", PartType.LETTER);
        Part letter6 = new Leaf("u", PartType.LETTER);
        Part letter7 = new Leaf("s", PartType.LETTER);
        Part word1 = new Composite(PartType.WORD);
        word1.add(letter1);
        word1.add(letter2);
        word1.add(letter3);
        word1.add(letter4);
        word1.add(letter5);
        word1.add(letter6);
        word1.add(letter7);
        Part lexeme1 = new Composite(PartType.LEXEME);
        lexeme1.add(word1);

        Part letter8 = new Leaf("i", PartType.LETTER);
        Part letter9 = new Leaf("s", PartType.LETTER);
        Part word2 = new Composite(PartType.WORD);
        word2.add(letter8);
        word2.add(letter9);
        Part lexeme2 = new Composite(PartType.LEXEME);
        lexeme2.add(word2);

        Part letter10 = new Leaf("a", PartType.LETTER);
        Part word3 = new Composite(PartType.WORD);
        word3.add(letter10);
        Part lexeme3 = new Composite(PartType.LEXEME);
        lexeme3.add(word3);

        Part letter11 = new Leaf("c", PartType.LETTER);
        Part letter12 = new Leaf("o", PartType.LETTER);
        Part letter13 = new Leaf("u", PartType.LETTER);
        Part letter14 = new Leaf("n", PartType.LETTER);
        Part letter15 = new Leaf("t", PartType.LETTER);
        Part letter16 = new Leaf("r", PartType.LETTER);
        Part letter17 = new Leaf("y", PartType.LETTER);
        Part word4 = new Composite(PartType.WORD);
        word4.add(letter11);
        word4.add(letter12);
        word4.add(letter13);
        word4.add(letter14);
        word4.add(letter15);
        word4.add(letter16);
        word4.add(letter17);
        Part sign1 = new Leaf(".", PartType.SIGN);
        Part symbol1 = new Composite(PartType.SYMBOL);
        symbol1.add(sign1);
        Part lexeme4 = new Composite(PartType.LEXEME);
        lexeme4.add(word4);
        lexeme4.add(symbol1);

        Part sentence = new Composite(PartType.SENTENCE);
        sentence.add(lexeme1);
        sentence.add(lexeme2);
        sentence.add(lexeme3);
        sentence.add(lexeme4);

        return new Object[]{sentence};
    }

    @DataProvider(name = "testLexeme")
    public Object[] testBuildLexeme() {
        Part letter1 = new Leaf("C", PartType.LETTER);
        Part letter2 = new Leaf("o", PartType.LETTER);
        Part letter3 = new Leaf("u", PartType.LETTER);
        Part letter4 = new Leaf("n", PartType.LETTER);
        Part letter5 = new Leaf("t", PartType.LETTER);
        Part letter6 = new Leaf("r", PartType.LETTER);
        Part letter7 = new Leaf("y", PartType.LETTER);
        Part word = new Composite(PartType.WORD);
        word.add(letter1);
        word.add(letter2);
        word.add(letter3);
        word.add(letter4);
        word.add(letter5);
        word.add(letter6);
        word.add(letter7);
        Part symbol = new Composite(PartType.SYMBOL);
        Part sign1 = new Leaf(".", PartType.SIGN);
        Part sign2 = new Leaf(".", PartType.SIGN);
        Part sign3 = new Leaf(".", PartType.SIGN);
        symbol.add(sign1);
        symbol.add(sign2);
        symbol.add(sign3);
        Part lexeme = new Composite(PartType.LEXEME);
        lexeme.add(word);
        lexeme.add(symbol);

        return new Object[]{lexeme};
    }

    @DataProvider(name = "testWord")
    public Object[] testBuildWord() {
        Part letter1 = new Leaf("c", PartType.LETTER);
        Part letter2 = new Leaf("o", PartType.LETTER);
        Part letter3 = new Leaf("u", PartType.LETTER);
        Part letter4 = new Leaf("n", PartType.LETTER);
        Part letter5 = new Leaf("t", PartType.LETTER);
        Part letter6 = new Leaf("r", PartType.LETTER);
        Part letter7 = new Leaf("y", PartType.LETTER);
        Part word = new Composite(PartType.WORD);
        word.add(letter1);
        word.add(letter2);
        word.add(letter3);
        word.add(letter4);
        word.add(letter5);
        word.add(letter6);
        word.add(letter7);

        return new Object[]{word};
    }

    @DataProvider(name = "testSymbol")
    public Object[] testBuildSymbol() {
        Part symbol = new Composite(PartType.SYMBOL);
        Part sign1 = new Leaf(".", PartType.SIGN);
        Part sign2 = new Leaf(".", PartType.SIGN);
        Part sign3 = new Leaf(".", PartType.SIGN);
        symbol.add(sign1);
        symbol.add(sign2);
        symbol.add(sign3);

        return new Object[]{symbol};
    }

    @DataProvider(name = "testExpression")
    public Object[] testBuildDigit() {
        Part expression = new Composite(PartType.EXPRESSION);
        Part digit1 = new Leaf("2", PartType.DIGIT);
        Part digit2 = new Leaf("0", PartType.DIGIT);
        Part digit3 = new Leaf("1", PartType.DIGIT);
        Part digit4 = new Leaf("5", PartType.DIGIT);
        expression.add(digit1);
        expression.add(digit2);
        expression.add(digit3);
        expression.add(digit4);

        return new Object[]{expression};
    }
}
