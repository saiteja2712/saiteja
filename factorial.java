class factorial
{
public static void main(String args[])
{
int factorial=1;
int x=1;
int n=10;
while(x<=n)
{
factorial=factorial*n;
n--;
System.out.println(factorial);
}
}
}