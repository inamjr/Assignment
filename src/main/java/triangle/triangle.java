package triangle;

public class triangle {

	public static void main(String[] args) {
		
		/**
		 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
		 * equilateral triangle has all three sides the same length. An isosceles
		 * triangle has at least two sides the same length. (It is sometimes specified
		 * as having exactly two sides the same length, but for the purposes of this
		 * exercise we'll say at least two.) A scalene triangle has all sides of
		 * different lengths.
		 *
		 */
		System.out.println("check1  ");
		TriangleConstruct check1 = new TriangleConstruct(1.11,2.11,4.11);
		check1.isEquilateral();
		check1.isIsosceles();
		check1.isScalene();
		
		System.out.println("check2  ");
		TriangleConstruct check2 = new TriangleConstruct(1.11,1.11,1.11);
		check2.isEquilateral();
		check2.isIsosceles();
		check2.isScalene();
		
		System.out.println("check3  ");
		TriangleConstruct check3 = new TriangleConstruct(1.11,2.11,1.11);
		check3.isEquilateral();
		check3.isIsosceles();
		check3.isScalene();

}
}
