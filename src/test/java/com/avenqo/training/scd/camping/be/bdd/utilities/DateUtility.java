package com.avenqo.training.scd.camping.be.bdd.utilities;

import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static Date incrementDays(Date date, int incDays) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_YEAR, incDays); // number of days to add
		return c.getTime();
	}
}
