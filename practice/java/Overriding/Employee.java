class Employee
{
String company="Abc";
String eid="hsvxhw";
public String getDetails()
{return eid ;
}
public String getCompany()
{
return company;
}
}
class Manager extends Employee
{
String company="xyz";
String dept="IT";
public String getDetails()
{
return dept;
}
public String getCompany()
{
return company;
}
}