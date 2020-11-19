
public class Main {
	
	enum Prefix {
		NANO(-9, "n"),
		MIKRO(-6, "µ"),
		MILLI(-3, "m"),
		NONE(0, ""),
		KILO(3, "k"),
		MEGA(6, "M"),
		GIGA(9, "G");
		
		// attributes
		private int exponent;
		private String symbol;
		
		// constructors
		private Prefix(int exponent, String symbol) {
			this.symbol = symbol;
			this.exponent = exponent;
		}
		
		// methods
		public int getExponent() {
			return exponent;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		public String toString() {
			if (this.exponent == 0) return "der prefix " + this.name() + " hat den exponenten " + Integer.toString(this.exponent) + " und kein symbol.";
			else return "der prefix " + this.name() + " hat den exponenten " + Integer.toString(this.exponent) + " und symbol " + this.symbol + ".";
		} // "" in case of "none"
	}// normalerweise alle inhalte in enums groﬂ schreiben
		
	public static void main(String[] args) {
		System.out.println(Prefix.MIKRO);
	}
}
