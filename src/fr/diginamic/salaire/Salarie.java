package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaireMensuel;
	private final String statut = "Salarie";

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	@Override
	public String getStatut() {
		return statut;
	}

	@Override
	public String toString() {
		return "Salarie [salaireMensuel=" + salaireMensuel + ", toString()=" + super.toString() + "]";
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
}
