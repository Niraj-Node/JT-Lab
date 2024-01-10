package Task2;

public class Line implements RelationInterface {

	private double x1, x2, y1, y2;
	private double length = -1.0;
	
	public Line(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	private void getLength() {
		this.length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	
	@Override
	public boolean isGreater(Line l) {
		if(this.length == -1.0)
			this.getLength();
		if(l.length == -1.0)
			l.getLength();
		
		return (this.length > l.length) ? true : false;
	}

	@Override
	public boolean isLess(Line l) {
		if(this.length == -1.0)
			this.getLength();
		if(l.length == -1.0)
			l.getLength();
		
		return (this.length < l.length) ? true : false;
	}

	@Override
	public boolean isEqual(Line l) {
		if(this.length == -1.0)
			this.getLength();
		if(l.length == -1.0)
			l.getLength();
		
		return (this.length == l.length) ? true : false;
	}

}
