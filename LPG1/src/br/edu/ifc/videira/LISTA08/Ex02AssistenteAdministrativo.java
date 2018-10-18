package br.edu.ifc.videira.LISTA08;

public class Ex02AssistenteAdministrativo extends Ex01Funcionario {
	private String numMatricula;
	private String turno;

	public Ex02AssistenteAdministrativo() {
		
	}
	
		public Ex02AssistenteAdministrativo(String numMatricula, String turno) {
		super("", 0, "");
		this.numMatricula = numMatricula;
		this.turno = turno;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double calculaSalario() {
		if (this.getTurno().equalsIgnoreCase("noturno")) {
			return this.getSalario() * 1.3;
		} else {
			return this.getSalario();
		}
	}
}
