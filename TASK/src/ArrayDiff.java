import java.util.Scanner;

public class ArrayDiff {

	public static void main(String[] args) {
		int l1,l2;
		int a[],b[];
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of first array ");
       l1=scanner.nextInt();
       System.out.println("Enter the elements of first array");
       a=new int[l1];
       for(i=0;i<l1;i++){
    	   a[i]=scanner.nextInt();
       }
	System.out.println("Enter the size of the second array");
	l2=scanner.nextInt();
	b=new int[l2];
	System.out.println("Enter the elements of the second array");
	for(i=0;i<l2;i++){
		b[i]=scanner.nextInt();
	}
	outer:
	for(i=0;i<l1;i++){
		for(j=0;j<l2;j++){
			if(a[i]==b[j]){
				continue outer;
			}
			else if(a[i]!=b[j]&&j==l2-1){
				System.out.println(a[i]);
			}
		
		}
	}
	
	}

}