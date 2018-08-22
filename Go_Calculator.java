	import java.util.Scanner;
public class Go_Calculator {
	public static void main(String[] args)
	{
		String message ="";
		int a = 100, b = 100; //입력받을 두 숫자(계산이 끝날 경우 0으로 초기화)
		int result = 0; //결과값
		double stopper = 0;
		
		
		for(;;)
		{
			Scanner scan = new Scanner(System.in);
			
			if (a == 100) // 초기화된 값에 새로운 값을 입력받음
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("첫번째 숫자를 입력하시오 : "); //계산할 첫번째 숫자를 입력받음
				a = sc.nextInt();
			}
			
			if (b == 100) //초기화된 값에 새로운 값을 입력받음
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("두번째 숫자를 입력하시오 : "); //계산할 두번째 숫자를 입력받음
				b = sc.nextInt();
			}
			System.out.print("사칙연산 문자를 입력하시오 : ");
			message = scan.nextLine(); //사칙연산 입력받음 +, *, /, -
			
			if(message.equals("+")) //메세지가 +라면
			{
				result=a+b;
				System.out.println("값 :" +result); //result에 a+b라고 출력함
				a = 100; b= 100;                       //값을 100으로 치환함
			}
			else if(message.equals("-")) //메세지가 -라면
			{
				result = a-b;
				System.out.println("값 :" +result); //result에 a-b라고 출력함
				a = 100; b= 100;                       //값을 100으로 치환함
			}
			else if(message.equals("*")) //메세지가 *라면
			{
				result = a*b;
				System.out.println("값 :" +result); //result에 a*b라고 출력함
				a = 100; b= 100;                       //값을 100으로 치환함
			}
			else if(message.equals("/"))
			{
				if(((a<=0)||(b<=0)))  // 계산 할 숫자값 입력  오류
				{
					System.out.println("나눌수 없습니다. 숫자를 재입력하시오"); //계산 할 숫자를 재입력
					a=100; b=100;
					continue;
				}
				else
				{
					result = a/b; //메세지가 / 라면
					System.out.println("값 : " +result); //result에 a/b라고 출력함
					a = 100; b= 100;        //값을 100으로 치환함
				}	
			}
			else 
			{
				System.out.println("사칙연산을 잘못 입력하였습니다.");  // 사칙연산 입력 오류 
				continue;
			}
			}
			
			
}
}
