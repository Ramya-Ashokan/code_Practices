class Main
{
public static void main(String args[])
{

System.out.println("The rutime value is " +(args[0]+args[1]));
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
String opr=args[2];
switch(opr)
{
case "+":
System.out.println("the addition of  two numbers:"+(num1+num2));
break;
case "-":
System.out.println("the subtraction of  two numbers:"+(num1-num2));
break;
case "*":
System.out.println("hello");
System.out.println("the multiplication of  two numbers:"+(num1*num2));
break;
case "/":
System.out.println("the division of  two numbers:"+(num1/num2));
break;
case "%":
System.out.println("the modulo of  two numbers:"+(num1%num2));
break;
}
}}