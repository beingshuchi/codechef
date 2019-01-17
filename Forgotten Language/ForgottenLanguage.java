package pro.cap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForgottenLanguage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter T");
		if(sc.hasNextInt()) {
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			if(sc.hasNextInt()) {
			//System.out.println("Enter N");
			int N=sc.nextInt();
			//System.out.println("Enter K");
			int K=sc.nextInt();
			sc.nextLine();
			
			String arr1[]=new String[N];
			if(N>=1 && N<=100) {
				for (int j = 0; j < N; j++) {
					String str=sc.next();
					if(str.length()>=1 && str.length()<=5) {
						arr1[j]=str;
					}
				}
			}
			
			List<String> list=new ArrayList<String>();
			
			
			if(K>=1 && K<=50) {
				
				for (int j = 0; j < K; j++) {
					if(sc.hasNextInt()) {
					//System.out.println("Enter L");
					int L=sc.nextInt();
					//String arr2[]=new String [L];
					String str;
					if(L>=1 && L<=50) {
						
						//sc.nextLine();
						//for(int l=0;l<N;l++) {
						for(int k=0;k<L;k++) {
							//System.out.println("Enter str");
							str=sc.next();
							
							if(str.length()>=1 && str.length()<=5) {
								list.add(str);							
								}
								//System.out.println(status[l]);
							}
						}
					}
					
				}
			 
			}
			
			for (int j = 0; j <N; j++) {
				if (list.contains(arr1[j])) {
					System.out.print("YES ");
				} else {
					System.out.print("NO ");
				}
			}
			System.out.println();
			
			
		}
			
		
		
	}
		
	}
//piygu ezyfo rzotm


   }
}


/*2
3
2
piygu
ezyfo
rzotm
1
piygu
6
tefwz 
tefwz
piygu
ezyfo
tefwz
piygu
YES YES NO 
4
1
kssdy
tjzhy
ljzym
kegqz
4
kegqz
kegqz
kegqz
vxvyj
NO NO NO YES */