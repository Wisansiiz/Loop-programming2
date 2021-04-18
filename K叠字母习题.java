import java.util.*;
class Kµþ×ÖÄ¸Ï°Ìâ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		Scanner in=new Scanner(System.in);
		String x="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while(in.hasNext()) {
			n=in.nextInt();
			for(int i=0;i<n;i++) {
				int a=i;
				for(;a<n-1;a++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print(x.substring(j,j+1));
				}
				for(int j=i;j>=0;j--) {
				System.out.print(x.substring(25-j,26-j));
				}
				System.out.println();
			}	
		}
        in.close();
	}

}
