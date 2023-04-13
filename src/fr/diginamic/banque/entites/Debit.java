package fr.diginamic.banque.entites;

public class Debit extends Operation {

	private final String TYPE = "DEBIT";

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);

	}

	@Override
	public String getType() {
		return TYPE;
	}

}
