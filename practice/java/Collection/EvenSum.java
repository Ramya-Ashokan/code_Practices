import java.util.*;
class EvenSum
{
public static void main(String args[])
{
int sum=0;
List<Integer> list=new ArrayList();

for(int i=0;i<=51;i++)
{
list.add((int)(Math.random()*100));
}
System.out.println(list);
for(int i=0;i<50;i++)
{
if(list.get(i)%2==0)
{
 int doubleValue=list.get(i*2);

 sum+=doubleValue;
 
}
}
System.out.println(sum);
}}