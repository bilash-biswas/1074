b=gets().chomp().to_i
a=Array.new()
for i in 1..b
    a[i]=gets().chomp().to_i
end
for i in 1..b
    if a[i]>0 && a[i]%2==0
        printf("EVEN POSITIVE\n");
    elsif a[i]<0 && a[i]%2==0
        printf("EVEN NEGATIVE\n");
    elsif a[i]>0 && a[i]%2!=0
        printf("ODD POSITIVE\n");
    elsif a[i]<0 && a[i]%2!=0
        printf("ODD NEGATIVE\n");
    else
        printf("NULL\n");
    end
end
