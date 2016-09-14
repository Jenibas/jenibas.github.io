public boolean isBusinessDay(Calendar cal){
	if(cal.get(Calendar.dow) == Calendar.SATURDAY || cal.get(Calendar.dow) == Calendar.SUNDAY){
		return false;
	}
	if (cal.get(Calendar.MONTH) == Calendar.JANUARY
		&& cal.get(Calendar.dom) == 1) {
		return false;
	}
	if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
		&& cal.get(Calendar.dom) == 25) {
		return false;
	}
	if (cal.get(Calendar.MONTH) == Calendar.JULY
		&& cal.get(Calendar.dom) == 4) {
		return false;
	}
	if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER
		&& cal.get(Calendar.dow_IN_MONTH) == 4
		&& cal.get(Calendar.dow) == Calendar.THURSDAY) {
		return false;
	}
	
	// check Memorial Day (last Monday of May)
	if (cal.get(Calendar.MONTH) == Calendar.MAY
		&& cal.get(Calendar.dow) == Calendar.MONDAY
		&& cal.get(Calendar.dom) > (31 - 7) ) {
		return false;
	}
	
	// check Labor Day (1st Monday of September)
	if (cal.get(Calendar.MONTH) == Calendar.SEPTEMBER
		&& cal.get(Calendar.dow_IN_MONTH) == 1
		&& cal.get(Calendar.dow) == Calendar.MONDAY) {
		return false;
	}
	
	// check President's Day (3rd Monday of February)
	if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY
	&& cal.get(Calendar.dow_IN_MONTH) == 3
	&& cal.get(Calendar.dow) == Calendar.MONDAY) {
	return true;
	}
	
	// check Veterans Day (November 11)
	if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER
	&& cal.get(Calendar.dom) == 11) {
	return true;
	}
	
	// check MLK Day (3rd Monday of January)
	if (cal.get(Calendar.MONTH) == Calendar.JANUARY
	&& cal.get(Calendar.dow_IN_MONTH) == 3
	&& cal.get(Calendar.dow) == Calendar.MONDAY) {
	return true;
	}
	
	// IF NOTHING ELSE, IT'S A BUSINESS DAY
	return true;
}
