import org.hamcrest.MatcherAssert;
import org.junit.Test;
import yandex_scooter.HomePageSelenide;
import yandex_scooter.OrderPageSelenide;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.hamcrest.CoreMatchers.containsString;

public class ScooterOrderChromeBrowserTest {
    private static String homePageUrl = "https://qa-scooter.praktikum-services.ru/";
    private static String orderPageUrl = "https://qa-scooter.praktikum-services.ru/order";

    @Test
    public void topButtonScooterOrderTest() {
        HomePageSelenide homePageSelenide = open(
                homePageUrl,
                HomePageSelenide.class);
        homePageSelenide.clickOrderTopButton();//Клик на верхнюю кнопку заказа
        webdriver().shouldHave(url(orderPageUrl));
        OrderPageSelenide orderPage = open(
                orderPageUrl,
                OrderPageSelenide.class);
        orderPage.setClientOrderData("Вася", "Пупкин", "Кукуево, 8", 4, "+71234567890");
        orderPage.nextButtonClick();
        orderPage.fillRentFields("12.04.2022", 4, "Мой комментарий");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String formedOrderElementText = orderPage.getFormedOrderElementText();
        MatcherAssert.assertThat(formedOrderElementText, containsString("Заказ оформлен"));
    }

    @Test
    public void bigButtonScooterOrderTest() {
        HomePageSelenide homePageSelenide = open(
                homePageUrl,
                HomePageSelenide.class);
        homePageSelenide.clickBigOrderButton();// клик на большую кнопку заказа
        webdriver().shouldHave(url(orderPageUrl));
        OrderPageSelenide orderPage = open(
                orderPageUrl,
                OrderPageSelenide.class);
        orderPage.setClientOrderData("Иван", "Иванов", "Озерная, 2", 3, "+70987654321");
        orderPage.nextButtonClick();
        orderPage.fillRentFields("23.02.2022", 0, "Мой комментарий");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String formedOrderElementText = orderPage.getFormedOrderElementText();
        MatcherAssert.assertThat(formedOrderElementText, containsString("Заказ оформлен"));
    }
}