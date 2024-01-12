println "Day4"
/*class x
{
//d=400
def m1()
{
//e=500 not possible if u want declare varible outside method inside class and asssign value in method
def a=100
println "I am in m1 of x"
println a
}
def m2()
{
//c=300
def b=200
println "I am in m2 of x"
println b
//pritnln a not able to access in other method
}
}
x1=new x()
x1.m1()
x1.m2()
//println d */


//constructor
/*class x
{
def name
def age
def x(name,age)
{
this.name=name
this.age=age
println "I am constructor of x"
println "$name $age in constructor"
}
def m1()
{
println "I am method of x"
println "$name $age in method"
}
}
x1=new x("Ramya",22)
x1.m1()
println x1.name
println x1.age

x2=new x("Ram",34)
x2.m1()
println x2.name
println x2.age*/
/*
//BankApp
class BankApp{
def cust_name
def cust_acc_no
def balance
def address

def BankApp(cust_name,cust_acc_no,balance,address)
{
this.cust_name=cust_name
this.cust_acc_no=cust_acc_no
this.balance=balance
this.address=address
}
//display
def display()
{
println "*"*10 +"Customer Details" +"*"*10
println "customer_name: $cust_name"
println "customer Account number: $cust_acc_no"
println "customer balance: $balance"
println "Address: $address"
}

//deposit
def deposit(dep_ammount)
{
balance=balance+dep_ammount
println "Deposit $dep_ammount Successfully your balance amount is $balance"
}

//withdraw
def withdraw(w_ammount)
{
if(w_ammount>balance)
{
println "Not able to withdraw.Insufficient balance."
}
else
{
balance=balance-w_ammount
println "Withdraw w_ammount Successfully your current balance is $balance"
}}

//balanceenq
def balanceEnq()
{
println "Your current balance is $balance"
}

}
bankApp=new BankApp("Ramya",23456789767,10000,"Chennai")
bankApp.display()
bankApp.deposit(2000)
bankApp.withdraw(100000)
bankApp.balanceEnq()
bankApp.display()*/

/*import Demo
def javaInstance=new Demo()
javaInstance.m1()*/

import GroovyModule
def groovyInstance=new GroovyModule()
groovyInstance.m1()

