package by.epam.kvirikashvili.reader;

import by.epam.kvirikashvili.exception.IncorrectInputFileException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader implements Reader {
    public String read(String path) throws IncorrectInputFileException {
        Path filePath = Paths.get(path);
        String data;
        try {
            data = new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            throw new IncorrectInputFileException("Incorrect reader file path", e);
        }
        return data;
    }
}
