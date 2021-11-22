
public class Twodarray {

	static void TwoDarray(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{9,5,6},{9,3,1}};
TwoDarray(arr);
	}

}
