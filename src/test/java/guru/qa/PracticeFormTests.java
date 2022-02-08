package guru.qa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.


        @DisplayName("Это страница Practice Form")
            public class PracticeFormTests {

            @BeforeAll
            static void openPage() {
                open("https://demoqa.com/automation-practice-form/");
                $(byText("Student Registration Form"));
            }


    /*
        @BeforeEach

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
    void selenideStringsTests() {
        $("[id=firstName]").setValue("Olga");
        $("[id=lastName]").setValue("Kos");
        $("#userEmail").setValue("ok@ya.ru");
        $("#userNumber").setValue("8125560781");
        $("#currentAddress").setValue("Moskovskoe 1");
    }

    //калнд
    @Test
    void selenideDateOfBirthTest() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("9");
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $$(".react-datepicker__day").find(text("23")).click();
    }

/*
    @Test
    void selenideUploadTest() {
        $("#uploadPicture").uploadFromClasspath("img1.jpg");
    }
*/

@Test
void selenideMultyListTest() {
    $("#subjectsInput").scrollTo().setValue("English");
}

            //Hobbies
            @Test
            void selenideHobbiesTest() {
                $("#hobbies-checkbox-1").scrollTo().parent().click();
                $("#hobbies-checkbox-2").parent().click();
                $("#hobbies-checkbox-3").parent().click();
            }


    //State and City
    @Test
    void selenideFilters1Test() {
        $(".css-tlfecz-indicatorContainer").scrollTo().click(); //встать в поле Штат
        $(".css-1g6gooi #react-select-3-input").setValue("Raja").pressEnter();
        $(".css-1g6gooi #react-select-4-input").setValue("Jaisel").pressEnter();

        //$("#state").setValue("Haryana").pressEnter();
        //$(".css-1hwfws3 #react-select-3-input").setValue("Haryana").pressEnter();
       // $("#city").scrollTo().click(); //встать в поле City
       // $(".css-yk16xz-control #react-select-2-input").setValue("Panipat").pressEnter();
    }

    @Test
    void submiteButtonTest() {
        $("#submit").scrollTo().click();
        //$("#submit").click();
    }

    /*
    @Test
    void closeLargeModalButtonTest() {
        $("#closeLargeModal").click();
    }
*/

}

