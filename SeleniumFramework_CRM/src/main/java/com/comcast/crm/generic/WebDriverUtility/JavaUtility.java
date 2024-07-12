package com.comcast.crm.generic.WebDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber()
	{
		Random random = new Random();
		int random_int = random.nextInt(5000);
		return random_int;
	}

	public String getSystemDateYYYYDDMM () {
		Date dateObj= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;

	}
	
	public String getRequiredDateYYYYDDMM(int days) {
		Date date= new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		sim.format(date);
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate=sim.format(cal.getTime());
		return reqDate;

	}

}
