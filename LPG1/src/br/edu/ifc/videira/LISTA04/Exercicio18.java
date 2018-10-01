package br.edu.ifc.videira.LISTA04;

import java.util.Random;

public class Exercicio18 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int sarrus[][] = new int[3][5];
		int dp[][] = new int[3][3], ds[][] = new int[3][3];
		int dpresult[] = new int[3], dsresult[] = new int[3];
		int i, j, o, somadp = 0, somads = 0;
		Random r = new Random();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matriz[i][j] = r.nextInt(10);
				sarrus[i][j] = matriz[i][j];
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		for (i = 0; i < 3; i++) {
			o = 0;
			for (j = 3; j < 5; j++) {
				sarrus[i][j] = matriz[i][o];
				o++;
			}
		}
		System.out.println();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(sarrus[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				dp[i][j] = sarrus[j][j + i];
				System.out.print(dp[i][j] + " ");
			}
			dpresult[i] = dp[i][0] * dp[i][1] * dp[i][2];
			somadp += dpresult[i];
			System.out.println();
		}
		System.out.println();
		for (i = 0, o = 4; i < 3; i++, o--) {
			for (j = 0; j < 3; j++) {
				ds[i][j] = sarrus[j][o - j];
				System.out.print(ds[i][j] + " ");
			}
			dsresult[i] = ds[i][0] * ds[i][1] * ds[i][2];
			somads += dsresult[i];
			System.out.println();
		}
		System.out.println("dp: " + somadp + " | ds: " + somads + "\ndeterminante: " + (somadp - somads));
	}
}
