package guru.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


@DisplayName("Это страница Practice Form")
public class PracticeFormTests {

    /*
    @BeforeAll //например включить БД(?) ВОПРОС
    static void beforeAll() {
        System.out.println("@BeforeAll method!");
    }
    */

    @BeforeEach
        //например пред каждый МЕТОДОМ перейти на сайт Яндекс и все тесты про яндекс
    void openPage() {
        open("https://demoqa.com/automation-practice-form/");
        $(byText("Student Registration Form"));
    }

   /*
    @AfterEach  //например сделать скрин и почистить за собой
    void afterEach() {
        System.out.println("    @AfterEach method!");
    }

    @AfterAll //например закрыть браузер
    static void afterAll() {
        System.out.println("@AfterAll method!");
    }
*/
    @Test
    void selenideFirstNameTest() {
                $("[id=firstName]").setValue("Olga").pressEnter();
    }

    @Test
    void selenideLastNameTest() {
        $("[id=lastName]").setValue("Kos").pressEnter();
    }

    @Test
    void selenideUserEmailTest() {
        $("#userEmail").setValue("ok@ya.ru").pressEnter();
    }

}