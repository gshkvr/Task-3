package by.epam.kvirikashvili.parcer;

import by.epam.kvirikashvili.entity.Composite;
import by.epam.kvirikashvili.entity.Part;
import by.epam.kvirikashvili.entity.PartType;
import by.epam.kvirikashvili.exception.NoSuchOperationException;
import by.epam.kvirikashvili.exception.NoSuchParserTypeException;
import by.epam.kvirikashvili.interpreter.RPNInterpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends Parser {
    private static final String IS_SYMBOL = "[^\\s\\w]+";
    private static final String IS_WORD = "[A-Za-z]+";
    private static final String IS_EXPRESSION = "[0-9<>&|()^]+";

    private LexemeParser() {
    }

    private static final class SingletonLexemeParser {
        private static final LexemeParser INSTANCE = new LexemeParser();
    }

    public static LexemeParser getInstance() {
        return SingletonLexemeParser.INSTANCE;
    }

    @Override
    public void parseConcrete(Part part, String text) throws NoSuchParserTypeException, NoSuchOperationException {
        Pattern pattern = Pattern.compile(IS_WORD);
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()) {
            Part word = new Composite(PartType.WORD);
            setNext(ParserFactory.getParser(PartType.WORD));
            nextParser.parse(word, text);
            part.add(word);
        } else {
            pattern = Pattern.compile(IS_SYMBOL);
            matcher = pattern.matcher(text);
            if (matcher.matches()) {
                Part symbol = new Composite(PartType.SYMBOL);
                setNext(ParserFactory.getParser(PartType.SYMBOL));
                nextParser.parse(symbol, text);
                part.add(symbol);
            } else {
                pattern = Pattern.compile(IS_EXPRESSION);
                matcher = pattern.matcher(text);
                if (matcher.matches()) {
                    Part expression = new Composite(PartType.EXPRESSION);
                    setNext(ParserFactory.getParser(PartType.EXPRESSION));
                    RPNInterpreter interpreter = new RPNInterpreter(text);
                    text = interpreter.calculate();
                    nextParser.parse(expression, text);
                    part.add(expression);
                }
            }
        }
    }
}
