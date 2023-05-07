package proj6;
import java.util.*;

class RaceRunner {

    public static void runRace(ArrayList<Horse> Horses, Track Racetrack) {
        Map<Horse, Integer> placings = new HashMap<Horse, Integer>();
        for (int i = 0; i < 8; i++) {
            Racer object = new Racer();
            int temp = 0;
            object.start();
            temp = object.run(Horses.get(i), Racetrack);
            placings.put(Horses.get(i), temp);
            System.out.println("Horse " + Horses.get(i).getHorseName() + " finished with a time of: " + temp);
        }
        standings(placings);
    }

    public static void standings(Map<Horse, Integer> placing) {
        Horse firstP = null;
        int first = 10000;
        Horse secondP = null;
        int second = 10000;
        Horse thirdP = null;
        int third = 10000;
        /*
        Logic here: loop through the map of horse, score pairs, checking to see if a score is better, starting at third.
        if a score is better, continue checking, we're looking for the best position possible. Once it finds a spot where
        it's score is better but the next position is faster(or we hit first), check to see if the position is held by
        another horse. Set the current horse to the found position, then move every other horse back up(So, if first, replace
        first with the new horse, set first to second, and second to third). In case of a tie in time, compare horse speed
        to elect a winner. If this is also a tie, flip a coin, 0 for the new horse, 1 for the current holder of the position.
        All of this happens in reverse, with a truth value stored to ensure we don't double set things.
         */
        for (Map.Entry<Horse, Integer> entry : placing.entrySet()) {
            boolean secondSpot = false;
            boolean thirdSpot = false;
            //For holding positions as they move.
            Horse tempHorse = null;
            int tempTime = -1;
            //System.out.println("Current Horse: " + entry.getKey().getHorseName());
            //System.out.println("Current Time " + entry.getValue());
            //System.out.println("Old Horse and time: " + first + " " + firstP);
            /*
            Logic on if statements. Blarg. First we check if the current horse time is better than the placing, or if no
            horse has yet placed. If either is true, we then have a second check where we ensure either the horses didn't
            tie, or if they did, then the new horse is faster. If either is true, we move on, if not, we leave.
             */
            if (thirdP == null || third >= entry.getValue()) {
                if ((third != entry.getValue() || tie(thirdP, entry.getKey()))) {
                    //System.out.println("Made it to third");
                    if (secondP == null || (second >= entry.getValue())) {
                        if ((second != entry.getValue() || tie(secondP, entry.getKey()))) {
                            thirdSpot = true;

                            if (firstP == null || (first >= entry.getValue())) {
                                if ((first != entry.getValue() || tie(firstP, entry.getKey()))) {
                                    //System.out.println("Woooo");
                                    secondSpot = true;
                                    tempHorse = firstP;
                                    tempTime = first;
                                    firstP = entry.getKey();
                                    first = entry.getValue();
                                }
                            }
                            if (secondSpot) {//If secondSpot is true, we need to rotate horses, if not, just swap second
                                Horse secondTH = secondP;
                                int secondTS = second;
                                secondP = tempHorse;
                                second = tempTime;
                                tempHorse = secondTH;
                                tempTime = secondTS;
                            } else {
                                tempHorse = secondP;
                                tempTime = second;
                                secondP = entry.getKey();
                                second = entry.getValue();
                            }
                        }
                        if (thirdSpot) {//same deal as above, if third is true, we need to rotate
                            thirdP = tempHorse;
                            third = tempTime;
                        } else {
                            thirdP = entry.getKey();
                            third = entry.getValue();
                        }
                    }
                }
            }
        }
        Random endur = new Random();
        for (Map.Entry<Horse, Integer> entry : placing.entrySet()) {
            if (entry.getKey() == firstP || entry.getKey() == secondP || entry.getKey() == thirdP){
                entry.getKey().setWins(1);
            }
            else{entry.getKey().setLosses(1);}
            //Restore some endurance to each horse for the next race
            entry.getKey().setEndurance(entry.getKey().getEndurance() + endur.nextInt(10,30+1));
        }
        System.out.println(firstP.getHorseName() + " comes in first with a time of " + first);
        System.out.println(secondP.getHorseName() + " comes in second with a time of " + second);
        System.out.println(thirdP.getHorseName() + " comes in third with a time of " + third);
    }
    public static boolean tie(Horse first, Horse second){
        if (first == null){return true;}
        if (first.getSpeed() < second.getSpeed()) {//Look at their speed and give it to the faster one
            return true;
        } else if (first.getSpeed() > second.getSpeed()) {
            return false;
        } else {//If their speed is equal, flip a coin
            Random coin = new Random();
            int flip = coin.nextInt(2);
            //If we flip 0, current winner stays
            return flip == 1;
        }
    }
}