import java.util.*;
class Main3
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of employees:");
 int n=sc.nextInt();
 Employees emp_arr[]=new Employees[n];
 for(int i=0;i<n;i++)
  {
    Employees emply=new Employees();

    System.out.println("Enter the employee id:");
    int id=sc.nextInt();
    emply.setEid(id);

    System.out.println("Enter the name of the employee:");
    String name=sc.next();
    emply.setName(name);

    System.out.println("Enter the salary:");
    long salary=sc.nextLong();
    emply.setSalary(salary);
    
    emp_arr[i]=emply;
    System.out.println("-------------------------");
  }

//without using var arg...
 /*for(Employees e:emp_arr)
 {
System.out.println(e);
}
*/


Main3 employ=new Main3();
employ.displayDetails(emp_arr[0]);
System.out.println("-----------------------------");
employ.displayDetails(emp_arr[0],emp_arr[1]);
System.out.println("-----------------------------");
employ.displayDetails(emp_arr[0],emp_arr[1],emp_arr[2]);
 }

public void displayDetails(Employees... emp)
{
for(Employees e:emp)
 {
  System.out.println(e);
 }
}

}