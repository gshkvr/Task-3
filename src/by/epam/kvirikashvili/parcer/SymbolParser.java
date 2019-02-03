package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;

public class SymbolParser extends Parser {
    private SymbolParser() {
    }

    private static final class SingletonSymbolParser {
        private static final SymbolParser INSTANCE = new SymbolParser();
    }

    public static SymbolParser getInstance() {
        return SymbolParser.SingletonSymbolParser.INSTANCE;
    }

    @Override
    public void parseConcrete(Part composite, String text) {
        Part sign = new Leaf(text, PartType.SIGN);
        composite.add(sign);
    }
}
