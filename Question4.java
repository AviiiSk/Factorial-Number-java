
// 4. Design method int factorial(int no)  which returns int value to that method. print the results into main method 
//   (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)




public class Question4 {
	
	public int factorial (int no)
	{
		int fact = 1;
		for (int i=1 ; i<=no ; i++)
		{
			fact = fact*i;
			
		}
		return fact;
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Question4 facto = new Question4();
		 int r = facto.factorial(5);
		 
		 
		
		System.out.println("Result of Factorial :" + r);
		
	
	}

}
