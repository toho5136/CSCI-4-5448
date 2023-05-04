package proj6;
import java.util.concurrent.ThreadLocalRandom;

public class main {
	public static void main(String[] args) {
		// Create a new HorseObserver
		HorseObserver observer = new HorseObserver();

		// Create some horses and add them to the observer
		Horse horse1 = HorseFactory.createHorse("Secretariat");
		Horse horse2 = HorseFactory.createHorse("Seabiscuit");
		Horse horse3 = HorseFactory.createHorse("American Pharoah");

		observer.addHorse(horse1);
		observer.addHorse(horse2);
		observer.addHorse(horse3);

		// Notify the horses
		observer.notifyHorses();
	}
}