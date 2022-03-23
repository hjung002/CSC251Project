import java.util.Scanner;

public class Project_HANUL_JUNG
{
   public static void main(String[] args)
   {
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      // Creates a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
   
      // Prompt the user to enter information about the Policy   
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      
      // Consume the remaining newline
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      // Create an instance of the Policy class, passing the data that was entered as arguments to the constructor
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // Put a blank line before the output
      System.out.println();
      
      // Display information about the Policy
      policy.displayInformation();
   }
}