package effectiveJava;

public class TacoSoup extends Mexican {

	public enum Broth { CHICKEN_STOCK, BEEF_STOCK, VEGETABLE_STOCK }
	private final Broth broth;
	
	public static class Builder extends Mexican.Builder<Builder> {
		private final Broth broth;
		
		public Builder(Broth broth) {
			this.broth = broth;
		}
		
		@Override public TacoSoup build() {
			return new TacoSoup(this);
		}
		@Override protected Builder self() {
			return this;
		}
	}
	
	TacoSoup(Builder builder) {
		super(builder);
		broth = builder.broth;
	}
	
	public void printBroth() {
		System.out.println(broth.name());
	}
	
}
