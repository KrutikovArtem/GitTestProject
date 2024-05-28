package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AffairsPage {
    private SelenideElement buttonScheduleThings = $x("//span[text()='Запланировать дело']");
    private SelenideElement fieldTypeThings = $x("//input[@id='type']");
    private SelenideElement fieldCall = $x("//*[text()='Звонок']");
    private SelenideElement fieldWithWhom = $x("//input[@id='relationWith']");
    private SelenideElement fieldPersonResponsible = $x("//div[@id='relationWith_list']/following-sibling::div/div/div/div");
    private SelenideElement buttonCreateThings = $x("//span[text()='Создать дело']");


    public void createNewThings() throws InterruptedException {
        buttonScheduleThings.shouldBe(Condition.enabled).click();
        fieldTypeThings.shouldBe(Condition.enabled).click();
        Thread.sleep(1000);
        fieldCall.shouldBe(Condition.enabled).click();
        fieldWithWhom.shouldBe(Condition.enabled).click();
        fieldPersonResponsible.shouldBe(Condition.enabled).click();
        buttonCreateThings.shouldBe(Condition.enabled).click();







    }

}


