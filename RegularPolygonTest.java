package domrab;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6, 4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println(p1.getPerimeter());
		System.out.println(p1.getArea());
		System.out.println();
		
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());
		System.out.println();
		
		System.out.println(p3.getPerimeter());
		System.out.println(p3.getArea());
		System.out.println();
	}

}