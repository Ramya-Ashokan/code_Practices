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
console.log('tsc classDemo.ts --out app.js 00target es5');
var Employee = /** @class */ (function () {
    function Employee(eid, eName, salary) {
        this.eid = eid;
        this.eName = eName;
        this.salary = salary;
        /*this.eid=eid;
        this.eName=eName;
        this.salary=salary;*/
    }
    Object.defineProperty(Employee.prototype, "Eid", {
        get: function () {
            return this.eid;
        },
        set: function (eid) {
            this.eid = eid;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "EName", {
        get: function () {
            return this.eName;
        },
        set: function (eName) {
            this.eName = eName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Salary", {
        get: function () {
            return this.salary;
        },
        set: function (salary) {
            this.salary = salary;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "Dept", {
        set: function (dept) {
            this.dept = dept;
        },
        enumerable: false,
        configurable: true
    });
    return Employee;
}());
var emp = new Employee(104, 'Ram', 2000000);
emp.Dept = "IT";
console.log(emp.Eid);
console.log(emp.EName);
console.log(emp.Salary);
console.log(emp.Dept);
console.log(emp);
