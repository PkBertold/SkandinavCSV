/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skandinavcsv;
import java.io.*;
import java.util.Scanner;

// @author Crosshair

public class SkandinavCSV {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Crosshair\\Desktop\\Skandinav\\Data\\SkandinavLottoSzamok.csv"));  
        sc.useDelimiter(",");   // Sets the delimiter pattern
            while (sc.hasNext())  // Returns a boolean value
                {
                System.out.print(sc.next()+ "|");  // Find and returns the next complete token from this scanner
                }
                    sc.close();  // Closes the scanner
                }

}
    
