package sd2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenz {
    public static void main(String[] args) {
        float cit=0;
        float cit0=0;
        float cit1=0;
        float cit01=0;
         try {
      File File0 = new File("letter_frequency.csv");
      Scanner Read = new Scanner(File0);
      while (Read.hasNextLine()) {
        String data = Read.nextLine();
        StringTokenizer st = new StringTokenizer(data," ");
      while (st.hasMoreTokens()) {
            String i = st.nextToken().replace(",","");;

            if(false==i.contains("\"")){
            float ci = Float.parseFloat(i);
            if(ci>=101){
                cit+=ci;
                cit0++;
            }
            if(ci<=100){
                cit01+=ci;
            }}
            System.out.println(i);
            }
        }
      Read.close();
         }
     catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    cit1=cit/cit0;
    System.out.println("Totals:");
    System.out.println("Average Frequency: "+cit1);
    System.out.println("Total Percent: "+cit01);
    }
}