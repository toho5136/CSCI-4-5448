package proj7;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class main {
	public static void main(String[] args) {
		// Create a new HorseObserver
		HorseObserver observer = new HorseObserver();
		ArrayList<Horse> RaceHorses = new ArrayList<Horse>();
		// Create some horses and add them to the observer
		Horse horse1 = HorseFactory.createHorse("Secretariat");
		RaceHorses.add(horse1);
		Horse horse2 = HorseFactory.createHorse("Seabiscuit");
		RaceHorses.add(horse2);
		Horse horse3 = HorseFactory.createHorse("American Pharoah");
		RaceHorses.add(horse3);
		Horse horse4 = HorseFactory.createHorse("Buddy");
		RaceHorses.add(horse4);
		Horse horse5 = HorseFactory.createHorse("Lucky");
		RaceHorses.add(horse5);
		Horse horse6 = HorseFactory.createHorse("Tidal Run");
		RaceHorses.add(horse6);
		Horse horse7 = HorseFactory.createHorse("Desert Wind");
		RaceHorses.add(horse7);
		Horse horse8 = HorseFactory.createHorse("Final Gambit");
		RaceHorses.add(horse8);

		observer.addHorse(horse1);
		observer.addHorse(horse2);
		observer.addHorse(horse3);
		observer.addHorse(horse4);
		observer.addHorse(horse5);
		observer.addHorse(horse6);
		observer.addHorse(horse7);
		observer.addHorse(horse8);

		// Notify the horses
		observer.notifyHorses();

		Track RaceTrack = Track.getInstance(7);
		RaceRunner.runRace(RaceHorses, RaceTrack);
	}
}