package ua.lviv.iot.manager;


import ua.lviv.iot.model.Exhibits;
import java.util.LinkedList;
import java.util.List;

public class ExhibitManager {

    private List<Exhibits> exhibits = new LinkedList<>();

    public ExhibitManager(List<Exhibits> exhibits) {
        this.exhibits = exhibits;

    }

    public ExhibitManager() {

    }

    public void addExhibits(Exhibits exhibits) {
        this.exhibits.add(exhibits);
    }

    public List<Exhibits> getExhibitByDecade(int decade) {
        List<Exhibits> result = new LinkedList<>();
        for (Exhibits exhibits : exhibits) {
            if (exhibits.getDecade() == decade) {
                result.add(exhibits);
            }
        }
        return result;

    }

}
