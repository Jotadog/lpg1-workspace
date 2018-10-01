package br.edu.ifc.videira.LISTA03;

public class Exercicio10 {
	public static void main(String[] args) {
		int i=0;
		double massa=1000,h=0,m=0,tempo;
		while(massa >= 0.5) {
			massa /= 2;
			i++;
		}
		tempo = i*50;
		for(;;) {
			if(tempo >= 3600) {
				h++;
				tempo -= 3600;
			} else if(tempo >= 60) {
				m++;
				tempo -= 60;
			} else {
				System.out.println((int)h+":"+(int)m+":"+(int)tempo);
				break;
			}
		}
	}
}
