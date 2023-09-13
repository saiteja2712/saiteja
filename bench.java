class bench
{
public static void main(String[] args) 
{
int a=1,n=4,fact=1;
while(a<n)
{
if(n%a==0)
{
fact=fact+a;
}
a++;
}
if(fact==2)
{
System.out.println(n+" prime");  
}
else
 System.out.println(n+" not prime");
}
}