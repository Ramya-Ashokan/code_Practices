import java.util.*;
class UpdatedEmployeeMain
{
public static void main(String args[])
{
UpdatedEmployeeService u_emp=new UpdatedEmployeeService();
Scanner sc=new Scanner(System.in);

int choice;
do
{
System.out.println("Employee Management System");
System.out.println("1.Create Employee \n2.Display Employee Details\n3.Update Employee Details\n4.Search Employee Details\n5.Delete Employee Details\n6.Exit\n");
System.out.println("Enter the choice:");
choice=sc.nextInt();
//sc.nextLine();
switch(choice)
{
case 1:
UpdatedEmployeeService.createEmployee();
break;
case 2:
UpdatedEmployeeService.displayEmployee();
break;
case 3:
UpdatedEmployeeService.updateEmployee();
break;
case 4:
UpdatedEmployeeService.searchEmployee();
break;
case 5:
UpdatedEmployeeService.deleteEmployee();
break;
case 6:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}}
while(choice<7);
}
}
