package iceLand.Pages;


import iceLand.DriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages extends Driver {
    @FindBy(css = "input[id='header-search']")
    WebElement searchBar;

    @FindBy(css = "div[class='input-group'] div button")
    WebElement searchButton;

    @FindBy(css = "h1[class='search-header-title search-results-title']")
    WebElement results;

    @FindBy(css = "div[class='view-all-search-results-content']")
    WebElement display;

    public String serchResult()throws Exception{
        String disaplay_text_value =display.getText();
        return disaplay_text_value;

    }
    public void setSearchBar() throws Exception {
        searchBar.click();
        Thread.sleep(2000);
    }

    public void enter_prodcuts() throws Exception {
        searchBar.sendKeys("juice");
        Thread.sleep(2000);
    }

    public void setSearchButton() throws Exception {
        searchButton.click();
        Thread.sleep(2000);
    }

    public String setResults()throws Exception{
        String output=results.getText();
        return output;

    }
    public SearchPages() {
        PageFactory.initElements(driver, this);
    }
}
