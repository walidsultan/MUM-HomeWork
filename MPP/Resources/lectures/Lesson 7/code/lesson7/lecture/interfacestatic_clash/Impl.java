package lesson7.lecture.interfacestatic_clash;

public class Impl implements Sup1, Sup2 {
	int x = myMethod();
	public static void main(String[] args) {
		Sup1 i = new Impl();
		//i.myMethod();
	}
	
	public static int myMethod() {
		return 4;
	}
}
