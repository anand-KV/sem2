Set Serveroutput ON
declare
i number(3);
begin
for i in 1..4
loop
dbms_output.put_line('hi');
end loop;
end;
/

