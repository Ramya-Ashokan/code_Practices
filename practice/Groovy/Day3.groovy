/*println "Day3 groovy"
f=new File("test2.txt")
for(i in f.readLines())
{
//if(i=~/ab*c/)0 or any occurence of character
//if(i=~/ab+c/)1 or more " 
//if(i=~/ab.*c/)any no of character any times
//if(i=~/^\w+\s\w+\s\w+$/)exact3 words
//if(i=~/^.+\s.+\s.+$/)not exact 3 words
//if(i=~/\bramya\b/)
if(i=~/^ramya.*ramya$/)
{
println "$i pattern matches"
}}

name=System.console().readLine "Enter name"
phoneno=System.console().readLine "Enter phoneno"
email=System.console().readLine "Enter mailid: "
if(name=~/^[a-zA-Z]{2,}$/ )
{
println "Name  valid"

}
 if(phoneno=~/^[6-9]{1}[0-9]{9}$/)
{
println "phoneno is valid"
}
 if(email=~/^\w+[@]\w+[.][a-zA-Z]{2,3}$/)
{
println "email is valid"
}
else
{
println "please enter valid phone no and name"
}*/

//Functions
/*def printName()
{
println "Ramya"
}
printName()*/

//Function with parameter
/*def add(a,b)
{
println "Addition of $a and $b : ${a+b}"
println "Subtraction of $a and $b : ${a-b}"
println "Multiplication of $a and $b : ${a*b}"
println "Division of $a and $b : ${a/b}"
println "Modulus of $a and $b : ${a%b}"
}
add(5,2)*/
//variables
x=10
def y=30
def a(b,c)
{

/*println x
def y=20
println y*/
sum=b+c
return 50
}
//println y
println a(10,20)

//avg marks

/*marks={45,67,89,78,90}
avg_mark=find_avg_marks('ramya',marks)
println  "your avg marks $avg_mark"
grade=compute_grade(avg-marks)
println "your grade is: $grade"


//default arguments
def info(name,age=18)
{
println name
println age
}
info("ramya",23)
info("bob")

import arithmetic as arith
{
x=System.console().readLine "Enter number1: "
x=x.toInteger()
y=System.console().readLine "Enter number2: "
y=y.toInteger()
result=new arith().sum(x,y)
result1=new arith().subtraction(x,y)
result2=new arith().multiply(x,y)
result3=new arith().division(x,y)
result4=new arith().modulus(x,y)
println result
println result1
println result2
println result3
println result4
}*/


/*json->groovy module name
1)write a script a read  json file with groovy
=>jsonfile to groovy object

2)write a script to write date to the json file using groovy
=>groovy hash variablee ->json object*/
/*import groovy.json.JsonSlurper
def jsonText='{"name":"John","age":30,"car":null}'//JSON STRING
def jsonSlurper=new JsonSlurper()
def jsonObject=jsonSlurper.parseText(jsonText)//convert jsontext to groovy dictionary
println jsonObject
println jsonObject["name"]
println "Name:${jsonObject.name},Age:${jsonObject.age}"*/

/*import groovy.json.JsonSlurper
//specify the path to your JSON file
def filepath='jsontext.json'

//create a JsonSlurper object
def jsonSlurper=new JsonSlurper()

//parse the json file
def jsonData=jsonSlurper.parse(new File(filepath))
println jsonData
println jsonData.getClass()
println "##################################"



import groovy.json.JsonOutput
//Data to be written to the Json file
def jsonData=[
name:"John doe",
age:30,
city:"chennai"
]
//specify the path to the JSON FILE
def filePath="jsontext.json"
//convert the data to JSON format
def jsonContent=JsonOutput.toJson(jsonData)
//write the JSON content to the file
new File(filePath).text=jsonContent

println "Data successfuly written to:$filePath"



str1="groovy"
println str1
println str1.getClass()
println System.identityHashCode(str1)
str1=str1.replace('g','k')
println str1
println str1.getClass()
println System.identityHashCode(str1)
println "**********************************"
list=[10,20,30]
println list
println list.getClass()
println System.identityHashCode(list)
list[0]=100
println list

println list.getClass()
println System.identityHashCode(list)

//connecting server.groovy hostname username password
host_info=args
len=host_info.size()
if(len==3)
{
host_name=args[0]
username=args[1]
password=args[2]
//println host_info
println host_name
println username
println password
}
else{
println "Invalid arguments.Expected only 3 args"
}

num1=10
num2=0
def filePath="groovy/bjrfrr.txt"
try{
//f=new File("sdhgs.txt")

//k=f.getText()

def result=num1/num2
println "Result:$result"
}
catch(FileNotFoundException e)
{
println "there is no file,${e.message}"
}
catch(ArithmeticException e)
{
println "Division by zero error denominator should not be zero,${e.message}"
}
catch(Exception e)
{
println "An unexpected error occurred: ${e.message}"
}

import groovy.json.JsonOutput
def jsonData=[
name:"Ramya",
age:22,
city:"Salem"
]
def filePath="C:\\Users\\ramya.a\\Desktop\\Groovy\\test3.txt"
try{
def jsonContent=JsonOutput.toJson(jsonData)
new File (filePath).text=jsonContent
println "data written successfully"
}
catch (Exception e)
{
println "Error writing to JSON file:${e.message}"
}*/

//class 
class Demo
{



def add(x,y)
{
println x+y
}
}
 demo=new Demo()
 demo.add(5,7)