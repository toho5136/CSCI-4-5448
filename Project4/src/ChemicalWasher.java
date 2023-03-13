import java.util.concurrent.ThreadLocalRandom;

public class ChemicalWasher implements Washer{
    @Override
    public String washCar(String cleanliness){
        if (cleanliness == "Dirty"){
            int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int breakRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (breakRoll < 11){
                return "Broken";
            }
            else if (washRoll < 81){
                return "Clean";
            }
            else if (washRoll > 90){
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
                return "Broken";
            }
            else if (washRoll < 11){
                return "Dirty";
            }
            else if (washRoll > 80){
                return "Sparkling";
            }
            else {
                return "Clean";
            }
        }
        
        return "";
    }
}