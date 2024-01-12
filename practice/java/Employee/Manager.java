class Manager extends Employee3
{
String dept;
//Manager(){}
Manager(int eid,String ename,long salary,String dept)
{
super(eid,ename,salary);
 this.dept=dept;
}
public void setDept(String dept)
 {
   this.dept=dept;
  }
 public String getDept()
 {
 return dept;
 }
 
}
