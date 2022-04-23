/**
   The Policy class has an insurance policy data. 
*/

public class Policy
{
   // Fields
   private String policyNumber;     
   private String providerName;     
   
   public static int numOfPolicies = 0; // Static field to keep track of the number of Policy objects
   
   // A no-arg constructor that sets the default values for all fields.
   public Policy()
   {
      // Default fields
      policyNumber = "";
      providerName = "";
      numOfPolicies++;
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
      numOfPolicies++;
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
   
   /**
      @return A String that describes the Policy
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\nPolicy Price: $%.2f", getPrice());
   }
}