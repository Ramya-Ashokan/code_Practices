/*class Sample
{
public static void main(String[] args)
{
System.out.println("Hello world");
println "hello world"
}

}*/
/*
println "helloworld"
print "hi"
print "hello"
println "10"+20
a=12
b=1.5
c='a'
d="ramya"
e=true
println a
println b
println c
println d
println e
println "Variable  a value is $a"
println 'Variable a value is $a'
println "Variable  a value is ${a+b}"
println a.getClass()//datatype of the variable
println b.getClass()
println c.getClass()
println d.getClass()
println e.getClass()
println '"hi"'
println "'hello ramya ashokan'"
println "\'hi\'"
println "\"\"hello\""


str="groovy script"
println str[0]
println str[-12]
println str[0..5]
println str.length()

println str.substring(1,4);
println str.indexOf('o');
println str.replace('g','G')
println str.toLowerCase()
println str.toUpperCase()
println str.reverse()
println str.split(" ")
def list=['Ramya','Ram','Kamal']
def delimiter=","
def result=list.join(delimiter)
println result
println list


file_info="22dec2023 192.161.1.10 80 192.161.1.11 88 web.cqi"
println file_info.split(" ")[1..4].join(" ")
name=System.console().readLine "Enter your name"
println "your name is :$name"


num1=System.console().readLine "Enter num1"
num2=System.console().readLine "Enter num2"



//convert it to int
num1=num1 as int
num2=num2 as int
sum1=num1+num2
println "sum is $sum1"
println num1.getClass()
println num2.getClass()
println "sum of ${num1} and ${num2} is ${num1+num2}"
println "subtraction of ${num1} and ${num2} is ${num1-num2}"
println "multiplication of ${num1} and ${num2} is ${num1*num2}"
println "division of ${num1} and ${num2} is ${num1/num2}"
println "modulus of ${num1} and ${num2} is ${num1%num2}"
println "exponential of ${num1} and ${num2} is ${num1**num2}"



x=10
y=3
println x<y 
println x>y
println x==y
println x!=y

//string comaparision based on ascii value not length a=97 z=122
z="abc"
c="z"
println z<c 
println z>c
println z==c
println z!=c
println z.length()> c.length()
println "%"*15
println "Senthil"
println "%"*15

//conditions
//if
num=System.console().readLine "Enter number"
num=num as int 
if (num%2==0)
{
println "number is even"
}
else
{
println "number is odd"
}

//check three digit number
num=System.console().readLine "Enter number"
num=num as int 
if (num>99 && num<1000)
{
println "${num} is  three digit"
}
else
{
println "${num} is not three digit"
}



//greatest number
num=System.console().readLine "Enter number"
num=num as int 
if (num>0)
{
println "${num} is positive"
}
else if(num<0)
{
println "${num} is negative"
}
else {
println "${num} is zero"
}


println "\t\t\t\t\tWelcome to Foodies World:)!!!\n\t\t\t\t\t*****************\n1.Veg Menu\n2.Non Veg Menu\n3.Jain Menu"

option=System.console().readLine "Enter your choice:"
option=option.toInteger()
if (option==1)
{
println("1.Dosa \n2.Idilly \n3.Pongal");

}
else if(option==2)
{
println("1.Chicken biriyani\n2.chicken Manchurian\n3.Mutton biriyani")
}
else if(option==3)
{
println("1.lemon rice\n2.Tamarind rice\n3.Chapathi with dhaal")
}
else
{
println("please enter valid option")
}




//Arthmetic operation using if
 num6=System.console().readLine "Enter number1:"
 num6=num6.toInteger()
 num7=System.console().readLine "Enter number2:"
 num7=num7.toInteger()
println("\t\t\t\t\tArithmetic operation\t\t\t\t\t\t\n1.sum\n2.sub\n3.multiple\n4.Division\n5.Mode\n6.Exponent\n")
option=System.console().readLine "Enter your choice:"
option=option.toInteger()
if(option==1)
{
println "sum of ${num6} and ${num7}is ${num6+num7}"
}
else if(option==2)
{
println "sub of ${num6} and ${num7}is ${num6-num7}"
}
else if(option==3)
{
println "multiple of ${num6} and ${num7}is ${num6*num7}"
}
else if(option==4)
{
println "Division of ${num6} and ${num7}is ${num6/num7}"
}
else if(option==5)
{
println "sub of ${num6} and ${num7}is ${num6%num7}"
}
else if(option==6)
{
println " Exponential of ${num6} and ${num7}is ${num6**num7}"
}
else{
println "Enter valid choice"
}*/

//while loop
i=1
while(i<=10)
{

println i
i++
}





/*i=10
while(i>0)
{

if(i==5)
{
continue
}

println i

i--
}

//continue
i=1
while(i<=10)
{
	if(i==5)
	{
		i++
		continue;
	}
	else
	{
		println i
		++i
	}
}*/


while(true)
{
number=System.console().readLine "Enter the number"
number=number.toInteger()
if(number>0)
{
println "The square of the $number is ${number*number}"
break
}
else if(number<0){
continue
}
else{
break
}
}

