package iceLand.Hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import iceLand.DriverFactory.Driver;

public class Hooks {
    Driver hook_driver = new Driver();

    @Before
    public void open() throws Exception {
        hook_driver.openBrowser();
    }

    @After
    public void close() throws Exception {
        hook_driver.closeBrowser();
    }
}
