import jdk.nashorn.api.tree.ForInLoopTree;

public class Main {
	
	enum Prefix {
		NANO(-9, "n"),
		MIKRO(-6, "µ"),
		MILLI(-3, "m"),
		NONE(0, ""),
		KILO(3, "k"),
		MEGA(6, "M"),
		GIGA(9, "G");
		
		private int exponent; //for example milli should have exponent = -3
		private String symbol; //for example milli should have "m"
		
		private Prefix(int exponent, String symbol) {
			this.symbol = symbol;
			this.exponent = exponent;
		}
		
		public int getExponent() {
			return exponent;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		public String toString() {
			
			return "der prefix " + this.name() + " hat expo " + Integer.toString(this.exponent) + " und sym " + this.symbol;
			
			// return ;
			// der prefix nano hat den expo -9 und sym n
			//
		} // "" in case of "none"
	}// normalerweise alle inhalte in enums ALLES CAPS schreiben
	
		
	public static void main(String[] args) {
		
		System.out.println(Prefix.NONE);
	}
}
