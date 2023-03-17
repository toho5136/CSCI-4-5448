import java.io.*;
public class Logger extends Observer{
    private static Logger logger;

    private Logger(FNCD fncd){
        this.fncd = fncd;
        this.fncd.attach(this);
    }

    public static Logger getInstance(FNCD fncd){
      if (logger == null){
        logger = new Logger(fncd);
      }

      return logger;
    }

    @Override
    public void update(int days, double payed, double addedFunds){
        String fileName = "src/LoggerFiles/Logger-" + Integer.toString(days) + ".txt";

        File myFile = new File(fileName);

        try {
            FileWriter myWriter = new FileWriter(fileName, true);
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
