/**
   This class represents the Policy information for a user
*/
public class Policy
{
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smoker;
   private double height;
   private double weight;
   
   public Policy() {
   }
   
   /**
      Constructor that accepts arguments
      @param number The policy number of the user
      @param providerName The name of the name of the provider for the policy
      @param firstName The first name of the user
      @param lastName The last name of the use
      @param age The age of the user
      @param smoker Whether or not the user is a smoker
      @param height The height of the user
      @param weight The weight of the user
   */
   public Policy(int number, String providerName, String firstName, String lastName, int age, String smoker, double height, double weight) {
   this.number = number;
   this.providerName = providerName;
   this.firstName = firstName;
   this.lastName = lastName;
   this.age = age;
   this.smoker = smoker;
   this.height = height;
   this.weight = weight;
   }
   
   /**
      @param number The policy number of the user
   */
   public void setNumber(int number) {
      this.number = number;
   }
   
   /**
      @param providerName The name of the name of the provider for the policy
   */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
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
      @return number The policy number of the user
   */
   public int getNumber() {
      return number;
   }
   
   /**
      @return providerName The name of the name of the provider for the policy
   */
   public String getProviderName() {
      return providerName;
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
      
      if (smoker.equals("smoker")) {
         policyPrice +=100; 
      }
      
      if (bmi() > 35) {
         policyPrice += ((bmi()-35)*20);
      }
      return policyPrice;
   }
}