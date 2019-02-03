package by.epam.kvirikashvili.builder;

import by.epam.kvirikashvili.entity.Leaf;
import by.epam.kvirikashvili.entity.Part;

public class TextBuilder {
    private StringBuilder builder;

    public String buildText(Part part) {
        builder = new StringBuilder();
        build(part);
        return builder.toString();
    }

    private void build(Part part) {
        switch (part.getType()) {
            case PARAGRAPH:
                if (builder.length() > 0) {
                    builder.append("\n");
                }
                builder.append("   ");
                for (Part p : part.getChildren()) {
                    build(p);
                }
                break;
            case LEXEME:
                builder.append(" ");
            case TEXT:
            case SENTENCE:
            case WORD:
            case SYMBOL:
            case EXPRESSION:
                for (Part p : part.getChildren()) {
                    build(p);
                }
                break;
            case LETTER:
            case SIGN:
            case DIGIT:
            default:
                builder.append(((Leaf) part).getText());
                break;
        }
    }
}
