class evil
{
public static void main(String args[])
{
int n=9,sum=0,rem,s;
s=n*n;
for(s=n*n;s!=0;s/=10)
{
rem=s%10;
sum=sum+rem;
}
if(sum==n)
System.out.println("evil number");
else
System.out.println("not a evil number");
}
}

