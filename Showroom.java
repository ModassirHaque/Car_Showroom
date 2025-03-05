package OOPS_Project;

import java.util.Scanner;

public class Showroom implements utility {
    
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_car_in_stock=0;
    String manager_name;

    @Override
    public void get_detail(){
        System.out.println("Showroom Name" + showroom_name);
        System.out.println("Showroom Address"+showroom_address);
        System.out.println("Manager Name"+manager_name);
        System.out.println("Total Employee"+total_employees);
        System.out.println("Toal Cars"+total_car_in_stock);
    }

    @Override
    public void set_detail(){
        Scanner sc=new Scanner(System.in);

        System.out.println("##### ENTER SHOWROOM DETAIL  #####");
        System.out.println();
        System.out.println("SHOWROOM NAME");
        showroom_name=sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address=sc.nextLine();
        System.out.println("Manager Name");
        manager_name=sc.nextLine();
        System.out.println("Total number of employee");
        total_employees=sc.nextInt();
        System.out.println("Total number of cars in stock");
        total_car_in_stock=sc.nextInt();
    }
}
