import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_HANUL_JUNG
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      // ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      // Create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // Process all information in the file
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         // Make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         // Create PolicyHolder and Policy object and add them to the ArrayList
         policyList.add(new Policy(policyNumber, providerName, new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight)));
      }
      
      // Print out information about each Policy object
      for(Policy policy : policyList)
      { 
          System.out.println(policy);
          System.out.println();
          if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) // Keep track of the number of smokers
          {  
            numSmokers++;
          }
      }
      
      // Print out the number of Policy objects
      System.out.println("There were " + Policy.numOfPolicies + " Policy objects created.");
      
      // Print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));     
   }
}