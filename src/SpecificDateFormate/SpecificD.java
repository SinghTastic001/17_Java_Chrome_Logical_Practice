package SpecificDateFormate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificD {

	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		System.out.println(sd.format(new Date()));
	}
}
