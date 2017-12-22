
public class SoftwareStudent extends Student {
	private int absent;

	public SoftwareStudent(int stNumber, int score, int absent) {
		super(stNumber, score);
		this.absent = absent;
	}
	
	@Override
	public boolean pass (){
		return (getScore()>60 && absent<=3);
	}
	
}
