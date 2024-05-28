package web;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CreatedInterestPage {

    private SelenideElement buttonStatusInterest = $x("//button[@class='ant-btn ant-btn-primary']//span[text()='Интерес']");

    private SelenideElement buttonYesStatus = $x("//button/span[text()='Да']");
    private SelenideElement buttonEndStatus = $x("//button/span[text()='Завершить']");
    private SelenideElement buttonFavorites = $x("//div[text()='Избранное']");
    private SelenideElement buttonAddOn = $x("//button/span[text()='Добавить ОН']");
    private SelenideElement buttonList = $x("//span[text()='Список']");
    private SelenideElement buttonSetFilter = $x("//button[@title='Настроить фильтры']");
    private SelenideElement fieldStatus = $x("//input[@id='status']");
    private SelenideElement buttonSerFilter = $x("//span[text()='Применить']");
    private ElementsCollection checkBoxOn = $$x("//td//input[@class='ant-checkbox-input']");
    private SelenideElement buttonAddСhosenOn = $x("//span[contains(text(),'Добавить в Избранное')]");
    private SelenideElement buttonReserved = $x("//span[text()='Забронировать']");
    private SelenideElement buttonReservedYes = $x("//span[text()='Да']");
    private SelenideElement fieldTypeReserved = $x("//input[@id='bookingType']");
    private SelenideElement fieldTypePayment = $x("//input[@id='paymentMethod']");
    private SelenideElement stringFree = $x("//div[@title='Бесплатная']");
    private SelenideElement stringIpoteka = $x("//div[@title='Ипотека']");
    private SelenideElement buttonMeinReserved = $x("//div[@class='ant-drawer-footer']//span[text()='Забронировать']");
    private final String realizacii ="В реализации";




    public void buttonStatusInterestIsDisplayed(){

        buttonStatusInterest.shouldBe(Condition.visible);

    }

    public void goStatusInterest(){

        buttonStatusInterest.shouldBe(Condition.enabled).click();
        buttonYesStatus.shouldBe(Condition.enabled).click();
        buttonEndStatus.shouldBe(Condition.enabled);

    }

    public void createDeal(String status, int checkBox){


        buttonFavorites.shouldBe(Condition.enabled).click();
        buttonAddOn.shouldBe(Condition.enabled).click();
        buttonList.click();
        buttonSetFilter.shouldBe(Condition.enabled).click();
        fieldStatus.click();
        fieldStatus.shouldBe(Condition.enabled).val(status).pressEnter();
        checkBoxOn.shouldBe(CollectionCondition.sizeGreaterThan(1));
        checkBoxOn.get(checkBox).click();
        buttonAddСhosenOn.shouldBe(Condition.enabled).click();
        buttonReserved.shouldBe(Condition.enabled).click();
        buttonReservedYes.shouldBe(Condition.enabled).click();
        fieldTypeReserved.shouldBe(Condition.enabled).click();
        stringFree.shouldBe(Condition.enabled).click();
        fieldTypePayment.shouldBe(Condition.enabled).click();
        stringIpoteka.shouldBe(Condition.enabled).click();
        buttonMeinReserved.shouldBe(Condition.enabled).click();
        buttonFavorites.shouldBe(Condition.visible);







    }
}


