import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class ExampleTestCase
{
	@Test
	public void test1() {
		Assert.assertEquals("Test", "Test");
	}

	@Test
	public void test2() {
		List<String> words = new ArrayList<String>();
		words.add("Test");
		Assert.assertNotNull(words.get(0));
		Assert.assertTrue(words.contains("Test"));
	}

	@Test
	public void test3() {
		List<String> words = new ArrayList<String>();
		Assert.assertTrue(words.contains("Test123"));
	}

}
