import org.hamcrest.MatcherAssert;
import org.junit.Test;
import yandex_scooter.HomePageSelenide;
import yandex_scooter.OrderPageSelenide;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.hamcrest.CoreMatchers.containsString;

public class ScooterOrderYandexBrowserTest {
    private static String homePageUrl = "https://qa-scooter.praktikum-services.ru/";
    private static String orderPageUrl = "https://qa-scooter.praktikum-services.ru/order";
    private static String yandexDriverPath = "C:\\Users\\Vadim Zub\\Documents\\studying\\projects\\project1\\yandexdriver.exe";
    @Test
    public void topButtonScooterOrderTest() {
        System.setProperty("webdriver.chrome.driver", yandexDriverPath);
        System.setProperty("selenide.browser", "Chrome");
        HomePageSelenide homePageSelenide = open(
                homePageUrl,
                HomePageSelenide.class);
        homePageSelenide.clickOrderTopButton();
        webdriver().shouldHave(url(orderPageUrl));
        OrderPageSelenide orderPage = open(
                orderPageUrl,
                OrderPageSelenide.class);
        orderPage.setClientOrderData("Коля", "Васечкин", "Школьная, 1", 6, "+71234567890");
        orderPage.nextButtonClick();
        orderPage.fillRentFields("12.03.2022", 4, "Мой комментарий");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String formedOrderElementText = orderPage.getFormedOrderElementText();
        MatcherAssert.assertThat(formedOrderElementText, containsString("Заказ оформлен"));
    }

    @Test
    public void bigButtonScooterOrderTest() {
        System.setProperty("webdriver.chrome.driver", yandexDriverPath);
        System.setProperty("selenide.browser", "Chrome");
        HomePageSelenide homePageSelenide = open(
                homePageUrl,
                HomePageSelenide.class);
        homePageSelenide.clickBigOrderButton();
        webdriver().shouldHave(url(orderPageUrl));
        OrderPageSelenide orderPage = open(
                orderPageUrl,
                OrderPageSelenide.class);
        orderPage.setClientOrderData("Александр", "Зеленцов", "Станционная, 9", 0, "+71234567890");
        orderPage.nextButtonClick();
        orderPage.fillRentFields("12.04.2024", 4, "Мой комментарий");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String formedOrderElementText = orderPage.getFormedOrderElementText();
        MatcherAssert.assertThat(formedOrderElementText, containsString("Заказ оформлен"));
    }
}