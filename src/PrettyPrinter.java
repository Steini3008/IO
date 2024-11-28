public class PrettyPrinter {
	private String wrapperStart;
	private String wrapperEnd;
	
	public PrettyPrinter() {
		this.wrapperStart = "[";
		this.wrapperEnd = "]";
	}
	
	void print(String str) {
		System.out.println(this.wrapperStart + str + this.wrapperEnd);
	}
}