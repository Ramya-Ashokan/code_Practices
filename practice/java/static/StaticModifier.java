class StaticModifier
{
static  String str="Static variable";
String inst="Instance Variable";
static void display()
{
System.out.println("Instance variable");
}

public static void main(String[] args)
{
System.out.println(str);
StaticModifier.display();
StaticModifier s=new StaticModifier();
System.out.println(s.inst);
s.str="abc";
System.out.println(str);
System.out.println(StaticModifier.str);

}
static{
System.out.println("I am static");
StaticModifier staticDemo=new StaticModifier();
staticDemo.inst="I am instance initialize in static place";
System.out.println(staticDemo.inst);
}

}