package mang;

import java.util.Arrays;
import java.util.Random;

public class Mang1chieu {

	static int [] mang = new int[21];
	static int [] mangAmTemp=new int[21];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i=0; i<21;i++) {
			mang[i]=random.nextInt(21)-10;
			System.out.print(mang[i]+" ");
		}

		mangAm();
	}

	public static void mangAm() {
		System.out.println("");
		System.out.println(" Mang Âm đã lọc");
		int j=0;
		for(int i=0;i<mang.length;i++) {
			if(mang[i]<0) {
				mangAmTemp[j]=mang[i];
				j++;
			}
		}

		for(int i=0; i<mangAmTemp.length;i++) {
			System.out.print(mangAmTemp[i]+" ");
			
		}
	}

}
