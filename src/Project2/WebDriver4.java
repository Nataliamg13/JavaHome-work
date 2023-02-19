package Project2;

public interface WebDriver4 {
    void open();
    void close();
    String getTitle();
}
interface RemoteWbDriver extends WebDriver4{
    void navigate();
}
interface TakesScreenshot extends RemoteWbDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Chrome Browser");
    }
}
class FireFoxDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Firefox Browser");
    }
}
class SafariDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari Browser");
    }
}