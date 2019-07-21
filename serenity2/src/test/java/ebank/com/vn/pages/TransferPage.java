package ebank.com.vn.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://ebank.tpb.vn/retail/v8/")
public class TransferPage extends PageObject {

	@FindBy(id = "textMenu_2")
	private WebElementFacade menu_Transfer;

	@FindBy(xpath = "//div[@class='swiper-menu-item-icon ripple-add-on']//*[@class='icon-another-bank-account  iconmenu_slide ']")
	private WebElementFacade icon_internsl_Transfer;

	@FindBy(xpath = "//div[@id='cb-container-bank-infor']//*[@class='accountName']")
	private WebElementFacade combo_Bank;

	@FindBy(id = "input.id.inputvalue")
	private WebElementFacade txt_search;

	@FindBy(xpath = "//span[contains(text(),'t Nam - Techcombank, TCB')]")
	private WebElementFacade dropdown_BankName;

	@FindBy(xpath = "//div[@id='divListGroup']//span[contains(text(),'Hà Nội')]")
	private WebElementFacade dropdown_BranchName;

	@FindBy(id = "trans.destaccountnofast")
	private WebElementFacade txt_Receiver_Account;

	@FindBy(id = "trans.amount")
	private WebElementFacade txt_Amount;

	@FindBy(id = "trans.content")
	private WebElementFacade txt_Note;

	@FindBy(xpath = "//*[@value='Tiếp tục']")
	private WebElementFacade btn_Continue;

	private WebElementFacade trCancel;

	public void select_menu() {
		menu_Transfer.waitUntilPresent().click();
		icon_internsl_Transfer.waitUntilPresent().click();
	}

	public void enter_bank_name(String bank) {
		// getDriver().switchTo().frame("f3a80a39cb34bf8");
		combo_Bank.waitUntilPresent().click();
		// getDriver().switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txt_search.waitUntilVisible().type(bank);
		dropdown_BankName.waitUntilPresent().click();
	}

	public void enter_branch_name(String branchName) {
		txt_search.waitUntilPresent().type(branchName);

		dropdown_BranchName.waitUntilPresent().click();

	}

	public void enter_transfer_info(String account, String amount, String note) {
		
		txt_Receiver_Account.waitUntilPresent().type(account);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txt_Amount.waitUntilPresent().click();
		
		txt_Amount.waitUntilPresent().type(amount);
		txt_Note.waitUntilPresent().type(note);
	}

	public void click_btn_continue() {

		btn_Continue.waitUntilPresent().click();
	}

	public void click_btn_continue2() {
try {
	Thread.sleep(60000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		trCancel.waitUntilPresent().click();
	}

}