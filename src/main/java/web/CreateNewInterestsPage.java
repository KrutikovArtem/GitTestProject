package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateNewInterestsPage {

    private SelenideElement fieldFirstName = $x("//input[@id='e=x=t=e=r=n=a=l=C=o=n=t=a=c=t_f=i=r=s=t=N=a=m=e']");
    private SelenideElement fieldNumberPhone = $x("//input[@id='e=x=t=e=r=n=a=l=C=o=n=t=a=c=t_c=o=m=m=u=n=i=c=a=t=i=o=n_p=h=o=n=e']");
    private SelenideElement buttonCreateContact = $x("//button[@data-type='regular']");


    public void createNewInterest() throws InterruptedException {
        String randomNumber =String.valueOf(Math.random()).substring(2,13);
        fieldFirstName.shouldBe(Condition.enabled).val("Автотест");
        fieldNumberPhone.shouldBe(Condition.enabled).val(randomNumber);
        buttonCreateContact.shouldBe(Condition.enabled).click();
        Thread.sleep(3000);

    }



}

