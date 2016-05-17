package p146ex1;

import java.util.Scanner;

public class Test {

	static {
		int b=0;
		System.out.println("введите количество строк");
		Scanner sc = new Scanner(System.in);
		int k = 0;
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		String mass[] = new String[k];
		System.out.println("ведите строки");

		for (int i = 0; i < mass.length; i++) {
			Scanner sc1 = new Scanner(System.in);
			String q = null;
			if (sc1.hasNextLine()) {
				q = sc1.nextLine();
			}
			mass[i]=q;
			if (mass[i].equals("end")){
				b=i;
				break;
			}
		}
		for (; b < mass.length; b++) {
			if(b==0){
				break;
			}else{
				mass[b]=Integer.toHexString(b);
			}
		}
		for (int i = 0; i < mass.length; i++){
			System.out.print(mass[i]+" ");
		}
	}

}
