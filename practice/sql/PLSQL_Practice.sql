SET SERVEROUTPUT ON;
--print name
DECLARE
v_name varchar(255):='Ramya';
Begin
dbms_output.put_line('My name is '||v_name);
end;
/

--print arithmetic exception
DECLARE
v_num number:=10;
v_result number;
BEGIN
v_result:=v_num/0;
Exception when zero_Divide then
  dbms_output.put_line(sqlerrm);
END;
/

--user exception
DECLARE
v_num number:=10;
v_result number;
divisor_not_zero Exception;
PRAGMA EXCEPTION_INIT (divisor_not_zero, -01476);
BEGIN
v_result:=v_num/0;
Exception when zero_Divide then
  dbms_output.put_line(sqlerrm);
  dbms_output.put_line(sqlcode);
END;
/

--emp id 100 get last name ,first_name salary
DECLARE
v_lname employees.last_name%type;
v_sal employees.salary%type;
v_eid employees.employee_id%type;
BEGIN
SELECT last_name,salary into v_lname,v_sal from employees where employee_id=100;
dbms_output.put_line(v_lname||' '||v_sal);
END;
/

DECLARE
v_sal employees.salary%type;
v_min v_sal%type;
v_max v_sal%type;
v_avg v_sal%type;
v_eid employees.employee_id%type:=100;
BEGIN
select min(salary),max(salary),avg(salary) into v_min,v_max,v_avg from employees;
dbms_output.put_line(v_min||' '||v_max||' '||v_avg);
select salary  into v_sal from employees where employee_id=v_eid;
dbms_output.put_line(v_min||' '||v_max||' '||v_avg);
END;
/

--if statement
DECLARE
v_age number:=&age;
BEGIN
if v_age>18 then
 dbms_output.put_line('eligible to vote');
else
   dbms_output.put_line(' not eligible to vote');
end if;
END;
/

--loop
DECLARE
v_num number:=0;
BEGIN
loop
DBMS_OUTPUT.PUT_LINE (v_num);
v_num:=v_num+1;
exit when v_num=10;
end loop ;

END;
/
--for loop
DECLARE
v_num number:=0;
BEGIN
for i in 1..10
loop
DBMS_OUTPUT.PUT_LINE (v_num);
v_num:=v_num+1;

end loop ;

END;
/

--while loop
DECLARE
v_num number:=0;
BEGIN
 while v_num<10 
 loop
DBMS_OUTPUT.PUT_LINE (v_num);
v_num:=v_num+2;

end loop ;

END;
/

--case
DECLARE
v_grade char(1):=upper('&c');
BEGIN
case v_grade
 when 'A' then
 dbms_output.put_line('more than 80 percent');
 when 'B' then
  dbms_output.put_line('more than 70 percent');
  when 'C' then
  dbms_output.put_line('more than 60 percent');
  else
   dbms_output.put_line('no such grade');
 end case;
END;
/

--continue in for loop

BEGIN
for i in 1..10
loop
if MOD(i,2)=1 then
continue;
end if;
dbms_output.put_line(i);
end loop;
END;
/

--continue in when

BEGIN
for i in 1..10
loop

continue
when  MOD(i,2)=0 ; 
dbms_output.put_line(i);
end loop;
END;
/

--record
declare

emp  employees%rowtype;
begin
select * into emp from employees where employee_id=100;
dbms_output.put_line(emp.first_name||' '||emp.last_name||' '||emp.salary||' '||emp.department_id);
end;
/

select * from job_grades;
declare
type gr is record
(v_grade char(1),
v_low number,
v_high number,
g job_grades%rowtype);
gr_ref gr;

BEGIN
select * into gr_ref.g from job_grades where grade='A';
select grade,lowest_sal,highest_sal into gr_ref.v_grade,gr_ref.v_low,gr_ref.v_high from job_grades where grade='B';
dbms_output.put_line(gr_ref.v_grade||' '||gr_ref.v_low||' '||gr_ref.v_high );
END;
/