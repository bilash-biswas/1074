var
N,a:int64;
i:integer;
begin
   read(N);
   for i:=1 to N do
   begin
      read(a);
      if ((a > 0) and ((a mod 2)= 0))then
      begin
         writeln('EVEN POSITIVE');
      end
      else if ((a < 0) and ((a mod 2) = 0))then
      begin
         writeln('EVEN NEGATIVE');
      end
      else if ((a > 0) and ((a mod 2) <> 0))then
      begin
         writeln('ODD POSITIVE');
      end
      else if ((a < 0) and ((a mod 2) <> 0))then
      begin
         writeln('ODD NEGATIVE');
      end
      else
      begin
         writeln('NULL');
      end
   end
end.
