//java.exe�� ���� �ÿ��ϴ� ���ڸ� �Ű������� �ѱ��, �� �Ű������� �ش��ϴ� �������� ����Ͻÿ�
class Test4 {
	//main�� �����ڰ� ���� ȣ���� �Ұ��ϸ�, ���������� ȣ�� �� �� �ִµ�, �� �����
	//�ٷ� java.exe�� ���� ȣ��
	//java 6 6�����
	public static void main(String[] args){
		//js������ parseInt() �����Լ��� ����������,
		//java������ Wrapper Ŭ������ �����Ѵ�

		int n=Integer.parseInt(args[0]); //"6"�� ����ȭ

		for(int a=1; a<=n; a++){
			for(int i=1;i<=9;i++){
				System.out.println(a+"*"+i+"="+(a*i));

			}
		}
	}
}

