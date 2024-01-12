class UpdatedEmployee
{
private static int id_gen=100;
private final int eid;
private String ename;
private String role;
private long salary;
UpdatedEmployee(String ename,String role,long salary)
{
this.eid=id_gen++;
this.ename=ename;
this.role=role;
this.salary=salary;
}
public void setEname(int eid)
{
this.eid=eid;
}
public int getEid()
{
return eid;
}
public void setEname(String ename)
{
this.ename=ename;
}
public String getEname()
{
return ename;
}
public void setRole(String role)
{
this.role=role;
}
public String getRole()
{
return role;
}
public void setSalary(long salary)
{
this.salary=salary;
}
public long getSalary()
{
return salary;
}
/*public String toString()
{
return "Employee\n Id"+eid+"\n Name"+ename+"\n Role"+role+"\n Salary"+salary;
}*/
}