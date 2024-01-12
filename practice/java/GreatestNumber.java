import java.util.*;
class GreatestNumber1

{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter 5 numbers to find greatest number");
System.out.println("Enter the number1");
int num1=sc.nextInt();
System.out.println("Enter the number2");
int num2=sc.nextInt();
System.out.println("Enter the number3");
int num3=sc.nextInt();
System.out.println("Enter the number4");
int num4=sc.nextInt();
System.out.println("Enter the number5");
int num5=sc.nextInt();
if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
{
System.out.println(num1+" is greatest");
}

else if(num2>num3 && num2>num4 &&num2>num5)
{
System.out.println(num2+" is greatest");
}

else if(num3>num4 && num3>num5)
{
System.out.println(num3+" is greatest");
}

else if(num4>num5)
{
System.out.println(num4+" is greatest");
}

else
{
System.out.println(num5+" is greatest");
}

}}