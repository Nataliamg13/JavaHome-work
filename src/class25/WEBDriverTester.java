package class25;

public class WEBDriverTester {
    public static void main(String[] args) {
        WEBDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver()};
        for(WEBDriver w:webDrivers){
            w.openBrowser();
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
        }
        }
    }

