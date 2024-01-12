class Employees
{
private int eid;
private String name;
private long salary;

Employees(){}

public int getEid()
{
return eid;
}
public void setEid(int eid)
{
this.eid=eid;
}

public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}

public long getSalary()
{
return salary;
}
public void setSalary(long salary)
{
this.salary=salary;
}

 public String toString()
{
return eid+" "+name+" "+salary;
}

}