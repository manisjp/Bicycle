class Wheel {
	private double tireDiam, rimDiam;

	public static final double STANDARD_TIREDIAM = 1.5;
	public static final double STANDARD_RIMDIAM = 26;

	public Wheel() {
		this(STANDARD_TIREDIAM, STANDARD_RIMDIAM);
	}

	public Wheel(double tireDiam, double rimDiam) {
		setTireDiam(tireDiam);
		setRimDiam(rimDiam);
	}

	public double getTireDiam() {
		return tireDiam;
	}
	public void setTireDiam(double tireDiam) {
		this.tireDiam = tireDiam;
	}
	public double getRimDiam() {
		return rimDiam;
	}
	public void setRimDiam(double rimDiam) {
		this.rimDiam = rimDiam;
	}

	public double diam() {
		return rimDiam + tireDiam*2;
	}
	public double circumference() {
		return diam() * Math.PI
	}
}