package SpecificDateFormate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDate {
	public static void main(String[] args) {
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sp = new SimpleDateFormat(pattern);
		System.out.println(sp.format(new Date()));
	}

}
