
public class Main {

	public static void main(String[] args) {
		Test <Integer,Double> ob1=new Test <Integer, Double>(543, 234.3);
		
		ob1.test(ob1.getOb(),ob1.getOb2());
		Integer [] a = {1, 2, 3};
		Double [] b ={1.0, 2.0};
		Test.meth(a, b);
		Test.maxMin(a, b);
	}

}
