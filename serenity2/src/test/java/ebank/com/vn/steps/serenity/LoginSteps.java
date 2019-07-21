package ebank.com.vn.steps.serenity;

import ebank.com.vn.pages.LoginPage;
import net.thucydides.core.annotations.Step;
//import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class LoginSteps {

    LoginPage dictionaryPage;

    @Step
    public void enters(String u, String p) {
        dictionaryPage.enter_user_pass(u,p);
    }

    @Step
    public void start_login() {
        dictionaryPage.click_btn_login();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void login(String term1, String term2) {
        enters(term1,term2);
        start_login();
    }
}