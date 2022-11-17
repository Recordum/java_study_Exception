import java.util.Scanner;

public class Exeption {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int dividend ; 
	 int divisor;
	 while(true)
	 {
		 System.out.println("숫자를 입력하세요");
		 dividend = scanner.nextInt();
		 System.out.println("몇으로 나눌까요");
		 divisor = scanner.nextInt();
	 
		 try 
		 {
			 System.out.println("몫은" + " " + dividend/divisor + "\n나머지는 " + dividend % divisor );
			 break;
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("0으로 나눌 수 없습니다.");
		 }
	 }
	 scanner.close();
	 
 }
}
