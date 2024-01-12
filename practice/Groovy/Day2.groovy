println("Hello")

//atm pin
/*correctpin='1234'
i=1
while(true){
atm_pin=System.console().readLine "Enter pin:"
//atm_pin=atm_pin.toInteger()

if(correctpin==atm_pin)
{
println "You have successfully logged in"
break
}
else if(i<3)
{
i++
continue
}
else{
println "You tried more than three times.Account blocked"
break
}
}


//for loop condition based
println "Condition based for loop"
for(i=1;i<=10;i++)
{
if(i==5)
{
break
}
println i

}

//for loop iteration based
println "Iteration based for loop"
list=[10,20,30,40,50]
for (i in list)
{

println i
}
println "* "*15



write a script  to display  the values 1-50 
multiples of 3  print 'fizz'
multiples of 5 print 'buzz'
both print 'fizzbuzz'
else print i


for(i=1;i<=50;i++)
{
if(i%3==0 && i%5==0)
{
println "Fizzbuzz"
}
else if(i%3==0)
{
println "Fizz"
}
else if(i%5==0)
{
println "Buzz"
}
else{
println i
}}


//switch case
//println "Enter the choice between 1 to 5"
choice=System.console().readLine "Enter the number:"
choice=choice as int
switch(choice)
{
  case 1:
  println "Given Number is $choice"
  break
  
  case 2:
  println "Given Number is $choice"
  break
  
  case 3:
  println "Given Number is $choice"
  break
  
  case 4..5://range operator
  println "Given Number is 4 or 5"
  break
  
  default :
  println "please enter valid number" 
}
//switch case with regular expression
choice=System.console().readLine "Enter the choice:"
switch(choice)
{

case ~/[0-9]+/:
println "The given input is number"
break
case ~/[a-zA-Z]+/:
println "The given input is alphabet"
break
case ~/[^0-9A-Za-z]+/:
println "The give input is special character"
break
default :
println "not matched"

}


//Array
my_list=[10,20,30,"groovy",45.45,'d',true]
for ( i in my_list)
{
println i
}
len=my_list.size()
println len

println my_list[0]
println my_list[-1]
//acess multipe values
println my_list[0,4,3]//10,45.45,groovy
println my_list[0..3]
println my_list


for(i=0;i<my_list.size;i++)
{
if(my_list[i]=="groovy")
{
my_list[i]="linux"
}
}
//my_list[3]="linux"
println my_list


//list inside another list
list=[10,"groovy",20.90,true,'d',[10,20.80,"groovy"]]
for(i in list){
println i
}
println list[-1][1]
list[-1][0]=20
println list
list[-1][2]="linux.."
println list

list[-1][2]=list[-1][2].replace("linux..","linux")
println list
str="ramya"
println str.replace('a','e')
println str
myarr=[1,2,3,4,5,"ramya",5,5,5]
println myarr
println "size: "+myarr.size()
println myarr
println "count: "+myarr.count(5)
println myarr
println "remove: "+myarr.remove(4)
println myarr
println "pop:" +myarr.pop()//remove from first
println myarr
println "sort:" +myarr.sort()
println myarr
println "push:" +myarr.push(456)
println "reverse:" +myarr.reverse()
println myarr
println "add:" +myarr.add(8)
println myarr
println "contains:" +myarr.contains("ramya")
println myarr
println "push:" +myarr.push(456)
println myarr
println "drop:" +myarr.drop(5) 
println myarr

//HashMap
emp_details=[101:"Ramya",102:"Gayathiri",103:"Siri"]
println emp_details
println emp_details[101]
emp_details[101]="Ram"
println emp_details
emp_details=[101:["rani","ds","CTS","India"],102:["Ramya","big data analyst","TCS","UK"]]
println emp_details
println emp_details[101]
emp_details[101][0]="Ram"
println emp_details

//create hash map with car info
car_info=["car1":["brand":"creta","colour":"Black","model":"suv","cost":"2000000"],"car2":["brand":"Duster","colour":"Red","model":"sedan","cost":"1000000"]]
println car_info
println car_info["car1"]["brand"]
car_info["car1"]["brand"]="hyundai"
println car_info["car1"]
//println car_info[car1][0]

//keyset
//it is used to take all the keys from the hashmap
emp_details=[101:["rani","ds","CTS","India"],102:["Ramya","big data analyst","TCS","UK"]]
println emp_details.keySet()
println emp_details.values()
println emp_details.size()
println emp_details.containsKey(102)
key=emp_details.keySet()
for (i in key)
{
println i+"=>"+emp_details[i]
}


fo=new File("test.txt")
k=fo.getText()
//println k
println fo.exists()
//acess only 3rd line to 5 th line from the file
z=fo.readLines()

//for(i in z[1..3])
for(i in z)
{
if(i.contains("groovy"))
{

println i
}
}*/
fo=new File("test.txt")

for(i in fo.readLines())
{
//if(i=~/^groovy/)
//if(i=~/groovy$/)
if(i=~/^groovy.*$/)
{
println i
}
}

for(i=1;i<=50;i++)
{
if(i%3==0 && i%5==0)
{
println "Fizzbuzz"
}
else if(i%3==0)
{
println "Fizz"
}
else if(i%5==0)
{
println "Buzz"
}
else{
println i
}}