/**
   This class represents the Policy information for a user
*/
public class Policy
{
   private int number;
   private String providerName;
   
   public Policy() {
   }
   
   /**
      Constructor that accepts arguments
      @param number The policy number of the user
      @param providerName The name of the name of the provider for the policy
   */
   public Policy(int number, String providerName) {
   this.number = number;
   this.providerName = providerName;
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
      Calculates the policy price
      @param policyHolder The PolicyHolder object containing height and weight
      @return The policy price of the user
   */
   public double policyPrice(PolicyHolder policyHolder) {
      double policyPrice = 600;
      if (policyHolder.getAge() > 50) {
         policyPrice += 75;
      }
      
      if (policyHolder.getSmoker().equalsIgnoreCase("smoker")) {
         policyPrice +=100; 
      }
      
      if (policyHolder.bmi() > 35) {
         policyPrice += ((policyHolder.bmi()-35)*20);
      }
      return policyPrice;
   }
}