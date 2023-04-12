package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOperation;
	private double montantOperation;

	public Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public String toString() {
		return dateOperation + " " + montantOperation;
	}

	public abstract String getType();
}
