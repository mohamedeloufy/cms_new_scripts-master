package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P016_PresentationPage extends PageBase{
    public P016_PresentationPage(WebDriver driver) {
        super(driver);
        jes=(JavascriptExecutor) driver;
    }

    @FindBy(className = "page-title")
    public WebElement pageTitle;

    @FindBy(id = "lessons_next")
    public WebElement nextPresentationLessonsBtn;

    @FindBy(id = "lessons_previous")
    public WebElement previousPresentationLessonsBtn;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[1]/a")
    WebElement firstPresentationLesson;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[2]/a")
    WebElement secondPresentationLesson;

    @FindBy(xpath = "/html/body/div/div/div/main/div/ul/li[3]/a")
    WebElement thirdPresentationLesson;

    @FindBy(id = "NagwaLitePlayer")
    public WebElement videoPlayer;



    @FindBy(xpath = "//div[@class='components']//ul//li//div//a")
    public List<WebElement> lessonComponent;


    public void openFirstPresentationLesson()
    {
        clickOn(firstPresentationLesson);
    }
    public void openSecondPresentationLesson()
    {
        clickOn(secondPresentationLesson);
    }
    public void openThirdPresentationLesson()
    {
        clickOn(thirdPresentationLesson);
    }
    public void previewTheNextPresentationLessonPage()
    {
        scrollToBottom();
        clickOn(nextPresentationLessonsBtn);
    }
    public void previewThePreviousPresentationLessonPage()
    {
        scrollToBottom();
        clickOn(previousPresentationLessonsBtn);
    }
    public void openLessonComponent() {
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson")) {
                    clickOn(component);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("lesson component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Plan")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Plan component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Presentation")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Presentation component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Video")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    openVideos(videoPlayer);


                }
            } catch (Exception e) {
                System.out.println("Lesson Video component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Explainer")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Explainer component doesn't exist");
            }
        }
        for (WebElement component : lessonComponent) {
            try {
                if (component.getText().equalsIgnoreCase("Lesson Worksheet")) {
                    clickOn(component);
                    Thread.sleep(1000);
                    scrollToBottom();
                    Thread.sleep(1000);
                    scrollToUP();

                }
            } catch (Exception e) {
                System.out.println("Lesson Worksheet component doesn't exist");
            }
        }
    }
}
