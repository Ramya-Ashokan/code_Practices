import java.util.*;
class UpdatedEmployeeService
{
static Scanner sc=new Scanner(System.in);
static UpdatedEmployee[] emp=new UpdatedEmployee[10];
UpdatedEmployeeService u_emp1=new UpdatedEmployeeService();
 
public  static  void createEmployee()
{
int i=0;

for( i=0;i<10;i++)
{
System.out.println("Enter the Employee "+(i+1)+" details:");
//System.out.println("Enter the Employee id:");
//int eid=sc.nextInt();
//sc.nextLine();

System.out.println("Enter the Employee Name:");
String ename=sc.nextLine();

System.out.println("Enter the Employee Role:");
String role=sc.nextLine();


System.out.println("Enter the Employee Salary:");
long salary=sc.nextLong();
    if(i<10){
            emp[i] = new UpdatedEmployee(ename,role,salary);
            System.out.println("\nEmployee created successfully");
}
else
{
System.out.println("only 10 employees will be created");
}
}
}
public static void displayEmployee()
{
System.out.println("1.Display id details\n2.Display all details");
System.out.println("Enter the choice:");
int choice1=sc.nextInt();
switch(choice1)
{
case 1:
System.out.println("Enter the  employee id to display details:");
int d_eid=sc.nextInt();
UpdatedEmployee emps=searchEmployee(d_eid);
System.out.println(emps);
break;
case 2:
for(UpdatedEmployee empss:emp)
{
System.out.println(empss);
}
break;
}
}
public  static  UpdatedEmployee searchEmployee(int d_eid)
{
for(UpdatedEmployee e:emp)
{
if(emp!=null && emp[i].getEid==d_eid)
{
return e;
}
}

public  static  void updateEmployee()
{
System.out.println("Enter the employee id:");
int u_eid=sc.nextInt();
UpdatedEmployee emp1=searchEmployee(int u_id);
System.out.println("Enter the what you want to update\n1.Name\n2.Role\n3.Salary");
System.out.println("Enter choice");
int choice2=sc.nextInt();
switch(choice2)
{
case 1:
System.out.println("Enter the name");
emp1.setEname(sc.nextLine());
break;
case 2:
System.out.println("Enter the role:");
emp1.setRole(sc.nextLine());
break;
case 3:
System.out.println("Enter the salary:");
emp1.setSalary(sc.nextLong());
break;
}

}
public  static  void deleteEmployee()
{
System.out.println("Enter the employee id");
int dd_eid=sc.nextInt();
UpdatedEmployee temp[]=new UpdatedEmployee[10];

for(UpdatedEmployee e:emp)
{
if(emp[i].getEid!=dd_eid)
{
temp[i]=e;
}

else
{
continue;
}
}
for(UpdatedEmployee t:temp)
{
System.out.println(t);
}

}