/*
 * Circle.java
 * �ۼ���: 2017.5.15
 * �ۼ���: �𼳾�
 * ����: �߽ɰ� ������ �Ӽ��� ���� ���� ǥ���ϴ� Ŭ����
 */
package lab7_4;

public class Circle {
	// (6) 2���� private �ʵ� ���� - ���� �߽�(Point��), ������(int��)
	private Point center;
	private int radius;

	// (7) �޼ҵ� ����/�������̵�
	public Circle(Point center, int radius){
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}
	
	public int getRadius(){
		return radius;
	}

	public Point getCenter(){
		return center;
	}
}
