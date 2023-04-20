package proj6;
import java.util.ArrayList;
import java.util.Scanner;

public class HorseRacing {
    private ArrayList<Horse> horses = new ArrayList<>(null);
    
    // Incomplete
    public void trackChoice() {
        System.out.println("Press 1 to create custom track");
        System.out.println("Press 2 to create random track");

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (input == "1") {

        }
        else if (input == "2") {

        }
        else {
            System.out.println("Invalid input");
        }
    }
}
