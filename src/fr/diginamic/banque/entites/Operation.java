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

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
}
