import java.util.*;
public class Numberpattern {

 static void pattern(int n) {
	 int k=1;
	 //for display reverse order number
	/*
	 for(int i=0;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
	*/
	 // for display sequence order number
	 for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number limit:");
Scanner sc=new Scanner(System.in);	
int num = sc.nextInt();
pattern(num);
	}

}
