import java.io.*;
public class Logger extends Observer{
    public Logger(FNCD fncd){
        this.fncd = fncd;
        this.fncd.attach(this);
    }

    @Override
    public void update(int days, double payed, double addedFunds){
        if (days == 1){
            File myFile = new File("Logger.txt");
        }

        try {
            FileWriter myWriter = new FileWriter("Logger.txt", true);
            myWriter.write("\n" + "Day: " + days + "\n");
            myWriter.write("TotalSales: " + payed + "\n");
            myWriter.write("Funds Added: " + addedFunds + "\n");
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
