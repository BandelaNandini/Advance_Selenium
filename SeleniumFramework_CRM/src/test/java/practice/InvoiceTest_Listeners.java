package practice;

//Git Conflict check from user 1
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crmcast.crm.generic.BaseUtility.BaseClass;
//@Listeners(com.comcast.crm.listenerUtility.ListImpClass.class)
public class InvoiceTest_Listeners extends BaseClass {
	@Test
	public void createInvoiceTest()  {
		System.out.println("excute createInvoiceTest");
		
	String actTitle = driver.getTitle();
	Assert.assertEquals(actTitle, "login");
	System.out.println("steps after assert");
	}

	@Test
	public void createInvoiceWithContactTest() {
		System.out.println("Excute createInvoiceWithContactTest");
		System.out.println("step-1");
		System.out.println("step-2");

	}
}
