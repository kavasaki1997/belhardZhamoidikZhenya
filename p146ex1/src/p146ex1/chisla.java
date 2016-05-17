

public class chisla {

	public static void main(String[] args) {
		int k=0;
		int mass[]=new int[10002];
		for (int j=0;j<mass.length;j++){
		for (int i= 2;;i++){
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
				mass[j]=i;
			}
		}
		System.out.println(mass[10001]);
		}
	}

}
