class Gear {

	private double chainring, cog;

	public static final double STANDARD_CHAINRING = 52;
	public static final double STANDARD_COG = 11;

	public Gear() {
		this(STANDARD_CHAINRING,STANDARD_COG);
	}

	public Gear(double chainring, double cog) {
		setChainring(chainring);
		setCog(cog);
	}

	public double getChainring() {
		return chainring;
	}
	public void setChainring(double chainring) {
		this.chainring = chainring;
	}
	public double getCog() {
		return cog;
	}
	public void setCog(double cog) {
		this.cog = cog;
	}


	public double ratio() {
		return this.chainring / this.cog;
	}
	public double gearInches() {
		return ratio() * Wheel.diam();
	}
}