public class PrettyPrinter {
	private String wrapperStart;
	private String wrapperEnd;
	
	public PrettyPrinter() {
		this("[", "]");
	}
	
	public PrettyPrinter(String wrapperStart, String wrapperEnd) {
		this.wrapperStart = wrapperStart;
		this.wrapperEnd = wrapperEnd;
	}
	
	void print(String str) {
		System.out.println(this.wrapperStart + str + this.wrapperEnd);
	}
}