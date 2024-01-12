import java.util.*;
class Attendence
{
void markAttendence()
{
System.out.println("mass Bunk");
}

void markAttendence(String... s)
{
System.out.println("The number of Students present are "+s.length+"\nStudents list:");
for(String name:s)
 {
  System.out.println(name);
  }
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of Students");
int no_of_std=sc.nextInt();
//sc.nextLine();

String arr[]=new String[no_of_std];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.next();
}
Attendence ad=new Attendence();
ad.markAttendence();
ad.markAttendence(arr);
}
}