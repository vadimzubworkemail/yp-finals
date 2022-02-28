package yandex_scooter;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageSelenide {
    @FindBy(how = How.CSS, using = "[class = 'Header_Disclaimer__3VEni']")
    private SelenideElement purposeText; //уведомление о том, что данное приложение является тренажером.
    @FindBy(how = How.CSS, using = "body img[alt = 'Yandex']")
    private SelenideElement redirectYandex; // кнопка перехода на главную страницу Яндекс.
    @FindBy(how = How.CSS, using = "body img[alt = 'Scooter']")
    private SelenideElement redirectScooter; // кнопка возврата на главную страницу Яндекс Самокат.
    @FindBy(how = How.CSS, using = "[class='Button_Button__ra12g']")
    private SelenideElement orderTopButton; // кнопка заказа
    @FindBy(how = How.CSS, using = "[class='Header_Link__1TAG7']")
    private SelenideElement orderStatus;//кнопка проверка заказа
    @FindBy(how = How.CLASS_NAME, using = "Input_Input__1iN_Z Header_Input__xIoUq")
    private SelenideElement orderNumberInput;//поле ввода номера заказа
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g Header_Button__28dPO")
    private SelenideElement redirectOrder;//переход к форме состояния заказа
    @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
    private SelenideElement essenceText; // надпись для чего предназначено приложение.
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private SelenideElement addingEssenceText; // краткое пояснение услуги.
    @FindBy(how = How.XPATH, using = ".//div[@style = 'opacity: 0; transform: translateY(0px);']/src[@alt='Scooter blueprint'])")
    private SelenideElement scooterLightImage;// светлое изображение самоката.
    @FindBy(how = How.XPATH, using = ".//div[@style = 'opacity: 1; transform: translateY(-63px);']/src[@alt='Scooter blueprint'])")
    private SelenideElement scooterDarkImage;// темное изображение самоката
    @FindBy(how = How.XPATH, using = ".//div[text()='Модель Toxic PRO']")
    private SelenideElement scooterModelText;//название молели самоката
    @FindBy(how = How.XPATH, using = ".//div[text()='Максимальная скорость']")
    private SelenideElement maxSpeedText;//надпись максимальная скорость
    @FindBy(how = How.XPATH, using = ".//div[text()='40 км/ч']")
    private SelenideElement speedValueText; //значение максимальной скорости
    @FindBy(how = How.XPATH, using = ".//div[text()='Проедет без поздарядки']")
    private SelenideElement maximumRangeText;// надпись проедет без подзарядки
    @FindBy(how = How.XPATH, using = ".//div[text()='80 км']")
    private SelenideElement maximumRangevalueText;//значение максимального расстояния
    @FindBy(how = How.XPATH, using = ".//div[text()='Выдерживает вес']")
    private SelenideElement weightLimitText;//надпись выдерживает вес
    @FindBy(how = How.XPATH, using = ".//div[text()='120 кг']")
    private SelenideElement weightLimitvalueText; //значение веса
    @FindBy(how = How.XPATH, using = ".//div[text()='Как это работает']")
    private SelenideElement howItWorksText;//надпись как это работает
    @FindBy(how = How.XPATH, using = ".//div[text()='1']")
    private SelenideElement putct1Text;//знак первый пункт оформления заказа
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']")
    private SelenideElement orderAScooterText;//надпись заказываете самокат
    @FindBy(how = How.XPATH, using = ".//div[text()='Выбираете, когда и куда привезти']")
    private SelenideElement orderAScooterDetailsText;//пояснение к первому пункту
    @FindBy(how = How.XPATH, using = ".//div[text()='2']")
    private SelenideElement putct2Text;//знак второй пункт оформления заказа
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement courierBringsAScooterText;//надпись Курьер привозит самокат
    @FindBy(how = How.XPATH, using = ".//div[text()='А вы — оплачиваете аренду']")
    private SelenideElement courierBringsAScooterDetailsText;//пояснение ко второму пункту
    @FindBy(how = How.XPATH, using = ".//div[text()='3']")
    private SelenideElement putct3Text;//знак третий пункт оформления заказа
    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']")
    private SelenideElement rideText;//надпись Катаетесь
    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement rideDetailsText;//пояснение к третьему пункту
    @FindBy(how = How.XPATH, using = ".//div[text()='4']")
    private SelenideElement putct4Text;//знак четвертый пункт оформления заказа
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement picksUpTheScooterText;//надпись Курьер забирает самокат
    @FindBy(how = How.XPATH, using = ".//div[text()='Когда аренда заканчивается']")
    private SelenideElement picksUpTheScooterDetailsText;//пояснение к четвертому пункту
    @FindBy(how = How.CSS, using = "div.Home_FinishButton__1_cWm > button")
    private SelenideElement bigOrderButton;// большая нижняя кнопка заказать
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement buttonQuestion0;// вопрос из списка Сколько это стоит? И как оплатить?
    @FindBy(how = How.CSS, using = "#accordion__panel-0 > p")
    private SelenideElement answerText0;// ответ на вопрос из списка Сколько это стоит? И как оплатить? на
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement buttonQuestion1;//вопрос Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.LINK_TEXT, using = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.")
    private SelenideElement answerText1;// ответ на вопрос Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement buttonQuestion2;//вопрос Как рассчитывается время аренды?
    @FindBy(how = How.LINK_TEXT, using = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.")
    private SelenideElement answerText2;//ответ на вопрос Как рассчитывается время аренды?
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement buttonQuestion3;//вопрос Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.LINK_TEXT, using = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.")
    private SelenideElement answerText3;//ответ на вопрос Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement buttonQuestion4;//вопрос Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.LINK_TEXT, using = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.")
    private SelenideElement answerText4;//ответ на вопрос Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement buttonQuestion5;//вопрос Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.LINK_TEXT, using = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.")
    private SelenideElement answerText5; //ответ на вопрос Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement buttonQuestion6;//вопрос Можно ли отменить заказ?
    @FindBy(how = How.LINK_TEXT, using = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.")
    private SelenideElement answerText6; //ответ на вопрос Можно ли отменить заказ?
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement buttonQuestion7;//вопрос Я жизу за МКАДом, привезёте?
    @FindBy(how = How.LINK_TEXT, using = "Да, обязательно. Всем самокатов! И Москве, и Московской области.")
    private SelenideElement answerText7;//ответ на вопрос Я жизу за МКАДом, привезёте?
    @FindBy(how = How.CLASS_NAME, using = "accordion__heading")
    private ElementsCollection questionsList;//список вопросов о важном
    @FindBy(how = How.CLASS_NAME, using = "accordion__panel")
    private ElementsCollection answerBlock;//блок ответов о важном

    // переход на главную странияу яндекс
    public void redirectYandexClick() {
        redirectYandex.click();
    }

    // переход главную странияу яндекс самокат
    public void redirectScooterClick() {
        redirectScooter.click();
    }

    // переход на форму оформлеления заказа
    public void clickOrderTopButton() {
        orderTopButton.click();
    }

    //вызов поля статус заказа
    public void clickOrderStatus() {
        orderStatus.click();
    }

    //ввод в поле статус заказа
    public void setOrderNumber(String number) {
        orderNumberInput.val(number);
    }

    // клик на кнопку GO
    public void clickRedirectOrder() {
        redirectOrder.click();
    }
    // переход на страницу статуса заказа

    //проверка статус заказа
    public void setOrderVerification(String number) {
        clickOrderStatus();
        setOrderNumber(number);
        clickRedirectOrder();
    }

    // клик на большую кнопку заказа
    public void clickBigOrderButton() {
        bigOrderButton.scrollTo().click();
    }

    //возвращение текста вопроса по индексу
    public String findQuestionByIndex(int index) {
        return questionsList.get(index).scrollTo().getText();
    }

    //вызов ответа на вопрос
    public void clickOnQuestionByIndex(int index) {
        questionsList.get(index).scrollTo().click();
    }

    //возвращение текста ответа
    public String findAnswerByIndex(int index) {
       return answerBlock.get(index).scrollTo().getText();

    }
}