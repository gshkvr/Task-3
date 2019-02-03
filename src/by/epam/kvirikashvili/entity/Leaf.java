package by.epam.kvirikashvili.entity;

import java.util.List;
import java.util.Objects;

public class Leaf implements Part {
    private String text;
    private PartType type;

    public Leaf(String text, PartType type) {
        this.text = text;
        this.type = type;
    }

    @Override
    public void add(Part c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceChildren(List<Part> children) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Part> getChildren() {
        throw new UnsupportedOperationException();
    }

    @Override
    public PartType getType() {
        return type;
    }

    public void setType(PartType type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(text, leaf.text) &&
                type == leaf.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, type);
    }
}
