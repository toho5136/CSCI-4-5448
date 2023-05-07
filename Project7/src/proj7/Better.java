package proj7;
import java.util.concurrent.ThreadLocalRandom;

public class Better {
    private int money;
    private int biasPoints;
    private String horseBreed;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int mon) {
        money = mon;
    }

    public int getBiasPoints() {
        return this.biasPoints;
    }

    public void setBiasPoints(int points) {
        biasPoints = points;
    }

    public String getHorseBreed() {
        return this.horseBreed;
    }

    public void setHorseBreed(String name) {
        horseBreed = name;
    }

    public Better() {
        int moneyRoll = ThreadLocalRandom.current().nextInt(10000, 100000);
        int biasRoll = ThreadLocalRandom.current().nextInt(1, 16);
        int bias = 7 + biasRoll;
        int breedRoll = ThreadLocalRandom.current().nextInt(1, 6);

        setMoney(moneyRoll);
        setBiasPoints(bias);
        
        if (breedRoll == 1) {
            setHorseBreed("Thoroughbred");
        }
        else if (breedRoll == 2) {
            setHorseBreed("Arabian");
        }
        else if (breedRoll == 3) {
            setHorseBreed("QuarterHorse");
        }
        else if (breedRoll == 4) {
            setHorseBreed("Andalusian");
        }
        else if (breedRoll == 5) {
            setHorseBreed("Clydesdale");
        }
    }
}
