declare
area float;
r float:=&radius;
begin
area:=r*r*3.14;
dbms_output.put_line('Area='||area);
end;
/

