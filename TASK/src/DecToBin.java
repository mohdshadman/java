import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scanner.nextInt();
		System.out.println(Integer.toBinaryString(num));
      
	}

}