package NonReg.TrustServices;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyProfile {
  @Test
  public void f() {
	  System.out.println("My test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("precondition");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("postcondition");
  }

}
