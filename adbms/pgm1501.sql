Set Serveroutput ON
Create or replace function addnum (val1 in number,val2 in number)
return number is
Total number;
Begin
Total :=val1+val2;
Return(total);
End addnum;
/*Select addnum(3,4) from dual;*/
/
declare
a number:=&value_1;
b number:=&value_2;
c number;
begin 
c:=addnum(a,b);
dbms_output.put_line('sum of '||a|| ' and' ||b|| ' : ' ||c);
end;
/
