declare
area float;
r float:=&radius;
i number(3);
begin
area:=r*r*3.14;
for i in 1..2 
loop

dbms_output.put_line('Area='||area);
end loop;
end;
/
