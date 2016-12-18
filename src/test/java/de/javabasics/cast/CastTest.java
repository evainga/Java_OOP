package de.javabasics.cast;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

public class CastTest {
	@Test
	public void testName() throws Exception {
		SuperClass superClass = new SuperClass();
		SubClass subClass = new SubClass();

		assertThat(subClass, instanceOf(SubClass.class));
		assertThat(superClass, not(instanceOf(SubClass.class)));
		assertThat(superClass, instanceOf(SuperClass.class));

		assertThat(subClass, isA(SubClass.class));
		assertThat(subClass, isA(SuperClass.class));
		assertThat(subClass, is(instanceOf(SuperClass.class)));

		SuperClass yetAnotherSuper = new SubClass();

	}
}
