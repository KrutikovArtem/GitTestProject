package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private SelenideElement hrefContacts = $x("//a[@href='/contacts']");
    private SelenideElement hrefInterests = $x("//a[@href='/interests']");
    private SelenideElement hrefMyAffairs = $x("//a[@href='/meetings']");
    private SelenideElement hrefСalendar = $x("//span[text()='Календарь']");


    public void openContacts(){
        hrefContacts.shouldBe(Condition.enabled).click();

    }

    public void openInterests(){
        hrefInterests.shouldBe(Condition.enabled).click();

    }

    public void openAffairs(){
        hrefСalendar.shouldBe(Condition.enabled).click();
        hrefMyAffairs.shouldBe(Condition.enabled).click();
    }


}
