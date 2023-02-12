package class23;

public class WebDriverTester {
    public static void main(String[] args) {

    //   WebDriver webDriver=new FireFox();  //Up casting
      // FireFox fireFox=new WebDriver();  // Down casting
       // webDriver.startBrowser();
      // webDriver.openURL();
       // webDriver.testLoginPage();
     //  webDriver.closeBrowser();
      /*  System.out.println("********************");
        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();
        System.out.println("****************");

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();*/

        //an Array of type parent class hold the objects of all the child classes

        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()}; //Creating and initializing at
                                                                            // the same time.

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

        }



    }
}
