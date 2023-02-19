package Project2;

public class WebDriver4Tester {
    public static void main(String[] args) {
        WebDriver4[] browsers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};

        for(WebDriver4 driver4:browsers){
            driver4.open();
            driver4.close();
            driver4.getTitle();

    }
}}
