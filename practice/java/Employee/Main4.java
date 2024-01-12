import java.util.*;
class Main4
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);

 int eid=sc.nextInt();
 String ename=sc.next();
 long   salary=sc.nextLong();
 String dept=sc.next();
 double budget=sc.nextDouble();
Main4 nn=new Main4();
//Employee3 emp=new Employee3(eid,ename,salary);
//nn.displayDetails1(emp);
Manager man=new Manager(eid,ename,salary,dept);
nn.displayDetails1(man);
Admin ad=new Admin(eid,ename,salary,dept);
nn.displayDetails1(ad);
Director dir=new Director(eid,ename,salary,dept,budget);
nn.displayDetails1(dir);
Engineer eng=new Engineer(eid,ename,salary);
nn.displayDetails1(eng);
 }

/*void displayDetails(Employee3 emp)
{
//System.out.println(emp.eid+" "+emp.ename+" "+emp.salary);
//System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.salary+" "+emp1.dept);
System.out.println("id:"+emp.getEid());
System.out.println("name:"+emp.getEname());
System.out.println("salary:"+emp.getSalary());
System.out.println("department:"+emp.getDept());
}*/

void displayDetails1(Employee3 emp)
{
//System.out.println(emp.eid+" "+emp.ename+" "+emp.salary);
//System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.salary+" "+emp1.dept);

if(emp instanceof Manager)
{
Manager man=(Manager)emp;
System.out.println("Manager id:"+man.getEid());
System.out.println("Manager name:"+man.getEname());
System.out.println("Manager salary:"+man.getSalary());
System.out.println("Manager department:"+man.getDept());
}

else if(emp instanceof Director)
{
Director dir=(Director)emp;
System.out.println("Director id:"+dir.getEid());
System.out.println("Director name:"+dir.getEname());
System.out.println("Director salary:"+dir.getSalary());
//System.out.println("Director department:"+dir.getDept());
System.out.println("Director department:"+dir.getBudget());
}

else if(emp instanceof Admin)
{
Admin ad=(Admin)emp;
System.out.println("Admin id:"+ad.getEid());
System.out.println("Admin name:"+ad.getEname());
System.out.println("Admin salary:"+ad.getSalary());
//System.out.println("Admin department:"+ad.getDept());
}

else if(emp instanceof Engineer)
{
Engineer eng=(Engineer)emp;
System.out.println("Engineer id:"+eng.getEid());
System.out.println("Engineer name:"+eng.getEname());
System.out.println("Engineer salary:"+eng.getSalary());
//System.out.println("Engineer department:"+eng.getDept());
}

}
}