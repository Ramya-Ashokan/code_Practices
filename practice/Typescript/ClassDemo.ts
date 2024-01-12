/*class Employee
{
    eid:number;
    ename:string;
    salary:number;

}
let emp=new Employee();
emp.eid=101;
emp.ename="Ramya";
emp.salary=150000;
console.log(emp);*/

/*class Employee
{
//class will be created as anonymous function
    eid:number;
    eName:string;
    salary:number;
  constructor(public eid:number,public eName:string,public salary:number)//as we mention attribute so it is class level
  {
   /*this.eid=eid;
   this.eName=eName;
   this.salary=salary;
  }*/
 console.log('tsc classDemo.ts --out app.js 00target es5')
 //export class Employee
  class employee
{
    //   empdetails(obj: Employee) {
    //       throw new Error("Method not implemented.");
    //   }
//class will be created as anonymous function
    /*eid:number;
    eName:string;
    salary:number;*/
    private dept:string;
  constructor(private eid:number,private eName:string,private salary:number)//as we mention attribute so it is class level
  {
   /*this.eid=eid;
   this.eName=eName;
   this.salary=salary;*/
  }
public get Eid()
{
return this.eid;
}
public get EName()
{
return this.eName;
}
public get Salary()
{
return this.salary;
}
public get Dept()
{
    return this.dept;
}
public set Dept(dept:string)
{
this.dept=dept;
}
public set Eid(eid:number)
{
this.eid=eid;
}
public set EName(eName:string)
{
    this.eName=eName;
}
public set Salary(salary:number)
{
    this.salary=salary;
}
}
/*public empdetails(obj):Employee{

}*/

let emp=new employee(104,'Ram',2000000);
emp.Dept="IT";
console.log(emp.Eid);
console.log(emp.EName,);
console.log(emp.Salary);
console.log(emp.Dept);
console.log(emp);
var obj=new  employee(110,'Gayu',12000);
console.log(obj)

/*function empdetails(obj: Employee) {
    throw new Error("Function not implemented.");
}*/
// emp.Eid=103;
// emp.EName='Jana';
// emp.Salary=120000;
// emp.Dept='Manager';
// emp.employeeDetails();
