import java.util.Scanner;

public class IT24104249Lab5Q1 {
  
   public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    
     System.out.print("\nEnter the first integer: ");
     int num1 = input.nextInt();

     System.out.print("\nEnter the second integer: ");
     int num2 = input.nextInt();

     System.out.print("\nEnter the third integer: ");
     int num3 = input.nextInt();

     
     System.out.print("\n\nUser entered numbers are: "+num1+"  "+num2+"  "+num3);


     if (num1>num2) {

       if (num2>num3) {
          System.out.print("\nThe smallest number is: "+ num3);
          System.out.print("\nThe largest number is: "+ num1); }

            else if (num1>num3) {
               System.out.print("\nThe largest number is: "+ num1);
               System.out.print("\nThe smallest number is: "+ num2); }
               
                  else { System.out.print("\nThe largest number is: "+ num3);
                         System.out.print("\nThe smallest number is: "+ num2); }
            
                      } 


       else if  (num1>num3) {
                System.out.print("\nThe smallest number is: "+ num3);
                System.out.print("\nThe largest number is: "+ num2); }
          
             else if (num2>num3) {
                System.out.print("\nThe smallest number is: "+ num1);
                System.out.print("\nThe largest number is: "+ num2); }

                   else { System.out.print("\nThe smallest number is: "+ num1);
                        System.out.print("\nThe largest number is: "+ num3); }

                         
     }
 
 }
                