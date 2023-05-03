package proj6;
import java.util.*;

public class Track {
    private ArrayList<TrackS> sections = new ArrayList<>();
    private static Track instance;

    public void addSection(TrackS section) {
        this.sections.add(section);
    }

    public TrackS getSection(int idx) {
        return this.sections.get(idx);
    }

    private Track(int numOfSections) {
        for (int i = 0; i < numOfSections; i++) {
            TrackS section = new TrackS(false);
            addSection(section);
        }
        TrackS finish = new TrackS(true);
        addSection(finish);
    }

    public static Track getInstance(int numOfSections) {
        if (instance == null){
            instance = new Track(numOfSections);
        }

        return instance;
    }
}
