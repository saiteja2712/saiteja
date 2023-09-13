class alien
{
public static void main(String args[])
{
int n=12,rem,var=0,num=n,m,remo,vars=0;
num=n*n;
for(;n!=0;n/=10)
{
rem=n%10;
var=var*10+rem;
}
System.out.println(var);
m=var*var;
System.out.println(m);
System.out.println(num);
for( m=var*var;m!=0;m/=10)
{
remo=m%10;
vars=vars*10+remo;
}
System.out.println(vars);
if(num==vars)
System.out.println("alien number");
else
System.out.println("not a alien number");
}
}
