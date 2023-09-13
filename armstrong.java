class armstrong
{
public static void main(String args[])
{
int n=153,rem,var=0,num=n;
for( ;n!=0;n/=10)
{
rem=n%10;
var=var+rem*rem*rem;
}
if(num==var)
System.out.println("armstrong");
else
System.out.println("not a armstrong");
}
}