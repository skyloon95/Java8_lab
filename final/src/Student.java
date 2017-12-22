
public class Student {
	private int stNumber; // 학번
	private int score; // 점수
	
	public Student(int stNumber, int score){
		this.stNumber = stNumber;
		this.score = score;
	}
	
	public boolean pass(){
		return score>60; // 60점 이상일 경우 true 리턴
	}
	
	public int getStNumber(){
		return stNumber;
	}
	
	public int getScore(){
		return score;
	}
}
