package OOPS_Project;
import java.util.*;

import DP43.catalan;

interface utility{
    public void get_detail();
    public void set_detail();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println(" #####  Welecome to Car Showroom Management System  #####");
        System.out.println();
        System.out.println("#####    Enter Your Choice   #####");
        System.out.println("(1) Add  Showroom \t\t\t  (2)Add Employees \t\t\t  (3)Add Cars");
        System.out.println();
        System.out.println("(4) Get Showroom \t\t\t (5) Get Employees \t\t\t (6) Get Cars");
        System.out.println();
        System.out.println(" ###### Enter your 0 to exit   ######");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Showroom showroom[]=new Showroom[5];
       Cars cars[]=new Cars[5];
       Employees employees[]=new Employees[5];

       int car_counter=0;
       int showroom_counter=0;
       int employees_counter=0;

       int choice=100;
       while(choice!=0){
        main_menu();
        choice =sc.nextInt();
        while(choice !=9 && choice!=0){
            switch(choice){
               case 1:
               showroom[showroom_counter]=new Showroom();
               showroom[showroom_counter].set_detail();
               showroom_counter++;
               System.out.println();
               System.out.println("(1) Add new showroom");
               System.out.println("(9) Go back to main menu");
               choice=sc.nextInt();
               break;
               case 2:
               employees[employees_counter]=new Employees();
               employees[employees_counter].set_detail();
               employees_counter++;
               System.out.println();
               System.out.println("(2) Add new Employee");
               System.out.println("(9) GO back to main menu");
               choice=sc.nextInt();
               break;
               case 3:
               cars[car_counter]=new Cars();
               cars[car_counter].set_detail();
               car_counter++;
               System.out.println();
               System.out.println("(3) Add new Car");
               System.out.println("(9) GO back to main menu");
               choice=sc.nextInt();
               break;
               case 4:
               for(int i=0;i<showroom_counter;i++){
                showroom[i].get_detail();
                System.out.println();
                System.out.println();

               }
               System.out.println();
               System.out.println("(9) Go back to main menu");
               System.out.println("(0) Exit ");
               choice=sc.nextInt();
               break;
               case 6:
               for(int i=0;i<car_counter;i++){
                cars[i].get_detail();
                System.out.println();
                System.out.println();
               }
               System.out.println();
               System.out.println("(9) Go back to main menu");
               System.out.println("(0) Exit ");
               choice=sc.nextInt();
               break;
               case 5:
               for(int i=0;i<employees_counter;i++){
                employees[i].get_detail();
                System.out.println();
                System.out.println();
               }
               System.out.println();
               System.out.println("(9) Go back to main menu");
               System.out.println("(0) Exit ");
               choice=sc.nextInt();
               break;
            }
        }
       }
    }
}
