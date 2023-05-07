package proj7;

import java.util.ArrayList;
import java.util.List;

public class HorseObserver {
    private List<Horse> horses = new ArrayList<>();

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public void removeHorse(Horse horse) {
        horses.remove(horse);
    }

    public void notifyHorses() {
        for (Horse horse : horses) {
        	System.out.println(horse.getHorseName() + "'s stats:");
        	System.out.println("Speed: " + horse.getSpeed());
        	System.out.println("Agility: " + horse.getAgility());
        	System.out.println("Endurance: " + horse.getEndurance());
        }
    }
}