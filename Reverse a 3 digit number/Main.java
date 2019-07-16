import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int last=num%10;
    int mid=(num/10)%10;
    int first=num/100;
    int reverse=(last*100+mid*10+first);
    System.out.println(reverse);
    
  }
}