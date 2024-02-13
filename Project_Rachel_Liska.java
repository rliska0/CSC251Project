import java.util.Scanner;
import java.io.*;

public class Project_Rachel_Liska
{
   public static void main(String[] args) 
   {
   Scanner keyboard = new Scanner(System.in);
   
   int number;
   String providerName;
   String firstName;
   String lastName;
   int age;
   String smoker;
   double height;
   double weight;
   
   System.out.print("Please enter the Policy Number: ");
   number = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("Please enter the Provider Name: ");
   providerName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's First Name: ");
   firstName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   lastName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Age: ");
   age = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   smoker = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Height (in inches): ");
   height = keyboard.nextDouble();
   keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Weight (in pounds): ");
   weight = keyboard.nextDouble();
   keyboard.nextLine();
   
   Policy userPolicy = new Policy();
   userPolicy.setNumber(number);
   userPolicy.setProviderName(providerName);
   userPolicy.setFirstName(firstName);
   userPolicy.setLastName(lastName);
   userPolicy.setAge(age);
   userPolicy.setSmoker(smoker);
   userPolicy.setHeight(height);
   userPolicy.setWeight(weight);
   
   double policyPrice = userPolicy.policyPrice();
   
   System.out.println();
   System.out.println("Policy Number: " + number);
   System.out.println("Provider Name : " + providerName);
   System.out.println("Policyholder's First Name: " + firstName);
   System.out.println("Policyholder's Last Name: " + lastName);
   System.out.println("Policyholder's Age: " + age);
   System.out.println("Policyholder's Smoking Status: " + smoker);
   System.out.println("Policyholder's Height: " + height);
   System.out.println("Policyholder's Weight: " + weight);
   System.out.printf("Policyholder's BMI: %.2f%n", + userPolicy.bmi());
   System.out.printf("Policy Price: $%.2f%n", policyPrice); 
   
   keyboard.close();
   }
}