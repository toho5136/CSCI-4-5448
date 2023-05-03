package proj6;
import java.util.ArrayList;
class RaceRunner {

    public static void RaceRunner(ArrayList Horses, ArrayList Racetrack) {
        for (int i = 0; i < 8; i++){
            Racer object = new Racer(Horses[i], Racetrack);
            object.start();
        }
    }
}