package p146ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
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
		
		for (int i=0;i<mass.length;i++){
			for(int j=0;j<mass.length;j++){
				String max=null;
				if (mass[i].length()>mass[j].length()){
				max=mass[i];
				mass[i]=mass[j];
				mass[j]=max;
				}
			}
			
		}
		System.out.println(" ");
		for (int i=0;i<mass.length;i++){
			System.out.print(mass[i]+ " ");
		}
		int q=0;
		for (int i=0;i<mass.length;i++){
			for(int j=0;j<mass.length;j++){
				if (mass[i].equals(mass[j])){
					q=1;
					break;
				}
			}
		}
		if(q==1){
			System.out.println("есть одинаковые строки");
		}else{
			System.out.println("нет одинаковых строк");
		}
		int maxStr=0;
		int h=0;
		for (int i=0;i<mass.length;i++){
			
			if (mass[i].length()>maxStr){
				maxStr=mass[i].length();
				h=i;
			}
						
		}
		System.out.println(mass[h].subSequence(mass[h].length()-3, mass[h].length()));
		
		mass[2]=mass[2].toUpperCase();
		System.out.println(mass[2]);
		/*String str = "end";
	Scanner sc = new Scanner(System.in);
	int i=2;
	if (sc.hasNextInt()){
		i=sc.nextInt();
		
	}
	String mass[]=new String[i+1];
	for (int j=0; j<mass.length;j++){
		Scanner st = new Scanner(System.in);
		String k="";
		if (sc.hasNextLine()){
			k=sc.nextLine();
		}
		if(mass[j].equals(st)){
			mass[j]="j";
		}else{
			mass[j]=k;
		}
	}
	for (int j=0; j<mass.length;j++){
		System.out.println(mass[j]);
	}*/

	}	
}
