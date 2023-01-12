package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumUtils;

public class HomePage extends SeleniumUtils {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='media__content']/h3/a")
	List<WebElement> newsHead;

	@FindBy(xpath = "//div[@class='media__content']/a/parent::div/pv")
	List<WebElement> newsDescription;

	@FindBy(xpath = "//a")
	List<WebElement> link;

	public void getHeader() {
		for (WebElement e : newsHead) {

			System.out.println(getTexts(e));
		}
	}

	public void getDescription() {
		for (WebElement e : newsDescription) {

			System.out.println(getTexts(e));
		}
	}
	public void getLink() {
		for (WebElement e : link) {
			System.out.println(e.getAttribute("href"));
		}
	}
}
