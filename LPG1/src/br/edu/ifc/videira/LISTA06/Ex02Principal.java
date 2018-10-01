package br.edu.ifc.videira.LISTA06;

import java.util.Random;

public class Ex02Principal {
	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		Random r = new Random();
		ex.setN1(r.nextInt(10));
		ex.setN2(r.nextInt(10));
		System.out.println("Antes: n1 = " + ex.getN1() + " e n2 = " + ex.getN2());
		ex.troca();
		System.out.println("Depois: n1 = " + ex.getN1() + " e n2 = " + ex.getN2());
	}
}
