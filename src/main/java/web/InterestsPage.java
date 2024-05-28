package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class InterestsPage {
    private SelenideElement buttonCreateInterest = $x("//button[@class='ant-btn ant-btn-primary']");

    public void createInterest(){
        buttonCreateInterest.shouldBe(Condition.enabled).click();
    }
}
