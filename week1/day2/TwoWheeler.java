package week1.day2;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors =2;
	long chassisNumber=1234567890;
    boolean isPunctured =false;
	String bikeName= "S1000R";
	double runningKM = 150000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler bikeOne = new TwoWheeler();
		
		System.out.println(bikeOne.noOfWheels);
		
		System.out.println(bikeOne.noOfMirrors);
		
		System.out.println(bikeOne.chassisNumber);
		
		System.out.println(bikeOne.isPunctured);
		
		System.out.println(bikeOne.bikeName);
		
		System.out.println(bikeOne.runningKM);

	}

}
