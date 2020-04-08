package triangle;

public class TriangleConstruct {

	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	
	public TriangleConstruct() {
		super();
	}


	public TriangleConstruct(double sideOne, double sideTwo, double sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}


	public double getSideOne() {
		return sideOne;
	}


	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}


	public double getSideTwo() {
		return sideTwo;
	}


	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}


	public double getSideThree() {
		return sideThree;
	}


	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}

	
	public boolean isEquilateral() {
		 
		if(this.sideOne==this.sideTwo && this.sideTwo==this.sideThree& this.sideOne==this.sideThree){
			 System.out.println(" This triangle is Equilateral");
		}
		return false;
		}

	public boolean isIsosceles() {
		if(this.sideOne!=this.sideTwo & this.sideTwo>=this.sideThree ) {
		
			
			System.out.println(" This triangle is Isosceles");
		}
		
		return false;
		
	}
	
	public boolean isScalene() {
		if(this.sideOne!=this.sideTwo && this.sideTwo!=this.sideThree &this.sideOne!=this.sideThree) {
			System.out.println(" This triangle is Scalene ");
		}
		
		return false;
	}
}
