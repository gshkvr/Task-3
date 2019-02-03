package by.epam.kvirikashvili.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composite implements Part {
    List<Part> parts = new ArrayList<>();
    private PartType type;

    public Composite(PartType type) {
        this.type = type;
    }

    @Override
    public void add(Part c) {
        parts.add(c);
    }

    @Override
    public void replaceChildren(List<Part> children) {
        parts = children;
    }

    @Override
    public List<Part> getChildren() {
        return parts;
    }

    @Override
    public PartType getType() {
        return type;
    }

    public void setType(PartType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composite composite = (Composite) o;
        return Objects.equals(parts, composite.parts) &&
                type == composite.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parts, type);
    }
}
