/**
   This class represents the Policy information for a user
*/
public class Policy
{
   private static int numPolicies = 0;
   private int number;
   private String providerName;
   private PolicyHolder policyHolder;
   
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
      this.policyHolder = policyHolder;
      numPolicies++;
   }
   
   public static int getNumPolicies() {
      return numPolicies;
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
   
   public Policy(PolicyHolder policyHolder) {
      this.policyHolder = policyHolder;
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
   
   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }
   
   @Override
   public String toString() {
      return "Policy Number: " + number + "\nProvider Name: " + providerName;
   }
}