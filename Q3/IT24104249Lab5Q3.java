import java.util.Scanner;

public class IT24104249Lab5Q3 {
 public static void main(String[] args) {

   Scanner input= new Scanner(System.in);

   double discount;
   double totalpay =0;
   int res_days = 0;
   double disc_rate = 0; 
   final double room_charge = 48000.0; //room charge per day

   System.out.print("\nEnter the starting date(1-31): ");
   int start_day = input.nextInt();

   System.out.print("\nEnter the end date(1-31): ");
   int end_day = input.nextInt();
 
   if (( start_day <= 31) && (start_day >= 1 ) && ( end_day <= 31) && (end_day >= 1 ))  { 

      if (start_day < end_day ) {
       
        res_days = end_day - start_day;

            if ( res_days >= 5 ) {
                disc_rate = 0.2; }

            else if ( res_days >= 3 ) {
                disc_rate = 0.1; }
        
            else if ( res_days >= 1 ) {
                disc_rate = 0; }

                discount = room_charge * disc_rate;
                
                totalpay = room_charge - discount; 

                System.out.println("room charge per day: Rs." +room_charge );
                System.out.println("number of days reserved:"+ res_days );
                
                System.out.println("total amount to be paid: " + totalpay);     
      
            } else  { System.out.println("Error: Start day should not exceed the end day"); }
     
             
  
           
           
        } else { System.out.println("Error:days must be between 1 and 31"); } 

        

      }
     }
  





  