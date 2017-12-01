package ref.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * This class does (or will) contain multiple methods for testing strings to see if they match
 * some common data types. These types include email addresses only so far, but will include in later versions
 * phone numbers, addresses, dates, and some names as practice code (name ones will be removed shortly after adding). Stay tuned!
 */
public class MultiMatcher {
	String datePattern = "(0[0-9]|(?:1[0-2]))\\/((?:[0-2][0-9])|(?:3[01]))\\/([12][0-9]{3})";
	int storeMonth = 0;
	/**
	 * This method takes a string passed as input and checks it against
	 *  a regular expression to see if it is a valid email address or not.
	 *  It may not work 100% of the time, but it's my first crack at it. 
	 *  Give me some time.
	 * @param input A string that you would like to test against the regular expression predefined in the code
	 * @return True if the string matches the email regex, false if it does not.
	 */
	public boolean eMail(String input) {
	Pattern p = Pattern.compile("^[a-z0-9]{2,}(?:[.|_|-][a-z0-9]{2,}){0,5}@[a-z]{2,}(?:\\-[a-z]{2,}){0,5}(?:\\.[a-z]{2,10}){1,3}$");
	Matcher m = p.matcher(input);
	boolean b = m.matches();
	return b;
	}
	public int dateMonth(String input) {
		int month = 0;
		Pattern p = Pattern.compile(datePattern);
		Matcher m = p.matcher(input);
		if (m.find()) {
			month = Integer.parseInt(m.group(1));
			storeMonth = month;
			return (month >= 1 && month <= 12)? month:0;
		} else {
			return 0;
		}
	}
	public int dateDay(String input) {
		int day = 0;
		Pattern p = Pattern.compile(datePattern);
		Matcher m = p.matcher(input);
		if (m.find()) {
			day = Integer.parseInt(m.group(2));
			int endDay = 0;
			int month = dateMonth(input);
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				endDay = 31;
			}
			return (day >= 1 && day <= endDay)? day:0;
			
		} else {
			return 0;
		}	
	}
	public int dateYear(String input) {
		int year = 0;
		Pattern p = Pattern.compile(datePattern);
		Matcher m = p.matcher(input);
		if (m.find()) {
			year = Integer.parseInt(m.group(3));
			return (year >=1000 && year <= 2017)? year:0;
		} else {
			return 0;
		}
	}
}
