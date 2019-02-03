package by.epam.kvirikashvili.reader;

import by.epam.kvirikashvili.exception.IncorrectInputFileException;

public interface Reader {
    String read(String path) throws IncorrectInputFileException;
}
