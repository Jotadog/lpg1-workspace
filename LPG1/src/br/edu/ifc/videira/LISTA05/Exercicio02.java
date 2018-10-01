package br.edu.ifc.videira.LISTA05;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> arei = new ArrayList<Integer>(20);
		int menor, i, j;
		for (i = 0; i < 20; i++) {
			arei.add(r.nextInt(50));
		}
		System.out.println(arei);
		menor = arei.get(0);
		for (i = 0; i < 20; i++) {
			for (j = i; j < 20; j++) {
				if (arei.get(j) < arei.get(i)) {
					menor = arei.get(j);
					arei.remove(j);
					arei.add(i, menor);
				}
			}
		}
		System.out.println("-------------------");
		System.out.println(arei);
	}
}
