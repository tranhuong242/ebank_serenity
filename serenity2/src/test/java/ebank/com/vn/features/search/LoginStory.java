package ebank.com.vn.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ebank.com.vn.steps.serenity.LoginSteps;
import ebank.com.vn.steps.serenity.TransferSteps;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps anna;
    @Steps
    public TransferSteps transfer_money;

    @Issue("#WIKI-1")
    @Test
    public void login_ebank() {
        anna.is_the_home_page();
        anna.login("tranhuong242","tran1234");
       // anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
        transfer_money.select();
    	transfer_money.enters_bank("Techcombank");
    	transfer_money.enters_branch("Hà Nội");
    	transfer_money.enter_transfer("19028754379017", "10000", "huongtt");
    	transfer_money.start_transfer();
    	transfer_money.start_transfer2();
      
    }
    
 
} 