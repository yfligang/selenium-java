import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WebDriverDemo {

    public static void main(String[] args){
        System.setProperty("hello","world");
        WebDriver webDriver = new WebDriver() {
            @Override
            public void get(String s) {

            }

            @Override
            public String getCurrentUrl() {
                return null;
            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public List<WebElement> findElements(By by) {
                return null;
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public String getPageSource() {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return null;
            }

            @Override
            public String getWindowHandle() {
                return null;
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };

        webDriver.close();

    }
}
