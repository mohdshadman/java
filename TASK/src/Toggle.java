import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		String s;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		s=scanner.nextLine();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isUpperCase(c)){
				//c.toLowerCase(c);
				System.out.print(Character.toLowerCase(c));
			//System.out.print(c);
			}
			else if(Character.isLowerCase(c)){
			System.out.print(Character.toUpperCase(c));
			//System.out.print(c);
		}
		if((Character.isSpaceChar(c))){
			System.out.print(c);
		}
		
		}
scanner.close();
	}

}