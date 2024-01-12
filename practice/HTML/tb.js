
/*function exitaction(action){
    if(action==true)
    {
        confirm('exit the window');
    }
    else
    {
     cal();
    }}*/

function cal(){
var ticket=prompt("Enter the no of tickets");

if(ticket==0)
{
    
    var action=confirm("do you want to exit");
    if(action!=true)
    {
        cal();
    }
    //exitaction(action);
}
   else  if(ticket<10)
    {
    var total=ticket*150;
    alert("ticket cost is "+total);
    }

else
{
alert("only ten tickets available");
}}
cal()