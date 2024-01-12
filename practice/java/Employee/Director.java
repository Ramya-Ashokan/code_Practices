class Director extends Admin
{
double budget;
//Director(){}
Director(int eid,String ename,long salary,String dept,double budget)
{
super(eid,ename,salary,dept);
this.budget=budget;
}
public double getBudget()
{
 return budget; 
}
public void setBudget(double budget)
{
 this.budget=budget;
}
}