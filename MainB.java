import java.util.*;
class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;//�������
		int sum=0;//�׳˵ĺ�
		int s=1;//�׳�
		int i=1;//��i��ʼ����
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
