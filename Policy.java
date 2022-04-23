/**
   The Policy class has an insurance policy data. 
*/

public class Policy
{
   // Fields
   private String policyNumber;     
   private String providerName;     
   private PolicyHolder ph; // Aggregation "Has a"
   
   public static int numOfPolicies = 0; // Static field to keep track of the number of Policy objects               
   
   /**
      A no-arg constructor that sets the default values for all fields.
   */
   public Policy()
   {
      // Default fields
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }
   
   /**
      A constructor that accepts arguments.
      @param policyNumber The policy number
      @param providerName The provider name
      @param ph The PolicyHolder for the policy
   */
   public Policy(String policyNumber, String providerName, PolicyHolder ph)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.ph = new PolicyHolder(ph); // Create a deep copy using the PolicyHolder's copy constructor
      numOfPolicies++;
   }
   
   // SETTERS
   
   /**
      The setPolicyNumber method sets the policy number.
      @param policyNumber The policy number
   */
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   /**
      The setProviderName method sets the provider name.
      @param providerName The provider name
   */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
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
      The getPolicyHolder method returns the policyholder.
      @return The PolicyHolder for the policy
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(ph); // Return a copy of the PolicyHolder for the policy using the Copy Constructor
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
      if(ph.getAge() >= AGE_LIMIT)
      {
         price += OVER_AGE_LIMIT_FEE;
      }
      
      if(ph.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += SMOKER_FEE;
      }
      
      if(ph.getBMI() >= BMI_LIMIT)
      {
         price += (ph.getBMI()-BMI_LIMIT) * BMI_FEE;
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
                           "\n" + ph + // Implicitly calling the PolicyHolder's toString() method
                           "\nPolicy Price: $%.2f", getPrice());
   }
}