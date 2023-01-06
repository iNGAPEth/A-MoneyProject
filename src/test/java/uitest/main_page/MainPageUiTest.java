package uitest.main_page;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.main_page.MainHeaderPage;
import page.main_page.MainPage;
import page.main_page.MainRegisterPage;
import page.main_page.MainForgotPasswordPage;
import page.main_page.MainSliderPage;
import uitest.core_uitest.BaseUiTest;


public class MainPageUiTest extends BaseUiTest {
    @Test(testName = "testPositiveWithValidCredentials",
            groups = {"Smoke"},
            description = "Тест с валидными данными пользователя")
    public void testPositiveWithValidCredentials() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405577")
                .fillPasswordField("Moby000+")
                .pressEntranceButton()
                .getUserMainPageErrorMessage();
    }

    @DataProvider (name = "testDataProviderFieldNumber")
    public Object[][] getDataProviderFieldNumber() {
        return new Object[][] {{"+79243405"},{"+/-[}?>"},{" "},{"саша"},{"sasha"},{"+13458451214587452158456789"}};
    }

    @Test (testName = "testDataProviderFieldNumber",
            groups = {"Smoke"},
            description = "Тест поля Телефон на неверный номер телефона, на спецсимволы, на пустую строку, на кириллицу, на латиницу, на количество значений",
            dataProvider = "testDataProviderFieldNumber")
    public void testDataProvider(String object) {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField(object)
                .getInvalidPhoneNumberErrorMessage();
    }

