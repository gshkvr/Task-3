package by.epam.kvirikashvili.entity;

import java.util.List;

public interface Part {
    void add(Part c);

    void replaceChildren(List<Part> children);

    List<Part> getChildren();

    PartType getType();
}
