public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // A no-arg constructor that sets the default values for all fields.
   public PolicyHolder()
   {
      // Default fields
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
      A constructor that accepts arguments.
      @param firstName The policyholder's first name
      @param lastName The policyholder's last name
      @param age The policyholder's age
      @param smokingStatus The policyholder's smoking status
      @param height The policyholder's height
      @param weight The policyholder's weight
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /**
      Copy Constructor that returns a copy of the PolicyHolder object
      @param obj2 The PolicyHolder to return a copy of
   */
   public PolicyHolder(PolicyHolder obj2)
   {
      this.firstName = obj2.firstName;
      this.lastName = obj2.lastName;
      this.age = obj2.age;
      this.smokingStatus = obj2.smokingStatus;
      this.height = obj2.height;
      this.weight = obj2.weight;
   }   
   
   // SETTERS
      
   /**
      The setFirstName method sets the policyholder's first name.
      @param firstName The policyholder's first name
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /**
      The setLastName method sets the policyholder's last name.
      @param lastName The policyholder's last name
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   /**
      The setAge method sets the policyholder's age.
      @param age The policyholder's age
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
   /**
      The setSmokingStatus method sets the policyholder's smoking status.
      @param smokingStatus The policyholder's smoking status
   */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   /**
      The setHeight method sets the policyholder's height.
      @param height The policyholder's height
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   /**
      The setWeight method sets the policyholder's weight.
      @param weight The policyholder's weight
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   // GETTERS
      
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
      The toString method returns the information of the PolicyHolder
      @return A String that describes the PolicyHolder
   */
   public String toString()
   {
      return String.format("Policyholder's First Name: " + firstName + 
                           "\nPolicyholder's Last Name: " + lastName + 
                           "\nPolicyholder's Age: " + age +
                           "\nPolicyholder's Smoking Status: " + smokingStatus +
                           "\nPolicyholder's Height: " + height + " inches" +
                           "\nPolicyholder's Weight: " + weight + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , getBMI());
   }
}