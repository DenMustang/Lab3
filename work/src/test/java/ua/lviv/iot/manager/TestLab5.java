package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.IOManager.ExhibitWriter;
import ua.lviv.iot.model.Paintings;
import ua.lviv.iot.model.Weapons;
import java.io.IOException;
import java.io.StringWriter;

public class TestLab5 {

    @Test
    public void inputManager() throws IOException {
        Weapons weapons = new Weapons("Unknown", 20, "sharp", "Destruction", 1000, 1043,"sword",32);
        Paintings paintings = new Paintings("Unknown", 20, "sharp", "Destruction", 1000, 1043,"sword",32);
        ExhibitWriter.inputStaticTextToFile("text.csv", weapons.toCSV(), paintings.toCSV());
    }

    @Test
    public void outputManager() throws IOException {
        ExhibitWriter.outputStaticTextOfFile("text.csv");
    }

    @Test
    public void inputAndOutputTest() throws IOException {
        Weapons weapons = new Weapons("Italian author", 20, "sharp", "Destruction", 1000, 1043,"sword",32);
        Paintings paintings = new Paintings("Unknown", 20, "sharp", "Destruction", 1000, 1043,"sword",32);
        ExhibitWriter.inputStaticTextToFile("text.csv", weapons.toCSV(), paintings.toCSV());
        ExhibitWriter.outputStaticTextOfFile("text.csv");
    }

    @Test
    public void stringWriterTest() throws IOException {
        try {
            Weapons weapons = new Weapons("Unknown", 20, "sharp", "Destruction", 1000, 1043,"sword",32);
            ExhibitWriter productStringWriter = new ExhibitWriter(new StringWriter());
            productStringWriter.inputText(weapons.toCSV());
            String expectedExpression = weapons.toCSV() + "\r\n";
            Assertions.assertEquals(expectedExpression, productStringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
