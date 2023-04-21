package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date dateNow = new Date(121, 03, 21);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateNowString = formateur1.format(dateNow);
		System.out.println(dateNowString);

		Date dateOld = new Date(116, 04, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateOldString = formateur2.format(dateOld);
		System.out.println(dateOldString);

		Date dateNowSystem = new Date();
		String dateNowSystemString = formateur2.format(dateNowSystem);
		System.out.println(dateNowSystemString);
	}

}
