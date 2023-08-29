class main
{
public static void main(String args[])
{
int n=20;
if(n>=10 && n<=100)
{
System.out.println("two digit");
}
else if(n>=0 && n<=10)
{
System.out.println("single digit");
}
else if(n>=100 && n<=1000)
{
System.out.println("Three digit");
}
else
{
System.out.println("Not applicable");
}
}
}