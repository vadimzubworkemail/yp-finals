package yandex_scooter;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPageSelenide {
    @FindBy(how = How.CLASS_NAME, using = "select-search__row")
    private ElementsCollection dropDownStationList;//выпадающий список станций
    @FindBy(how = How.CSS, using = "div.Order_Form__17u6u > div:nth-child(1) > input")
    private SelenideElement fieldName;//поле ввода имя
    @FindBy(how = How.CSS, using = "div.Order_Form__17u6u > div:nth-child(2) > input")
    private SelenideElement lastNameField;//поле ввода фамилия
    @FindBy(how = How.CSS, using = "div.Order_Form__17u6u > div:nth-child(3) > input")
    private SelenideElement addressField;//поле ввода адрес
    @FindBy(how = How.CLASS_NAME, using = "select-search__input")
    private SelenideElement subwayField;//поле ввода метро
    @FindBy(how = How.CSS, using = "div.Order_Form__17u6u > div:nth-child(5) > input")
    private SelenideElement phoneField;//поле ввода телефон
    @FindBy(how = How.CSS, using = "div.Order_NextButton__1_rCA > button")
    private SelenideElement nextButton;//кнопка перехода к следующей форме
    @FindBy(how = How.CSS, using = "div.react-datepicker-wrapper > div > input")
    private SelenideElement fieldWhen;//поле ввода даты
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-control")
    private SelenideElement fieldRentalPeriod;//поле срок арерды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-option")
    private ElementsCollection dropDownOptions;//выпадающий список дней
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-arrow")
    private SelenideElement periodSelector;//Варианты выбора в выпадающем списке периодов аренды
    @FindBy(how = How.ID, using = "black")
    private SelenideElement blackColor;//кнопка черного
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement greyColor;//кнопка серого
    @FindBy(how = How.CSS, using = "div.Order_Form__17u6u > div.Input_InputContainer__3NykH > input")
    private SelenideElement commentField;//поле ввода комментария
    @FindBy(how = How.CSS, using = "button.Button_Button__ra12g.Button_Middle__1CSJM.Button_Inverted__3IF-i")
    private SelenideElement backButton;//кнопка возврата на предыдущую форму
    @FindBy(how = How.CSS, using = "div.Order_Buttons__1xGrp > button:nth-child(2)")
    private SelenideElement orderButton;//кнопка оформить заказ
    @FindBy(how = How.CSS, using = "div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)")
    private SelenideElement yesButton;//кнопка согласия оформить заказ
    @FindBy(how = How.CSS, using = "div.Order_Buttons__1xGrp > button.Button_Button__ra12g.Button_Middle__1CSJM.Button_Inverted__3IF-i")
    private SelenideElement noButton;//кнопка отказа оформить заказ
    @FindBy(how = How.LINK_TEXT, using = "Посмотреть статус")
    private SelenideElement viewStatus;//кнопка перехода на страницу оформленных заказов
    @FindBy(how = How.CSS, using = "div.Order_Modal__YZ-d3")
    private SelenideElement orderWindow;// окно заказа
    @FindBy(how = How.CLASS_NAME, using = "Order_ModalHeader__3FDaJ")
    private SelenideElement formedOrderElement;// текст с номером заказа

    //ввод в поле имя
    public void setUserName(String userName) {
        fieldName.setValue(userName);
    }

    //ввод в поле фамилия
    public void setLastUserName(String lastName) {
        lastNameField.setValue(lastName);
    }

    // ввод в поле адрес
    public void setAddressFieldInput(String userAddress) {
        addressField.setValue(userAddress);
    }

    // вызов списка станций
    public void clickSubwayField() {
        subwayField.click();
    }

    //выбор станции
    public void selectMetroStationById(int metroStationId) {
        dropDownStationList.get(metroStationId).scrollTo().click();
    }

    // ввод номера телефона
    public void setPhoneFieldInput(String userPhoneNumber) {
        phoneField.setValue(userPhoneNumber);
    }

    // переход к форме "Про аренду"
    public void nextButtonClick() {
        nextButton.click();
    }

    //заполнение формы "Для кого самокат"
    public void setClientOrderData(String userName, String lastName, String userAddress, int metroStationId, String userPhoneNumber) {
        setUserName(userName);
        setLastUserName(lastName);
        setAddressFieldInput(userAddress);
        clickSubwayField();
        selectMetroStationById(metroStationId);
        setPhoneFieldInput(userPhoneNumber);
    }

    //ввод даты
    public void fieldWhenInput(String date) {
        fieldWhen.val(date).pressEnter();
    }

    //вызов выпадающего списка периодов аренды
    public void periodSelectorInput() {
        periodSelector.click();
    }

    //выбор периода аренды
    public void selectPeriodInput(int index) {
        dropDownOptions.get(index).scrollTo().click();
    }

    // выбор черного самоката
    public void chooseBlackColor() {
        blackColor.click();
    }

    //выбор серого самоката
    public void chooseGreyColor() {
        greyColor.click();
    }

    // ввод комментария
    public void setCommentField(String comments) {
        commentField.val(comments);
    }

    //отказ от предварительного согласия оформить заказ
    public void backButtonClick() {
        backButton.click();
    }

    // предварительное согласие оформить заказ
    public void clickOrderButton() {
        orderButton.click();
    }

    //заполнение формы "Про аренду"
    public void fillRentFields(String rentDate, int rentPeriodIndex, String comments) {
        fieldWhenInput(rentDate);
        periodSelectorInput();
        selectPeriodInput(rentPeriodIndex);
        chooseBlackColor();
        setCommentField(comments);
    }

    //подтверждение оформления заказа
    public void clickYesButton() {
        yesButton.click();
    }

    // отказ от оформления заказа
    public void clickNoButton() {
        noButton.click();
    }

    // получение элемента сформированного заказа
    public String getFormedOrderElementText() {
        return formedOrderElement.getText();
    }
}

