import java.util.Scanner;
public class thousandprimes
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

int number = 2;
int testnum = 2;
int count = 0;
boolean isprime = true;

while (count < 1000){
	
	testnum = 2;
	isprime = true;
	
	while (isprime && testnum < (number/2)){
		if(number % testnum == 0){
			isprime = false;
		}
		testnum = testnum + 1;
	}
	
	
	if (isprime){
		
		System.out.print("Prime in position " + (count) + " is: ");
		System.out.println(number);
		count = count + 1;
	}
	
	number = number + 1;

	
}	

}}

