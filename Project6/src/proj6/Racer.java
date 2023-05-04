package proj6;
import java.util.ArrayList;
import java.util.Objects;

/*
Things to add: export stats somehow, both for the horse and for the race itself.
 */
class Racer extends Thread{
    public int run(Horse horse, Track track)
        {
            try {
                boolean finish = false;
                int section = 0;
                int time = 0;//For now, our method of recording how fast a horse finishes is just a integer counter
                int distance = track.getSection(section).getDistance();
                int extra = 0;//For when a horse goes over
                while (!finish){
                    if (distance == 0){//If we've finished a section, advance to the next
                        section++;
                        distance = track.getSection(section).getDistance();
                        if (distance == 0) {//If we hit the last section, distance should be 0 again
                            finish = true;
                            break;
                        }
                    }
                    int movement = Move(horse.getSpeed(), horse.getAgility(), horse.getEndurance(), track.getSection(section).getShape());
                    if (movement > distance){extra = movement - distance;}
                    horse.setEndurance(horse.getEndurance() - getTired(movement, extra, horse.getTrait()));
                    distance = distance - movement;
                    if (distance < 0){distance = 0;}
                    time += 1;
                }
                System.out.println("Horse " + horse.getHorseName() + " has finished the race!");
                return time;
            }
            
            finally {
                
            }
        }
        public int Move(int speed, int agility, int endurance, String section){//calculation to see how far a horse moves. Not final, just easy for now
            if (Objects.equals(section, "Straight")){return speed * endurance;}//Straights are just dashes
            else { return speed * agility * endurance;}//Curves check a horse's agility
        }
        public int getTired(int movement, int extra, String trait){//Calculates the loss of endurance for the horse
            int cost = movement % 10;//For now, endurance is simply 10% of the distance moved
            cost = cost - (extra % 10);//If the horse went past the length, refund some endurance
            //affect traits here, once we determine how we want them to happen
            return cost;
        }
}