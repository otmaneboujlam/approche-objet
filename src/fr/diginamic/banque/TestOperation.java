package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Credit credit1 = new Credit("11/04/2023", 100);
		Credit credit2 = new Credit("12/04/2023", 200);
		Debit debit1 = new Debit("11/04/2023", 150);
		Debit debit2 = new Debit("12/04/2023", 175);

		Operation tableauOperation[] = { credit1, credit2, debit1, debit2 };

		for (Operation operation : tableauOperation) {
			System.out.println(operation + " " + operation.getType());
		}

		// TODO : Calculer le montant global de toutes les operations.

	}

}
