package by.epam.kvirikashvili.interpreter;

public class TerminalExpressionXor extends AbstractMathExpression {
    @Override
    public void interpret(Context c) {
        c.pushValue(c.popValue() ^ c.popValue());
    }
}