package week1.day2;

public class Car {
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		
		obj.printCarName();
		
		int getNumber = obj.getCarNumber();
		System.out.println(getNumber);
		
		String getColor = obj.getCarColor();
		System.out.println("The Car colour is :" +getColor);
		
		boolean carPuncture = obj.isCarPuncture();
		System.out.println(carPuncture);
		
		int addNumbers = obj.addThreeNumbers(5, 4, 3);
		System.out.println("Sum of Numbers : "+addNumbers);
		
		int subNumbers = obj.subTwoNumbers(5, 4);
		System.out.println("Sub of Numbers : "+subNumbers);
		
		float mulNumbers = obj.mutiplyThreeNumbers(5, 4,3);
		System.out.println("Multiple of Numbers : "+mulNumbers);
		
		int divNumbers = obj.divTwoNumbers(5, 4);
		System.out.println("Divide of Numbers : "+divNumbers);
	}	
		public void printCarName()
		{
			System.out.println("The Car Name : Mini cooper");
		}
		
		public int getCarNumber()
		{
			int carNumber = 1234;
			return carNumber;
		}
		
		public String getCarColor()
		{
			String color = "Black";
			return color;
		}
		
		public boolean isCarPuncture()
		{
			boolean isPuncture = true;
			return isPuncture;
		}
		
		public int addThreeNumbers(int num1, int num2, int num3)
		{
			int num4 = num1+num2+num3;
			return num4;
		}
		
		private int subTwoNumbers(int num1, int num2)
		{
			int num3 = num1 - num2;
			return num3;
		}
		
		float mutiplyThreeNumbers(float num1, float num2, float num3)
		{
			float num4 = num1 * num2 * num3;
			return num4;
		}
		
		public int divTwoNumbers(int num1, int num2)
		{
			int num3 = num1 / num2;
			return num3;
		}

}
