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
   
   @Override
   public String toString() {
      return "Policy Number: " + number + "\nProvider Name: " + providerName;
   }
}