package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;

public class WordParser extends Parser {
    private WordParser() {
    }

    private static final class SingletonWordParser {
        private static final WordParser INSTANCE = new WordParser();
    }

    public static WordParser getInstance() {
        return WordParser.SingletonWordParser.INSTANCE;
    }

    @Override
    public void parseConcrete(Part composite, String text) {
        Part letter = new Leaf(text, PartType.LETTER);
        composite.add(letter);
    }
}
