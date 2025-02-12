//Dallin Lyman
//takes a file and gets the average frequency, and total percentage
package sd2;
import java.io.File;//imports
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenz {
    public static void main(String[] args) {
        float cit=0;//variables for totals
        float cit0=0;
        float cit1=0;
        float cit01=0;
         try {
      File File0 = new File("letter_frequency.csv");//new file read
      Scanner Read = new Scanner(File0);//new scanner
      while (Read.hasNextLine()) {//reads the next file line
        String data = Read.nextLine();
        StringTokenizer st = new StringTokenizer(data," ");//separates the data 
      while (st.hasMoreTokens()) {//reads the tokens and prints them
            String i = st.nextToken().replace(",","");//makes the next token a variable, and removes commas
            if(false==i.contains("\"")){//tests if the words have quotes
            float ci = Float.parseFloat(i);//changes the variable into a float
            if(ci>=101){//frequencies
                cit+=ci;
                cit0++;
            }
            if(ci<=100){//percents
                cit01+=ci;
            }}
            System.out.println(i);//prints the variable
            }
        }
      Read.close();
         }
     catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    cit1=cit/cit0;//average
    System.out.println("Totals:");//prints the totals
    System.out.println("Average Frequency: "+cit1);
    System.out.println("Total Percent: "+cit01);
    }
}