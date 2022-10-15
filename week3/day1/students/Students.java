package week3.day1.students;

public class Students {

	public static void main(String[] args) {
		
		getStudentInfo(20013156);
		getStudentInfo(20013156, "satheshkumar M");
		getStudentInfo("satheshkumar M", 987654321);

	}
	
	public static void getStudentInfo(int studentid)
	{
		System.out.println("Student id: "+studentid);
	}
	
	public static void getStudentInfo(int studentid, String nameOfStudent)
	{
		System.out.println("Student id: "+studentid + " and " + nameOfStudent);
	}
	
	public static void getStudentInfo(String nameOfStudent, long phoneNumber)
	{
		System.out.println("Student id: "+nameOfStudent + " and " + phoneNumber);
	}

}
