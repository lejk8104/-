	import java.util.Scanner;
public class Go_Calculator {
	public static void main(String[] args)
	{
		String message ="";
		int a = 100, b = 100; //�Է¹��� �� ����(����� ���� ��� 0���� �ʱ�ȭ)
		int result = 0; //�����
		double stopper = 0;
		
		
		for(;;)
		{
			Scanner scan = new Scanner(System.in);
			
			if (a == 100) // �ʱ�ȭ�� ���� ���ο� ���� �Է¹���
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : "); //����� ù��° ���ڸ� �Է¹���
				a = sc.nextInt();
			}
			
			if (b == 100) //�ʱ�ȭ�� ���� ���ο� ���� �Է¹���
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : "); //����� �ι�° ���ڸ� �Է¹���
				b = sc.nextInt();
			}
			System.out.print("��Ģ���� ���ڸ� �Է��Ͻÿ� : ");
			message = scan.nextLine(); //��Ģ���� �Է¹��� +, *, /, -
			
			if(message.equals("+")) //�޼����� +���
			{
				result=a+b;
				System.out.println("�� :" +result); //result�� a+b��� �����
				a = 100; b= 100;                       //���� 100���� ġȯ��
			}
			else if(message.equals("-")) //�޼����� -���
			{
				result = a-b;
				System.out.println("�� :" +result); //result�� a-b��� �����
				a = 100; b= 100;                       //���� 100���� ġȯ��
			}
			else if(message.equals("*")) //�޼����� *���
			{
				result = a*b;
				System.out.println("�� :" +result); //result�� a*b��� �����
				a = 100; b= 100;                       //���� 100���� ġȯ��
			}
			else if(message.equals("/"))
			{
				if(((a<=0)||(b<=0)))  // ��� �� ���ڰ� �Է�  ����
				{
					System.out.println("������ �����ϴ�. ���ڸ� ���Է��Ͻÿ�"); //��� �� ���ڸ� ���Է�
					a=100; b=100;
					continue;
				}
				else
				{
					result = a/b; //�޼����� / ���
					System.out.println("�� : " +result); //result�� a/b��� �����
					a = 100; b= 100;        //���� 100���� ġȯ��
				}	
			}
			else 
			{
				System.out.println("��Ģ������ �߸� �Է��Ͽ����ϴ�.");  // ��Ģ���� �Է� ���� 
				continue;
			}
			}
			
			
}
}
