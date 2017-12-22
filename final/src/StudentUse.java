import java.util.ArrayList;

public class StudentUse {

	public static void main(String[] args) {
		System.out.println("final : 모설아\n");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(201432014,100));
		studentList.add(new Student(201432024, 54));
		
		studentList.add(new SoftwareStudent(201732022, 78, 4));
		studentList.add(new SoftwareStudent(201732012, 61, 2));
		
		for(int i = 0 ; i < studentList.size() ; i++){
			System.out.println(studentList.get(i).getStNumber()+" : "+ printPass(studentList.get(i)));
		}
		
	}
	
	private static String printPass(Student st){
		
		if(st.pass()){
			return "합격";
		}
		else{
			return "불합격";
		}
	}

}