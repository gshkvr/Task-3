package by.epam.kvirikashvili.interpreter;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;

public class Context {
    private ArrayDeque<Integer> contextValues = new ArrayDeque<>();

    public Integer popValue() {
        return contextValues.pop();
    }

    public void pushValue(Integer value) {
        this.contextValues.push(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Context context = (Context) o;
        return Arrays.equals(contextValues.toArray(), context.contextValues.toArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(contextValues);
    }
}
