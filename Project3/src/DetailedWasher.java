import java.util.concurrent.ThreadLocalRandom;

public class DetailedWasher implements Washer{
    @Override
    public String washCar(String cleanliness){
        if (cleanliness == "Dirty"){
            int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (washRoll < 61){
                return "Clean";
            }
            else if (washRoll > 80){
                return "Sparkling";
            }
            else {
                return "Dirty";
            }
        }
        else if (cleanliness == "Clean"){
            int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (washRoll < 6){
                return "Dirty";
            }
            else if (washRoll > 60){
                return "Sparkling";
            }
            else {
                return "Clean";
            }
        }

        return "";
    }
}