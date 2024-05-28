package web;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import page.BaseSelenidePage;

public class Tests extends BaseSelenidePage {
    private final String LOGIN = "admin@admin.ru";
    private final String PASSWORD = "admin1234";
    private final String BASE_URL_LOGIN = "https://172.20.206.75/login";




    @Test
    public void authorizationTest(){
        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN,PASSWORD);
//        new AutorizationPage(BASE_URL_LOGIN)
//                .autorization(LOGIN,PASSWORD);
    }
    @Test
    public void createContact() throws InterruptedException {


        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN,PASSWORD);



        MainPage mainPage = new MainPage();
        mainPage.openContacts();


        ContactPage contactPage = new ContactPage();
        contactPage.createContact();

        CreateNewContactPage createNewContactPage = new CreateNewContactPage();
        createNewContactPage.createNewContact();


//        new AutorizationPage(BASE_URL_LOGIN)
//                .autorization(LOGIN,PASSWORD)
//                .openContacts().createContact();
    }


    @Test
    public void createInterest() throws InterruptedException {
        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN, PASSWORD);

        MainPage mainPage = new MainPage();
        mainPage.openInterests();

        InterestsPage interestsPage = new InterestsPage();
        interestsPage.createInterest();

        CreateNewInterestsPage createNewInterestsPage = new CreateNewInterestsPage();
        createNewInterestsPage.createNewInterest();

        CreatedInterestPage createdInterestPage = new CreatedInterestPage();
        createdInterestPage.buttonStatusInterestIsDisplayed();


    }

    @Test
    public void goNewStatusInterest() throws InterruptedException {
        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN, PASSWORD);

        MainPage mainPage = new MainPage();
        mainPage.openInterests();

        InterestsPage interestsPage = new InterestsPage();
        interestsPage.createInterest();

        CreateNewInterestsPage createNewInterestsPage = new CreateNewInterestsPage();
        createNewInterestsPage.createNewInterest();

        CreatedInterestPage createdInterestPage = new CreatedInterestPage();
        createdInterestPage.goStatusInterest();

    }

    @Test
    public void createDeal() throws InterruptedException {
        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN, PASSWORD);

        MainPage mainPage = new MainPage();
        mainPage.openInterests();

        InterestsPage interestsPage = new InterestsPage();
        interestsPage.createInterest();

        CreateNewInterestsPage createNewInterestsPage = new CreateNewInterestsPage();
        createNewInterestsPage.createNewInterest();

        CreatedInterestPage createdInterestPage = new CreatedInterestPage();
        createdInterestPage.goStatusInterest();

        createdInterestPage.createDeal("В реализации", 1);



    }

    @Test
    public void createAffairs() throws InterruptedException {
        AutorizationPage autorizationPage = new AutorizationPage(BASE_URL_LOGIN);
        autorizationPage.autorization(LOGIN, PASSWORD);

        MainPage mainPage = new MainPage();
        mainPage.openAffairs();

        AffairsPage affairsPage = new AffairsPage();
        affairsPage.createNewThings();
    }
}
