 Set Serveroutput ON
 Create or Replace function findMax(x IN number, y IN
number)
 return number IS
 z number;
 begin
 if x > y then

z:= x;
 else

Z:= y;
 end IF;
 RETURN z;
 end findMax;
 /
 DECLARE
  a number:='&first_num';
  b number:='&second_num';
  c number;
  begin
  c := findMax(a, b);
 dbms_output.put_line(' Maximum of '||a|| ' and ' ||b||' : ' || c);
 end;
 /
