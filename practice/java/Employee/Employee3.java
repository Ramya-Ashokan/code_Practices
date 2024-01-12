class Employee3
{
 int eid;
 String ename;
 long salary;
//Employee3(){}
Employee3(int eid,String ename,long salary)
{
  this.eid=eid;
  this.ename=ename;
  this.salary=salary;
  
}
 public int getEid()
 {
  return eid;
 }
 public void setEid(int eid)
 {
  this.eid=eid;
 }

 public String getEname()
 {
  return ename;
  }
 public void setEname(String ename)
 {
  this.ename=ename;
 }

 public long getSalary()
 {
  return salary;
 }
 public void setSalary(long salary)
 {
 this.salary=salary;
 }

}