package Assignment5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({BurgerTest.class, HotDogTest.class,DrinkTest.class,CustomerTest.class})
public class CompleteJUnitTest {

}
