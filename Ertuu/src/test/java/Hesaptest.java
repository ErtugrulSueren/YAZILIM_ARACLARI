import org.junit.*;
import org.junit.Assert.*;

public class Hesaptest {
	
	//@org.junit.Test
	@Test
	public void testfak() {
		Hesap h = new Hesap();
		int sonuc = h.faktoriyel(10);
		
		Assert.assertEquals(3628800,sonuc);
		
		
	}

	//10!= 3628800
	
	
		
	}
	
	

