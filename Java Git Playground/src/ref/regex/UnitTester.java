package ref.regex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
/**
 * This is my first class that uses JUnit to unit test my code.
 * This is unit testing some code from my MultiMatcher class. See the file by the same name
 * in this package.
 * It works pretty well, except my code is so simple it's hard to mess up.
 * I'll try this again later after I do stuff that would actually warrant
 * actual unit testing. As I said in my last Javadoc, Stay Tuned! I might do something
 * that actually has a useful function to other people in the forseeable future, who knows?!
 */
public class UnitTester {
	private MultiMatcher m;
	String eMailPatternStr;
	String testDate1 = "01/28/2001";
	String testDate2 = "10/19/2000";
	String testDate3 = "05/17/2001";
	String testDate4 = "03/07/2014";
	@Before
	public void setup() {
		m = new MultiMatcher();
		eMailPatternStr = "^[a-z0-9]{2,}(?:[.|_|-][a-z0-9]{2,}){0,5}@[a-z]{2,}(?:\\-[a-z]{2,}){0,5}(?:\\.[a-z]{2,10}){1,3}$";
	}
	/**
	 * This has some basic code that will pass its unit test. If it doesn't there is something very
	 * wrong with my code and I need to go fix it. This is like the final warning light coming on kind of thing.
	 * One basic test case for general and one for each of my data types: email, phone, street address, etc.
	 *  
	 */
	@Test
	public void basicTests() {
		assertEquals(9, (3*3)); //just a quick test to make sure everything is running smoothly
		assertTrue(m.eMail("email@domain.net")); //example valid email
		
		assertFalse(m.eMail("")); //a blank string should return false
    }
	/**
	 * This Test tests the regular expression's ability to maintain a true return
	 * even when legal modifications to the username in the address are made.
	 */
	@Test
	public void userNameModifications() {
		assertTrue(m.eMail("hyphenated-username@domain.net")); //hyphen in username
		assertTrue(m.eMail("underscored_username@domain.net")); //underscore in username
		assertTrue(m.eMail("dots.in.username@domain.net")); //dots in username
		
	}
	/**
	 * This test tests the expression's ability to maintain true with legal domain
	 * changes, like subdomains, hyphens, or a domain extension longer than 3 letters long.
	 */
	@Test
	public void domainModifications() {
		assertTrue(m.eMail("email@subdomain.domain.net")); //dotted subdomain (e.g. subdomain.tumblr.com, subdomain.wordpress.com, etc.)
		assertTrue(m.eMail("email@hyphenated-url.net")); //hyphen in the domain name
		assertTrue(m.eMail("email@chawks.club")); //customized domain extension
	}
	/**
	 * 
	 */
	@Test
	public void dateReturnMonth() {
		assertEquals(1, m.dateMonth(testDate1));
		assertEquals(10, m.dateMonth(testDate2));
		assertEquals(5, m.dateMonth(testDate3));
		assertEquals(3, m.dateMonth(testDate4));
	}
	@Test
	public void dateReturnDay() {
		assertEquals(28, m.dateDay(testDate1));
		assertEquals(19, m.dateDay(testDate2));
		assertEquals(17, m.dateDay(testDate3));
		assertEquals(7, m.dateDay(testDate4));
	}
	@Test
	public void dateReturnYear() {
		assertEquals(2001, m.dateYear(testDate1));
		assertEquals(2000, m.dateYear(testDate2));
		assertEquals(2001, m.dateYear(testDate3));
		assertEquals(2014, m.dateYear(testDate4));
	}

}