package target24lpa;

public class Trianglepattern10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		for(int i=1;i<=n;i++) {
		for(int k=1;k<=(n-i);k++) {
			System.out.print("*");
	}
		System.out.println(" ");
		}
	}

}
