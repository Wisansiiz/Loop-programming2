import java.util.*;
class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;//输入的数
		int sum=0;//阶乘的和
		int s=1;//阶乘
		int i=1;//从i开始的数
		Scanner cin=new Scanner (System.in);
		n=cin.nextInt();
		while(i<=n){
			for(int x=1;x<=i;x++){
				s=s*x;	
			}
			i++;
			sum=sum+s;
			s=1;
		}
		System.out.println(sum);
		cin.close();
	}

}
