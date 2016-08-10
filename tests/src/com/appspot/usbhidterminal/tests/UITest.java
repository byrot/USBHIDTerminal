package company.fiedler.fmserver.tests;

import android.test.ActivityInstrumentationTestCase2;

import company.fiedler.fmserver.FMServer;

public class UITest extends ActivityInstrumentationTestCase2<FMServer> {

	public UITest(){
		super(FMServer.class);
	}

	//@Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull("ReceiverActivity is null", null);
	}

}
