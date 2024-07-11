ckage base;
port org.openqa.selenium.WebDriver;
port org.openqa.selenium.chrome.ChromeDriver;
blic class BaseTests{
  private WebDriver driver;
  public void setUp(){
    System.setProperty("","");
    driver=new ChromeDriver();
    driver.get("");
    driver.manage().window().setSize(new Dimension(375,812));
    System.out.println(driver.getTitle());
    drivet.quit();
      }
      public static void main(String args[]){
      BaseTests test = new BaseTests();
      test.setUp();
  }
