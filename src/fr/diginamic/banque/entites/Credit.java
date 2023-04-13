package fr.diginamic.banque.entites;

public class Credit extends Operation {

	private final String TYPE = "CREDIT";

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);

	}

	@Override
	public String getType() {
		return TYPE;
	}

}
