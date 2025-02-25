//Dallin Lyman
//takes a file and gets the average frequency, and total percentage
package sd2;
import java.io.File;//imports
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenz {
    public static void main(String[] args) {
        float cit = 0;//variables for totals, cit is the total frequency added up
        float cit0 = 0;//cit0 is the amount of frequency variables
        float cit1 = 0;//cit1 is the average of the frequencies
        float cit01 = 0;//cit01 is the total of the percents
        boolean newline = false;//boolean to make the line jump to the next line
         try {
      File File0 = new File("letter_frequency.csv");//new file read
      Scanner Read = new Scanner(File0);//new scanner
      while (Read.hasNextLine()) {//reads the next file line
        String data = Read.nextLine();
        StringTokenizer st = new StringTokenizer(data," ");//separates the data 
      while (st.hasMoreTokens()) {//reads the tokens and prints them
            newline = false;
            String tokn = st.nextToken().replace(",","");//makes the next token a variable, and removes commas
            if(false==tokn.contains("\"")){//tests if the words have quotes
            float ci = Float.parseFloat(tokn);//changes the variable into a float
            if(ci>=101){//adds the frequency to the total frequency and gets the total number of frequencies
                cit+=ci;
                cit0++;
            }
            if(ci<=100){//adds all of the percents together
                cit01+=ci;
                newline = true;
            }}
            if (newline==true){//prints the variable. If the variable is a percent then it prints a new line 
                System.out.println(tokn);
            } else {
                System.out.print(tokn+"    ");
            }
            }
        }
      Read.close();
         }
     catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    cit1=cit/cit0;//finding average and storing it in cit1
    System.out.println("Totals:");//prints the totals
    System.out.println("Average Frequency: "+cit1);
    System.out.println("Total Percent: "+cit01);
    }
}