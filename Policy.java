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
   
   /*
      Constructor that accepts arguments
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
   /*
   Mutator methods
   */
   public void setNumber(int number) {
      this.number = number;
   }
   
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public void setAge(int age) {
      this.age = age;
   }
   
   public void setSmoker(String smoker) {
      this.smoker = smoker;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   
   public void setWeight(double weight) {
      this.weight = weight;
   }
   /*
   Accessor methods
   */
   public int getNumber() {
      return number;
   }
   public String getProviderName() {
      return providerName;
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public int getAge() {
      return age;
   }
   public String getSmoker() {
      return smoker;
   }
   public double getHeight() {
      return height;
   }
   public double getWeight() {
      return weight;
   }
   
   public double bmi() {
      return ((weight*703)/(height*height));
   }
   
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