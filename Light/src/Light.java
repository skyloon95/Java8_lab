
public class Light {

	public static void main(String[] args) {
		long lightSpeed, distance;
		
		lightSpeed = 300000;
		
		distance = lightSpeed * 360L * 24 * 60 * 60;
		
		System.out.println("빛이 1년간 이동하는 거리  : " + distance + "km");
		
	}
	
}