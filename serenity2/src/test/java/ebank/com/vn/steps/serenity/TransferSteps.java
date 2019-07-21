package ebank.com.vn.steps.serenity;

import ebank.com.vn.pages.TransferPage;
import net.thucydides.core.annotations.Step;
//import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TransferSteps {

	TransferPage transfer;

	@Step
	public void select() {
		transfer.select_menu();
	}

	@Step
	public void enters_bank(String b) {
		transfer.enter_bank_name(b);
	}
	
	@Step
	public void enters_branch(String bra) {
		transfer.enter_branch_name(bra);
		
	}

	@Step
	public void enter_transfer(String a, String m, String n) {
		transfer.enter_transfer_info(a, m, n);
	}

	@Step
	public void start_transfer() {
		transfer.click_btn_continue();
		
	}
	@Step
	public void start_transfer2() {
		transfer.click_btn_continue2();
		
	}


	@Step
	public void transfer(String term1, String term2, String term3, String term4,String term5) {
		select();
		enters_bank(term1);
		enters_branch(term2);
		enter_transfer(term3, term4, term5);
		start_transfer();
		start_transfer2();

	}
	
	
}