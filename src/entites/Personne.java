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
}
