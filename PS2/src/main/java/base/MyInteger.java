package base;

public class MyInteger {
	
	int value;
	
	public MyInteger (int value)
	{
		this.value = value;
		
	}
	public int getValue()
	{
		return this.value;
	}
	
	public boolean isEven()
	{
		return (this.value % 2 == 0);
	}
	
	public boolean isOdd()
	{
		return (value % 2 != 0);
	}
	
	public boolean isPrime()
	{
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value)
	{
		return (value % 2 != 0);
	}
	
	public static boolean isPrime(int value)
	{
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger input)
	{
		return (input.value % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger input)
	{
		return (input.value % 2 != 0);
	}
	
	public static boolean isPrime(MyInteger input)
	{
		for (int i = 2; i < input.value; i++) {
			if (input.value % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int input){
		if (this.value == input) 
			return true;
		else 
			return false;
	}
	public boolean equals(MyInteger input){
		if (this.value == input.value) 
			return true;
		else 
			return false;
	}
}
