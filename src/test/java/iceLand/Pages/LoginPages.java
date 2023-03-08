package iceLand.Pages;


import iceLand.DriverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends Driver {
    @FindBy(css = "A[class='user-register']")
    WebElement register;

    @FindBy(css = "a[class='user-account btn btn-header btn-primary']")
    WebElement SigninLink;

    @FindBy(css = "input[id='dwfrm_login_username']")  //dwfrm_login_username
    WebElement email_Enter;

    @FindBy(css = "input[id='dwfrm_login_password']")
    WebElement password_Enter;

    @FindBy(css = "div[class='form-row form-row-button']")
    WebElement Signin_SEcurly_button;

    @FindBy(css = "span[class='error']")
    WebElement error_afterlogin;

    public void setRegister() throws Exception {
        register.click();
        Thread.sleep(3000);
    }

    public String error_verify() throws Exception {
        String error_afterlogin_value = error_afterlogin.getText();
        return error_afterlogin_value;
    }


    public void setSigninLink() throws Exception {
        SigninLink.click();
        Thread.sleep(3000);
    }

    public void setEmail_Enter() throws Exception {
        email_Enter.sendKeys("ankiyoga12@yahoo.com");
        Thread.sleep(3000);
    }

    public void setPassword_Enter() throws Exception {
        password_Enter.sendKeys("123456");
        Thread.sleep(2000);
    }

    public void setSignin_SEcurly_button() throws Exception {
        Signin_SEcurly_button.click();
        Thread.sleep(5000);
    }

    public String getCurrent_url() throws Exception {
        String url = driver.getCurrentUrl();
        return url;

    }

    public LoginPages() {
        PageFactory.initElements(driver, this);
    }


}
