package by.epam.kvirikashvili.interpreter;

import by.epam.kvirikashvili.exception.NoSuchOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RPNInterpreter {
    private static final String SPLIT_EXPRESSION = "[\\d]+|[()&|^]|[<>]{2}";
    private ArrayList<AbstractMathExpression> listExpression = new ArrayList<>();
    private List<String> rpn = new ArrayList<>();
    private String expression;

    public RPNInterpreter(String expression) {
        this.expression = expression;
    }

    public String calculate() throws NoSuchOperationException {
        convertToRPN();
        parseRPN();
        return calculateRPN();
    }

    private void convertToRPN() throws NoSuchOperationException {
        Stack<String> operationStack = new Stack<>();
        Pattern pattern = Pattern.compile(SPLIT_EXPRESSION);
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            String token = matcher.group();
            if (isNumber(token)) {
                rpn.add(token);
            } else if (token.equals("(")) {
                operationStack.push(token);
            } else if (token.equals(")")) {
                while (!operationStack.peek().equals("(")) {
                    rpn.add(operationStack.pop());
                }
                operationStack.pop();
            } else {
                while (!operationStack.isEmpty() && getPriority(operationStack.peek()) >= getPriority(token)) {
                    rpn.add(operationStack.pop());
                }
                operationStack.push(token);
            }
        }
        while (!operationStack.isEmpty()) {
            rpn.add(operationStack.pop());
        }
    }

    private void parseRPN() {
        for (String token : rpn) {
            switch (token) {
                case "|":
                    listExpression.add(new TerminalExpressionOr());
                    break;
                case "^":
                    listExpression.add(new TerminalExpressionXor());
                    break;
                case "&":
                    listExpression.add(new TerminalExpressionAnd());
                    break;
                case ">>":
                    listExpression.add(new TerminalExpressionRightShift());
                    break;
                case "<<":
                    listExpression.add(new TerminalExpressionLeftShift());
                    break;
                default:
                    listExpression.add(
                            new NonterminalExpressionNumber(Integer.valueOf(token)));
            }
        }
    }

    private String calculateRPN() {
        Context context = new Context();
        for (AbstractMathExpression terminal : listExpression) {
            terminal.interpret(context);
        }
        return String.valueOf(context.popValue());
    }

    private boolean isNumber(String token) {
        return Character.isDigit(token.charAt(0));
    }

    private int getPriority(String symbol) throws NoSuchOperationException {
        switch (symbol) {
            case "(":
            case ")":
                return 1;
            case "|":
                return 2;
            case "^":
                return 3;
            case "&":
                return 4;
            case ">>":
            case "<<":
                return 5;
            default:
                throw new NoSuchOperationException();
        }
    }
}
