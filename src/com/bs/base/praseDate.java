package com.bs.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class praseDate {
	
	 public static Date StringPraseDate(String time){
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 Date date=new Date();
		 try {
			date= format.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return date;
	 }
	
}
