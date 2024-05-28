package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPage {
    private SelenideElement inputEmail = $x("//input[@id='e=m=a=i=l']");
    private SelenideElement inputPassword = $x("//input[@id='password']");
    private SelenideElement buttonSubmit = $x("//button[@type='submit']");

    AutorizationPage(String url){
        Selenide.open(url);

    }

    public MainPage autorization(String login, String password){

        inputEmail.shouldBe(Condition.enabled).val(login);
        inputPassword.shouldBe(Condition.enabled).val(password);
        buttonSubmit.shouldBe(Condition.enabled).click();
        return new MainPage();


    }

//    Selenide.open(BASE_URL_LOGIN);
//        Selenide.$x("//input[@id='e=m=a=i=l']").shouldBe(Condition.enabled).val(LOGIN);
//        Selenide.$x("//input[@id='password']").shouldBe(Condition.enabled).val(PASSWORD);
//        Selenide.$x("//button[@type='submit']").shouldBe(Condition.enabled).click();
}
