package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;

public class ExpressionParser extends Parser {

    private ExpressionParser() {
    }

    private static class SingletonExpressionParser {
        private static final ExpressionParser INSTANCE = new ExpressionParser();
    }

    public static ExpressionParser getInstance() {
        return SingletonExpressionParser.INSTANCE;
    }

    @Override
    public void parseConcrete(Part composite, String text) {
        Part digit = new Leaf(text, PartType.DIGIT);
        composite.add(digit);
    }
}
