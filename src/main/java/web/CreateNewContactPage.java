package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;

public class CreateNewContactPage {
    private SelenideElement fieldFirstName = $x("//input[@id='f=i=r=s=t=N=a=m=e']");
    private SelenideElement fieldNumberPhone = $x("//input[@id='p=h=o=n=e=s']");
    private SelenideElement buttonCreateContact = $x("//button[@data-type='regular']");






    public void createNewContact() throws InterruptedException {

        String randomNumber =String.valueOf(Math.random()).substring(2,13);

        fieldFirstName.shouldBe(Condition.enabled).val("СозданныйАвто");
        fieldNumberPhone.shouldBe(Condition.enabled).val(randomNumber);
        buttonCreateContact.shouldBe(Condition.enabled).click();
        Thread.sleep(3000);


    }

}
