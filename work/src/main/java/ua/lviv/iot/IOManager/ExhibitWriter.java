package ua.lviv.iot.IOManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExhibitWriter {

    public final Writer writer;

    public ExhibitWriter(final Writer writer) {
        this.writer = writer;
    }

    public static void inputStaticTextToFile(final String fileName, final String... lines) throws IOException {
        File file = new File(fileName);
        Writer writer = new FileWriter(file);
        for (String line : lines) {
            writer.write(line);
            writer.write("\r");
        }
        writer.flush();
        writer.close();
    }

    public static void outputStaticTextOfFile(final String file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
