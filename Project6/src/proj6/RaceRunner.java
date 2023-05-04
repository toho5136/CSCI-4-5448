package proj6;
import java.util.ArrayList;
class RaceRunner {

    public static void runRace(ArrayList<Horse> Horses, Track Racetrack) {
        for (int i = 0; i < 8; i++){
            Racer object = new Racer();
                    object.run(Horses.get(i), Racetrack);
            object.start();
        }
    }
}