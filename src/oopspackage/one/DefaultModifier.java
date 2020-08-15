package oopspackage.one;

public class DefaultModifier {
	
	void sum(int a, int b){
		System.out.println(a+b);
	}
	
	private void add(){
		System.out.println(" private add method");
	}
	
	protected int multiply(int a){
		return a;
	}
	
	public void div(){
		System.out.println("public method");
	}
  public static void main(String[] args) {
	DefaultModifier obj = new DefaultModifier();
	obj.sum(10, 100);
	obj.add();
	System.out.println(obj.multiply(100));
	obj.div();
}
}
