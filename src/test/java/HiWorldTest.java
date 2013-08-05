import org.junit.Test;

import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import com.inspur.dengpf.HiWorld;


public class HiWorldTest {
	@Test
	public void testSayHi(){
		HiWorld hiworld=new HiWorld();
		String result=hiworld.sayHello();
		assertEquals("Hello world Mavne!",result);
	}

}
