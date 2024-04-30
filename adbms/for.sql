Set Serveroutput ON
declare
area float;
r float:=&radius;
i number(3);
begin

for i in 1..r
loop
area:=i*i*3.14;

if (area>3.14)then
dbms_output.put_line(' larger Areas of circle='||area);
--else if(area<3.14)then
--dbms_output.put_line(' smaller Areas of circle='||area);
else
dbms_output.put_line(' area of circle ='||area);

end if;
end loop;
end;
/
