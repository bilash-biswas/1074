a={}
b=io.read("*n")
for i=1,b do
    a[i]=io.read("*n")
end
for i=1,b do
    if(a[i]>0 and a[i]%2==0)then
        print("EVEN POSITIVE")
    elseif(a[i]<0 and a[i]%2==0)then
        print("EVEN NEGATIVE")
    elseif(a[i]>0 and a[i]%2~=0)then
        print("ODD POSITIVE")
    elseif(a[i]<0 and a[i]%2~=0)then
        print("ODD NEGATIVE")
    else
        print("NULL")
    end
end
