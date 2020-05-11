package ua.lviv.iot.manager;


import org.junit.jupiter.api.Test;
import ua.lviv.iot.IOManager.ExhibitWriter;
import ua.lviv.iot.model.Paintings;
import ua.lviv.iot.model.Weapons;
import java.io.IOException;

public class TestLab5 {
    @Test
    public void inputManager() throws IOException {
        Weapons weapons = new Weapons("Paulo Benichi", 20, "sharp", "Rubler", 1000, 1020, "sword", 1000);
        Paintings paintings = new Paintings("Unknown", 14, "amusing", "peace", 2000, 1986, "classic", 34);
        ExhibitWriter.inputStaticTextToFile("text.csv", weapons.toCSV(), paintings.toCSV());
    }

    @Test
    public void outputManager() throws IOException {
        ExhibitWriter.outputStaticTextOfFile("text.csv");
    }

    @Test
    public void inputAndOutputTest() throws IOException {
        Weapons weapons = new Weapons("Italian author", 20, "sharp", "Beriila", 1000, 1520, "sword", 500);
        Paintings paintings = new Paintings("Unknown", 4, "beautiful painting", "De-monte", 2000, 2000, "contemporary", 20);
        ExhibitWriter.inputStaticTextToFile("text.csv", weapons.toCSV(), paintings.toCSV());
        ExhibitWriter.outputStaticTextOfFile("text.csv");
    }
}
