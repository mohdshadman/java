import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the String");
		s.append(scanner.nextLine());
		System.out.println("The reverse of the String is");
		System.out.println(s.reverse());
scanner.close();
	}

}