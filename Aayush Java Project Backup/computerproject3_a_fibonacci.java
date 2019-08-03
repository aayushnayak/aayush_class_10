public class computerproject3_a_fibonacci
{
public static void main(String rags[])
{
int a=0,b=1,c,count=2;
System.out.println(a+",");
System.out.println(b+",");
while(count!=20)  // if you want first 100 fibonacci numbers then change 20 to 100 accordingly 
{
c=a+b;
count++;
System.out.println(c+",");
a=b;
b=c;
}
}
}