//java.exe를 실행 시원하는 숫자를 매개변수로 넘기고, 그 매개변수에 해당하는 구구단을 출력하시오
class Test4 {
	//main은 개발자가 직접 호출이 불가하며, 간접적으로 호출 할 수 있는데, 그 방법이
	//바로 java.exe에 의해 호출
	//java 6 6단출력
	public static void main(String[] args){
		//js에서는 parseInt() 내장함수로 지원되지만,
		//java언어에서는 Wrapper 클래스가 지원한다

		int n=Integer.parseInt(args[0]); //"6"을 정수화

		for(int a=1; a<=n; a++){
			for(int i=1;i<=9;i++){
				System.out.println(a+"*"+i+"="+(a*i));

			}
		}
	}
}

