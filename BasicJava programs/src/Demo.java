import java.util.*;
public class Demo {

	static void printst(String st) {
		for(int i= 0;i<st.length();i++) {
			System.out.println(st.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s = sc.nextLine();
printst(s);
	}

}
