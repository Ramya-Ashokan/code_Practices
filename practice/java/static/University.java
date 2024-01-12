class University
{

static String uniName;
private  static String  deptName;
static void uniDetails(String uniName,String deptName)
 {
System.out.println("The university name is"+uniName);
System.out.println("The department name is"+deptName);
 } 
static class Department
{
 static void uniDetails(String uniName,String deptName)
 {
System.out.println("The university name is"+uniName);
System.out.println("The department name is"+deptName);
 }
}
public static void main(String args[])
{
//University.Department d=new Department();
University.Department.uniDetails("sjce","IT");
uniDetails("sjce","CSE");
}

}