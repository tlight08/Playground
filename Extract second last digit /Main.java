import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int secondlast_num=(num%100)/10;
      System.out.println(secondlast_num);
	}
}