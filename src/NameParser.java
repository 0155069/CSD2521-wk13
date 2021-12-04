/*
 *  Author: Sophia Stevens
 *  Date:   11/23/2021
 *  Program displays either first and last name or 
 *  first, middle, and last name entered by user
*/

import java.util.Scanner;

public class NameParser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Requests user's information
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        name = name.trim();
        
        int index1 = name.indexOf(" ");
        if (index1 == -1) {
            // Informs user that they did not give enough input
            System.out.println("Name not in valid format.");
        }else{
            
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1){
                
                // collects first and last name from user
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                
                // Displays first and last name
                System.out.println("First name: " + firstName);
                System.out.println("Last name: " + lastName);
            }else { 
                
                // Adds middle name when entered
                int index3 = name.indexOf(" ", index2 +1 );
                if (index3 == -1){
                    
                    // Collects first, middle, and last name from user
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    // Combines first, middle, and last names
                    System.out.println("First name: " + firstName);
                    System.out.println("Middle name: " + middleName);
                    System.out.println("Last name: " + lastName);
                    
                }else {
                    // Lets user know that that they have not entered correct 
                    // information
                    System.out.println("Name is not in valid format.");
                }
            }
        }
    }
}
