/**
   The Policy class has an insurance policy data. 
*/

public class Policy
{
   // Fields
   private String policyNumber;     
   private String providerName;     
   private String firstName;        
   private String lastName;         
   private int age;                 
   private String smokingStatus;    
   private double height;           
   private double weight;           
   
   // A no-arg constructor that sets the default values for all fields.
   public Policy()
   {
      // Default fields
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
      A constructor that accepts arguments.
      @param pn The policy number
      @param pvn The provider name
      @param fn The policyholder's first name
      @param ln The policyholder's last name
      @param a The policyholder's age
      @param ss The policyholder's smoking status
      @param h The policyholder's height
      @param w The policyholder's weight
   */
   public Policy(String pn, String pvn, String fn, String ln, int a, String ss, double h, double w)
   {
      policyNumber = pn;
      providerName = pvn;
      firstName = fn;
      lastName = ln;
      age = a;
      smokingStatus = ss;
      height = h;
      weight = w;
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
   
   /**
      The setFirstName method sets the policyholder's first name.
      @param fn The policyholder's first name
   */
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   
   /**
      The setLastName method sets the policyholder's last name.
      @param ln The policyholder's last name
   */
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   
   /**
      The setAge method sets the policyholder's age.
      @param a The policyholder's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      The setSmokingStatus method sets the policyholder's smoking status.
      @param ss The policyholder's smoking status
   */
   public void setSmokingStatus(String ss)
   {
      smokingStatus = ss;
   }
   
   /**
      The setHeight method sets the policyholder's height.
      @param h The policyholder's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      The setWeight method sets the policyholder's weight.
      @param w The policyholder's weight
   */
   public void setWeight(double w)
   {
      weight = w;
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
      The getFirstName method returns the policyholder's first name.
      @return The policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      The getLastName method returns the policyholder's last name.
      @return The policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      The getAge method returns the policyholder's age.
      @return The policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
      The getSmokingStatus method returns the policyholder's smoking status.
      @return The policyholder's smoking status
   */

   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
      The getHeight method returns the policyholder's height.
      @return The policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
      The getWeight method returns the policyholder's weight.
      @return The policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
      The getBMI method returns the BMI of the policyholder.
      @return The BMI of the policyholder
   */
   public double getBMI()
   {
      return (weight * 703) / (height * height);
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