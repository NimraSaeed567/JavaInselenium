ckage base;
port org.openqa.selenium.WebDriver;
port org.openqa.selenium.chrome.ChromeDriver;
blic class BaseTests{
  private WebDriver driver;
  public void setUp(){
    System.setProperty("","");
    driver=new ChromeDriver();
    driver.get("");

   List<WebElement>links= driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    
     WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
    inputsLink.click();

    System.out.println(driver.getTitle());
    drivet.quit();
      }
      public static void main(String args[]){
      BaseTests test = new BaseTests();
      test.setUp();
  }
