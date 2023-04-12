package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;

	Personne(String nvNom, String nvPrenom, AdressePostale nvAdresse) {
		nom = nvNom;
		prenom = nvPrenom;
		adresse = nvAdresse;
	}

	Personne(String nvNom, String nvPrenom) {
		nom = nvNom;
		prenom = nvPrenom;
	}

	void showFullName() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	void setNom(String nvNom) {
		nom = nvNom;
	}

	void setPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}

	void setAdresse(AdressePostale nvAdresse) {
		adresse = nvAdresse;
	}

	String getNom() {
		return nom;
	}

	String getPrenom() {
		return prenom;
	}

	AdressePostale getAdresse() {
		return adresse;
	}
}
