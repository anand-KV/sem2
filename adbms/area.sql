Set Serveroutput ON
declare
area float;
r float:=&radius;
begin
area:=3.14*r*r;
dbms_output.put_line('area='||area);
end;
/
