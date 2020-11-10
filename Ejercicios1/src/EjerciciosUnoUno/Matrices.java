package EjerciciosUnoUno;

import java.util.Random;

public class Matrices {

	public static void main(String[] args) {
		Random r = new Random();
		int mNum[][] = new int[2][2];
		
		for (int i = 0; i < mNum.length; i++) {
			for(int j = 0; j < mNum[i].length; j++) {
				mNum[i][j] = r.nextInt(9);
			}
		}
		for (int i = 0; i < mNum.length; i++) {
			for(int j = 0; j < mNum[i].length; j++) {
				System.out.println((mNum[i][j] = r.nextInt(9)));
			}
			System.out.println("");
		}

	}

}
