import java.util.Scanner.*;
class Palindrome
{
public static void main(String []x)
{
 int n,r,ans,sum=0;
System.out.println("ENTER THE NUMBER");
Scanner in = new Scanner(System.in);
n=in.nextInt();
ans=n;
while(n>0)
{
 r=n%10;
 sum=(sum*10)+r;
 n=n/10;
 }
 if(ans==sum)
 System.out.println("palindrome number");
 else
 System.out.println("not a palindrome number");
 }
 }
