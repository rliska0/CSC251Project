import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Rachel_Liska
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File myFile = new File("PolicyInformation.txt");//read txt file
      ArrayList<Policy> policyHolders = new ArrayList<Policy>();
      int smokerTotal = 0;
      int nonSmokerTotal = 0;
      
      try {
         Scanner inputFile = new Scanner(myFile);
         
         while (inputFile.hasNextLine()) {
            int number = Integer.parseInt(inputFile.nextLine());
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = Integer.parseInt(inputFile.nextLine());
            String smoker = inputFile.nextLine();
               if (smoker.equalsIgnoreCase("smoker")) {
                  smokerTotal++;//add up smokers
               }
               if (smoker.equalsIgnoreCase("non-smoker")) {
                  nonSmokerTotal++;//add up non-smokers
               }
            double height = Double.parseDouble(inputFile.nextLine());
            double weight = Double.parseDouble(inputFile.nextLine());
            
            if (inputFile.hasNextLine()) {
               inputFile.nextLine();//skips over empty line in txt document
            }
            
            Policy policy = new Policy(number, providerName);
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smoker, height, weight);
            double policyPrice = policyHolder.policyPrice();
            double bmi = policyHolder.bmi();
            
            policyHolders.add(policy);
            
            System.out.println(policy.toString());
            System.out.println(policyHolder.toString());
            
            /*
            System.out.println();
            System.out.println("Policy Number: " + number);
            System.out.println("Provider Name: " + providerName);
            System.out.println("Policyholder's First Name: " + firstName);
            System.out.println("Policyholder's Last Name: " + lastName);
            System.out.println("Policyholder's Age: " + age);
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + smoker);
            System.out.println("Policyholder's Height: " + height + " inches");
            System.out.println("Policyholder's Weight: " + weight + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", bmi);
            System.out.printf("Policy Price: $%.2f%n", policyPrice); 
            */
         }
         inputFile.close();
      }
      catch (FileNotFoundException e) {
         System.err.println("File not found: " + e.getMessage());
      }
      System.out.println("\nThere were " + Policy.getNumPolicies() + " Policy objects created.");
      System.out.println("\nThe number of policies with a smoker is: " + smokerTotal);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerTotal);
   }
}