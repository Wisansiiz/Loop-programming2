import java.util.*;
class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;     //�����ĸ���
		int a=0;       //�ж��Ƿ�Ϊ����
		int n;         //��2��n����
		int i=2,l=2;   //��2��ʼ
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		while(i<=n){
			for(l=2;l<=i/2;l++){
				if(i%l==0)a++;//a������0����Ϊ����
			}
			i++;
			if(a==0)sum++;
			else sum+=0;
			a=0;       //��a����Ϊ0
		}
        cin.close();
        System.out.println(sum);
	}

}
