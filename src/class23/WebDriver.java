package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("Opening a URL");
    }
    public void testLoginPage(){
        System.out.println("Checking if login page works ");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        super.startBrowser();
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL IN Google Chrome");;
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Open the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the Url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closed the browser");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening the FireFox ");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the  URL  in FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closed the FireFox");
    }
}