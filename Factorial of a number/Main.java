import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int factor=1;
      int sum=0;
      for(int count=1;count<=num;count++)
      {
        factor=factor*count;
      }
          System.out.println(factor);
      
	}
}