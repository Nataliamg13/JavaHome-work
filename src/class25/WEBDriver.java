package class25;

public interface WEBDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    // maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver
    // and FirefoxDriver.

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WEBDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open G.Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close G.Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Max display");
    }

    @Override
    public void findElement() {
        System.out.println("Find special elements");
    }
}

class FirefoxDriver implements WEBDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open FirefoxDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FirefoxDriver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Max display");
    }

    @Override
    public void findElement() {
        System.out.println("Find special elements ");
    }}