package week1.day2;

public class AccessCarSamePackage {

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
		
		//Private method unable to access
		//int subNumbers = obj.subTwoNumbers(5, 4);
		//System.out.println("Sub of Numbers : "+subNumbers);
		
		float mulNumbers = obj.mutiplyThreeNumbers(5, 4,3);
		System.out.println("Multiple of Numbers : "+mulNumbers);
		
		int divNumbers = obj.divTwoNumbers(5, 4);
		System.out.println("Divide of Numbers : "+divNumbers);
		
		
		
	}

}
