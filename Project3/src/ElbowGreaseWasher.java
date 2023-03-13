import java.util.concurrent.ThreadLocalRandom;

public class ElbowGreaseWasher implements Washer{
    @Override
    public String washCar(String cleanliness){
        if (cleanliness == "Dirty"){
            int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int breakRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (breakRoll < 11){
                return "Like New";
            }
            else if (washRoll < 71){
                return "Clean";
            }
            else if (washRoll > 95){
                return "Sparkling";
            }
            else {
                return "Dirty";
            }
        }
        else if (cleanliness == "Clean"){
            int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int breakRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (breakRoll < 11){
                return "Like New";
            }
            else if (washRoll < 16){
                return "Dirty";
            }
            else if (washRoll > 75){
                return "Sparkling";
            }
            else {
                return "Clean";
            }
        }

        return "";
    }
}