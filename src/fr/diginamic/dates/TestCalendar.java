package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyy");
		String dateOld = formateur1.format(cal.getTime());
		System.out.println(dateOld);

		Calendar calNow = Calendar.getInstance();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateNow = formateur2.format(calNow.getTime());
		System.out.println(dateNow);

		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		String dateNowFr = formateur3.format(calNow.getTime());
		System.out.println(dateNowFr);

		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
		String dateNowCh = formateur4.format(calNow.getTime());
		System.out.println(dateNowCh);

		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMANY);
		String dateNowAl = formateur5.format(calNow.getTime());
		System.out.println(dateNowAl);

		Locale RUSSE = new Locale("RU", "ru");
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEE dd MMMM yyyy", RUSSE);
		String dateNowRu = formateur6.format(calNow.getTime());
		System.out.println(dateNowRu);
	}

}
