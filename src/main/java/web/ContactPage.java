package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ContactPage {
    private SelenideElement buttonCreateContact = $x("//button[@class='ant-btn ant-btn-primary']");

    public void createContact() {
        buttonCreateContact.shouldBe(Condition.enabled).click();
    }

}