//    @Test(testName = "testNegativeWithSpecialSymbolsNumberField",
//            groups = {"Smoke"},
//            description = "Тест поля Телефон на спецсимволы")
//    public void testNegativeWithSpecialSymbolsNumberField() {
//        new MainPage(driver)
//                .pressRegisterByPhoneButton()
//                .fillPhoneNumberField("+/-[}?>")
//                .getSpecialSymbolsPhoneFieldErrorMessage();
//    }
//
//    @Test(testName = "testNegativeIsEmptyNumberFiled",
//            groups = {"Smoke"},
//            description = "Тест поля Телефон на пуствую строку")
//    public void testNegativeIsEmptyNumberFiled() {
//        new MainPage(driver)
//                .pressRegisterByPhoneButton()
//                .fillPhoneNumberField(" ")
//                .getIsEmptyPhoneNumberErrorMessage();
//    }
//
//    @Test(testName = "testNegativeCyrillicSymbolsNumberField",
//            groups = {"Smoke"},
//            description = "Тест поля Телефон на ввод кириллицы")
//    public void testNegativeCyrillicSymbolsNumberField() {
//        new MainPage(driver)
//                .pressRegisterByPhoneButton()
//                .fillPhoneNumberField("саша")
//                .getCyrillicPhoneNumberErrorMessage();
//    }
//
//    @Test(testName = "testNegativeLatinSymbolsNumberField",
//            groups = {"Smoke"},
//            description = "Тест поля Телефон на ввод латиницы")
//    public void testNegativeLatinSymbolsNumberField() {
//        new MainPage(driver)
//                .pressRegisterByPhoneButton()
//                .fillPhoneNumberField("sasha")
//                .getLatinPhoneNumberErrorMessage();
//    }
//
//    @Test(testName = "testNegativeMaxSymbolsNumberField",
//            groups = {"Smoke"},
//            description = "Тест поля Телефон на максимальный ввод значений")
//    public void testNegativeMaxSymbolsNumberField() {
//        new MainPage(driver)
//                .pressRegisterByPhoneButton()
//                .fillPhoneNumberField("+13458451214587452158451581548548543274274")
//                .getMaxSymbolsPhoneNumberErrorMessage();
//    }

    @Test(testName = "testNegativeWithInvalidPassword",
            groups = {"Smoke"},
            description = "Тест с неверным паролем")
    public void testNegativeWithInvalidPassword() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405849")
                .fillPasswordField("Moby000")
                .pressEntranceButton()
                .getInvalidPasswordErrorMessage();
    }

    @Test(testName = "testNegativeSpecialSymbolsPasswordField",
            groups = {"Smoke"},
            description = "Тест поля Пароль на спецсимволы")
    public void testNegativeSpecialSymbolsPasswordField() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405849")
                .fillPasswordField("+/-[}?>")
                .pressEntranceButton()
                .getSpecialSymbolsPasswordFieldErrorMessage();
    }

    @Test(testName = "testNegativeIsEmptyPasswordField",
            groups = {"Smoke"},
            description = "Тест поля Пароль на пустую строку")
    public void testNegativeIsEmptyPasswordField() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405849")
                .fillPasswordField(" ")
                .pressEntranceButton()
                .getIsEmptyPasswordFieldErrorMessage();
    }

    @Test(testName = "testNegativeCyrillicSymbolsPasswordField",
            groups = {"Smoke"},
            description = "Тест поля Пароль на ввод криллицы")
    public void testNegativeCyrillicSymbolsPasswordField() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405849")
                .fillPasswordField("компания")
                .pressEntranceButton()
                .getCyrillicPasswordFieldErrorMessage();
    }

    @Test(testName = "testNegativeMaxSymbolsPasswordField",
            groups = {"Smoke"},
            description = "Тест поля Пароль на максимальный ввод значений")
    public void testNegativeMaxSymbolsPasswordField() {
        new MainPage(driver)
                .pressRegisterByPhoneButton()
                .fillPhoneNumberField("+79243405849")
                .fillPasswordField("companyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy")
                .pressEntranceButton()
                .getMaxSymbolsPasswordFieldErrorMessage();
    }

    @Test(testName = "testPositiveDemoModeButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке Демо режим с главной страницы")
    public void testPositiveDemoModeButtonMainPage() {
        new MainPage(driver)
                .pressDemoModeButton();
//                .getDemoModeButtonErrorMessage();

    }

    @Test(testName = "testPositiveForgetPasswordButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке Забыли пароль? с главной страницы")
    public void testPositiveForgetPasswordButtonMainPage() {
        new MainPage(driver)
                .pressForgetPasswordButton()
                .getForgetPasswordButtonErrorMessage();
    }

    @Test(testName = "testPositiveDownloadAppStoreButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке DownloadAppStore для скачивания Apple с главной страницы")
    public void testPositiveDownloadAppStoreButtonMainPage() {
        new MainPage(driver)
                .pressDownloadAppStoreButton();
//                .getDownloadAppStoreButtonErrorMessage();
    }

    @Test(testName = "testPositiveDownloadGooglePlayButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке DownloadGooglePlay для скачивания Android с главной страницы")
    public void testPositiveDownloadGooglePlayButtonMainPage() {
        new MainPage(driver)
                .pressDownloadGooglePlayButton();
//                .getDownloadGooglePlayButtonErrorMessage();
    }

    @Test(testName = "testPositiveSwitchEnButtonMainPage",
            groups = {"Smoke"},
            description = "Тест кнопки RuEn для перевода на английский язык на главной странице")
    public void testPositiveSwitchEnButtonMainPage() {
        new MainPage(driver)
                .pressRuEnButton()
                .getEnglishLanguageMainPageErrorMessage();
    }

    @Test(testName = "testPositiveSwitchRuButtonMainPage",
            groups = {"Smoke"},
            description = "Тест кнопки RuEn для перевода на русский язык на главной странице")
    public void testPositiveSwitchRuButtonMainPage() {
        new MainPage(driver)
                .getRussianLanguageMainPageErrorMessage();
    }

    @Test(testName = "testPositiveLogoButtonMainPage",
            groups = {"Smoke"},
            description = "Тест конкатинации кнопок в заголовке на главной странице")
    public void testPositiveLogoButtonMainPage() {
        new MainHeaderPage(driver)
                .pressDepartmentsButton()
                .pressLogoButton()
                .pressExchangeRatesButton()
                .pressLogoButton()
                .pressContactsButton()
                .pressLogoButton();
    }

    @Test(testName = "testPositiveDepartmentsButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехеда по кнопке Банкоматы и отделения в заголовке на главной странице")
    public void testPositiveDepartmentsButtonMainPage() {
        new MainHeaderPage(driver)
                .pressDepartmentsButton()
                .getDepartmentsButtonPageErrorMessage();
    }

    @Test(testName = "testPositiveExchangeRatesButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехеда по кнопке Обмен валюты в заголовке на главной странице")
    public void testPositiveExchangeRatesButtonMainPage() {
        new MainHeaderPage(driver)
                .pressExchangeRatesButton()
                .getExchangeRatesButtonPageErrorMessage();
    }

    @Test(testName = "testPositiveContactsButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехеда по кнопке Контакты в заголовке на главной странице")
    public void testPositiveContactsButtonMainPage() {
        new MainHeaderPage(driver)
                .pressContactsButton()
                .getContactsButtonPageErrorMessage();
    }

    @Test(testName = "testPositiveRegisterButtonMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопке Зарегистрироваться на главной странице")
    public void testPositiveRegisterButtonMainPage() {
        new MainRegisterPage(driver)
                .pressRegisterButton()
                .getRegisterButtonErrorMessage();
    }

    @Test(testName = "testPositiveSendCodeAgainButtonRegisterPage",
            groups = {"Smoke"},
            description = "Тест перехеда по кнопке Отправить код повторно во фрэйме регистрации")
    public void testPositiveSendCodeAgainButtonRegisterPage() {
        new MainRegisterPage(driver)
                .pressRegisterButton()
                .putCursorNumberRegisterFieldRegisterFrame()
                .fillNumberFieldRegisterFrame("+79243405840")
                .pressContinueButton()
                .pressSendCodeAgainButtonRegisterFrame();
    }

    @Test(testName = "testPositiveRegisterFrame",
            groups = {"Smoke"},
            description = "Тест регистрации по номеру телефона по нажати на кнопку Зарегистрироваться")
    public void testPositiveRegisterFrame() {
        new MainRegisterPage(driver)
                .pressRegisterButton()
                .putCursorNumberRegisterFieldRegisterFrame()
                .fillNumberFieldRegisterFrame("+79243405849")
                .pressContinueButton()
                .putCursorEnterSixSymbolsCodeFieldRegisterFrame()
                .fillSixSymbolsCodeFieldRegisterFrame(String.valueOf(772266))
                .pressContinueButton()
                .fillNameFieldRegisterFrame("Кирилл")
                .fillPatronymicFieldRegisterFrame("Александрович")
                .putCursorSurnameFieldRegisterFrame()
                .fillSurnameFieldRegisterFrame("Шульц")
                .putCursorNumberPassportFieldRegisterFrame()
                .fillNumberPassportFieldRegisterFrame("СМ777120")
                .pressResidentButtonRegisterFrame()
                .pressContinueButton()
                .putCreatePasswordFieldRegisterFrame()
                .fillCreatePasswordFieldRegisterFrame("Moby000!!")
                .putCursorConfirmPasswordFieldRegisterFrame()
                .fillConfirmPasswordFieldRegisterFrame("Moby000!!")
                .pressContinueButton()
                .pressControlQuestionButton()
                .selectControlQuestionFromDropdownList()
                .putCursorCreateAnswerFieldRegisterFrame()
                .fillCreateAnswerForControlQuestionField("колобок")
                .pressContinueButton()
                .pressEnterButton();

    }

    @Test(testName = "testPositiveSliderMainPage",
            groups = {"Smoke"},
            description = "Тест перехода по кнопкам конкатинации Слайдера " +
                    "переходы по кнопка Узнать больше каждого слайдана главной странице")
    public void testPositiveSliderMainPage() {
        new MainSliderPage(driver)
                .pressFirstSliderButton()
                .pressFirstLearnMoreSliderButton()
                .pressLogoButton()
                .pressSecondSliderButton()
                .pressSecondLearnMoreSliderButton()
                .pressLogoButton()
                .pressThirdSliderButton()
                .pressThirdLearnMoreSliderButton()
                .pressLogoButton()
                .pressFourthSliderButton()
                .pressFourthLearnMoreSliderButton()
                .pressLogoButton();
    }

    @Test(testName = "testPositiveForgotPasswordPage",
            groups = {"Smoke"},
            description = "Тест восстановления пароля по кнопке Забыли пароль?")
    public void testPositiveForgotPasswordPage() {
        new MainForgotPasswordPage(driver)
                .pressForgotPasswordButton()
                .putCursorNumberPassportFieldForgotPasswordFrame()
                .fillNumberPassportFieldForgotPasswordFrame("ИТ557555")
                .pressContinueButton()
                .putCursorEnterSixSymbolsCodeFieldForgotPasswordFrame()
                .fillSixSymbolsCodeFieldForgotPasswordFrame("111111")
                .pressContinueButton()
                .putCursorCreatePasswordFieldRecoveryFrame()
                .fillCreatePasswordFieldRecoveryFrame("Moby000!")
                .putCursorConfirmPasswordFieldRecoveryFrame()
                .fillConfirmPasswordFieldRecoveryFrame("Moby000!")
                .pressContinueButton()
                .pressEnterButtonRecoveryFrame();
    }
}





