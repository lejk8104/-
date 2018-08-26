package basic;

public class Exam_3 {

	public static void main(String[] args) {

                for (int i = 0; i < 10; i++) 
                {
                	
                	for (int j = 0; j < (10+i); j++)
                	{                       
                		System.out.print((j < (9 - i)) ? " " : "*"); 

                	}
                       		System.out.println();
                        
		}
//		for(int a=20; a<24; a++)
//	{
//				for(int b=5; b<10; b++)
//				{
//		System.out.println("*");
//	}

//        		}
//		System.out.println(""); // ¾ø¾îµµ ‰Î
	}
}