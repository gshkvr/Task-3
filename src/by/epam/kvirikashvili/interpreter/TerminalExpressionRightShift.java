package by.epam.kvirikashvili.interpreter;

public class TerminalExpressionRightShift extends AbstractMathExpression {
    @Override
    public void interpret(Context c) {
        int digit1 = c.popValue();
        int digit2 = c.popValue();
        c.pushValue(digit2 >> digit1);
    }
}