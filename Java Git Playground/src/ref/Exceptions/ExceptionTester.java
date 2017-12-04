package ref.Exceptions;

import org.junit.*;
import org.junit.rules.ExpectedException;

import isaacTerm.IsaacOS;

public class ExceptionTester {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void shouldDie() throws DeathException {
		
	}
}
