/**
   This class represents the PolicyHolder information for a user
*/
public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smoker;
   private double height;
   private double weight;
   
   public PolicyHolder() {
   }
   
   /**
      Constructor that accepts arguments
      @param firstName The first name of the user
      @param lastName The last name of the use
      @param age The age of the user
      @param smoker Whether or not the user is a smoker
      @param height The height of the user
      @param weight The weight of the user
   */
   public PolicyHolder(String firstName, String lastName, int age, String smoker, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smoker = smoker;
      this.height = height;
      this.weight = weight;
   }
   
   /**
      @param firstName The first name of the user
   */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   /**
      @param lastName The last name of the user
   */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   /**
      @param age The age of the user
   */
   public void setAge(int age) {
      this.age = age;
   }
   
   /**
      @param smoker Whether or not the user is a smoker
   */
   public void setSmoker(String smoker) {
      this.smoker = smoker;
   }
   
   /**
      @param height The height of the user
   */
   public void setHeight(double height) {
      this.height = height;
   }
   
   /**
      @param weight The weight of the user
   */
   public void setWeight(double weight) {
      this.weight = weight;
   }
   
   /**
      @return firstName The first name of the user
   */
   public String getFirstName() {
      return firstName;
   }
   
   /**
      @return lastName The last name of the user
   */
   public String getLastName() {
      return lastName;
   }
   
   /**
      @return age The age of the user
   */
   public int getAge() {
      return age;
   }
   
   /**
      @return smoker Whether or not the user is a smoker
   */
   public String getSmoker() {
      return smoker;
   }
   
   /**
      @return height The height of the user
   */
   public double getHeight() {
      return height;
   }
   
   /**
      @return weight The weight of the user
   */
   public double getWeight() {
      return weight;
   }
   
   /**
      Calculates the bmi of the user
      @return The bmi of the user
   */
   public double bmi() {
      return ((weight*703)/(height*height));
   }
      
   /**
      Calculates the policy price
      @return The policy price of the user
   */
   public double policyPrice() {
      double policyPrice = 600;
      if (age > 50) {
         policyPrice += 75;
      }
      
      if (smoker.equalsIgnoreCase("smoker")) {
         policyPrice +=100; 
      }
      
      if (bmi() > 35) {
         policyPrice += ((bmi()-35)*20);
      }
      return policyPrice;
   }
   
   @Override
   public String toString() {
      return "Policyholder's First Name: " + firstName + "\nPolicyholder's Last Name: " + lastName + "\nPolicyholder's Age: " + age + "\nPolicyholder's Smoking Status (smoker/non-smoker): " + smoker + 
      "\nPolicyholder's Height: " + height + " inches" + "\nPolicyholder's Weight: " + weight + " pounds" + "\nPolicyholder's BMI: " + String.format("%.2f%n", bmi()) + "Policy Price: " + String.format("$%.2f%n", policyPrice());
   }
}