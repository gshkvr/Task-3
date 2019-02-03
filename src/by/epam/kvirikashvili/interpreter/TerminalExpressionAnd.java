package by.epam.kvirikashvili.interpreter;

public class TerminalExpressionAnd extends AbstractMathExpression {
    @Override
    public void interpret(Context c) {
        c.pushValue((c.popValue() & c.popValue()));
    }
}