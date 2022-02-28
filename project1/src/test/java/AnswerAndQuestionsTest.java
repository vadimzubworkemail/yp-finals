import org.junit.Assert;
import org.junit.Test;
import yandex_scooter.HomePageSelenide;
import static com.codeborne.selenide.Selenide.open;

public class AnswerAndQuestionsTest {
    private static String homePageUrl = "https://qa-scooter.praktikum-services.ru/";
    private HomePageSelenide homePage = open(
            homePageUrl,
            HomePageSelenide.class);

    @Test
    public void matchingWithTheFirstQuestion() {
        String expectedAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        homePage.clickOnQuestionByIndex(0);
        String actualAnswer = homePage.findAnswerByIndex(0);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithTheSecondQuestion() {
        String expectedAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        homePage.clickOnQuestionByIndex(1);
        String actualAnswer = homePage.findAnswerByIndex(1);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithThethirdQuestion() {
        String expectedAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        homePage.clickOnQuestionByIndex(2);
        String actualAnswer = homePage.findAnswerByIndex(2);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithFourthQuestion() {
        String expectedAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        homePage.clickOnQuestionByIndex(3);
        String actualAnswer = homePage.findAnswerByIndex(3);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithFifthQuestion() {
        String expectedAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        homePage.clickOnQuestionByIndex(4);
        String actualAnswer = homePage.findAnswerByIndex(4);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithSixthQuestion() {
        String expectedAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        homePage.clickOnQuestionByIndex(5);
        String actualAnswer = homePage.findAnswerByIndex(5);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithSeventhQuestion() {
        String expectedAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        homePage.clickOnQuestionByIndex(6);
        String actualAnswer = homePage.findAnswerByIndex(6);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }

    @Test
    public void matchingWithEighthQuestion() {
        String expectedAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        homePage.clickOnQuestionByIndex(7);
        String actualAnswer = homePage.findAnswerByIndex(7);
        Assert.assertEquals(actualAnswer, expectedAnswer);
    }
}
