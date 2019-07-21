package ebank.com.vn.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://ebank.tpb.vn/retail/v8/")
public class LoginPage extends PageObject {

    @FindBy(id="login.txt.username")
    private WebElementFacade txt_username;

    @FindBy(id="login.txt.password")
    private WebElementFacade txt_password;
    
    @FindBy(xpath="//div[@class='fix02-btnlight btnshadow btn-second login-input-btn']")
    private WebElementFacade btn_signin;

    public void enter_user_pass(String user, String pass) {
        txt_username.type(user);
        txt_password.type(pass);
    }

    public void click_btn_login() {
        btn_signin.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}