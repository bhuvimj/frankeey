package frankey_stepdef;



public class f_stepdef {
	public static Login Log =new Login();
	@Given("^User Launch The Application;$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_url();
		URL(url)  
	}

	@When("^User Enter Email In Email Field;$")
	public void user_Enter_Email_In_Email_Field() throws Throwable {
	   
	}



}
