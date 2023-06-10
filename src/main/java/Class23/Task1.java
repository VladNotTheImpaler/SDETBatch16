package Class23;

public class Task1 {

}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Google Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome browser");
    }
}

class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing FireFox Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in FireFox browser");
    }
}
class BrowserTest{
    public static void main(String[] args) {
        WebDriver[] webDriver= {new ChromeDriver(), new FireFoxDriver()};
        for (WebDriver obj:webDriver){
            obj.closeBrowser();
            obj.findElement();
            obj.maximizeWindow();
            obj.openBrowser();
        }
    }
}



