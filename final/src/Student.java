
public class Student {
	private int stNumber; // �й�
	private int score; // ����
	
	public Student(int stNumber, int score){
		this.stNumber = stNumber;
		this.score = score;
	}
	
	public boolean pass(){
		return score>60; // 60�� �̻��� ��� true ����
	}
	
	public int getStNumber(){
		return stNumber;
	}
	
	public int getScore(){
		return score;
	}
}
