package OOPS_Project;
import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility {
    
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_detail(){
        System.out.println("employee id"+emp_id);
        System.out.println("Employee Name"+emp_name);
        System.out.println("Employee Age"+emp_age);
        System.out.println("Employee Department"+emp_department);
        System.out.println("Showroom Name"+showroom_name);;
    }
    @Override
    public void set_detail(){
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emp_id=String.valueOf(uuid);
        System.out.println("##### Enter emloyee detail #####");
        System.out.println();
        System.out.println("Employee Name :");
        emp_name=sc.nextLine();
        System.out.println("Employee age :");
        emp_age=sc.nextInt();
        System.out.println("Employee Department :");
        emp_department=sc.nextLine();
        System.out.println("Showroom Name :");
        showroom_name=sc.nextLine();
        total_employees++;
    }
}
