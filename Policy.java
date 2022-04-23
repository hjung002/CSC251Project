/**
   The Policy class has an insurance policy data. 
*/

public class Policy
{
   // Fields
   private String policyNumber;     
   private String providerName;     
   
   // A no-arg constructor that sets the default values for all fields.
   public Policy()
   {
      // Default fields
      policyNumber = "";
      providerName = "";
   }
   
   /**
      A constructor that accepts arguments.
      @param pn The policy number
      @param pvn The provider name
   */
   public Policy(String pn, String pvn)
   {
      policyNumber = pn;
      providerName = pvn;
   }
   
   // SETTERS
   
   /**
      The setPolicyNumber method sets the policy number.
      @param pn The policy number
   */
   public void setPolicyNumber(String pn)
   {
      policyNumber = pn;
   }
   
   /**
      The setProviderName method sets the provider name.
      @param pvn The provider name
   */
   public void setProviderName(String pvn)
   {
      providerName = pvn;
   }
      
   // GETTERS
   
   /**
      The getPolicyNumber method returns the policy number.
      @return The policy number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      The getProviderName method returns the provider name.
      @return The provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
      
   /**
      The getPrice method returns the price of the insurance policy.
      @return The price of the insurance policy
   */
   public double getPrice()
   {
      final double BASE_FEE = 600;
      final double OVER_AGE_LIMIT_FEE = 75;
      final double SMOKER_FEE = 100;
      final double BMI_FEE = 20;
      final int AGE_LIMIT = 50;
      final int BMI_LIMIT = 35;
      
      double price = BASE_FEE;
      
      // Calculate all the additional fees and add them to the base fee to return the insurance policy price.
      if(age >= AGE_LIMIT)
      {
         price += OVER_AGE_LIMIT_FEE;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         price += SMOKER_FEE;
      }
      
      if(getBMI() >= BMI_LIMIT)
      {
         price += (getBMI()-BMI_LIMIT) * BMI_FEE;
      }
      
      return price;
   }
   
   // Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
}