var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var N=parseInt(lines.shift());
var a=[];
var i;
for(i=0;i<N;i++)
{
    a.push(parseInt(lines.shift()));
}
for(i=0;i<N;i++)
{
    if(a[i]>0 && a[i]%2===0)
    {
        console.log("EVEN POSITIVE");
    }
    else if(a[i]<0 && a[i]%2===0)
    {
        console.log("EVEN NEGATIVE");
    }
    else if(a[i]>0 && a[i]%2!==0)
    {
        console.log("ODD POSITIVE");
    }
    else if(a[i]<0 && a[i]%2!==0)
    {
        console.log("ODD NEGATIVE");
    }
    else
    {
        console.log("NULL");
    }
}
  
