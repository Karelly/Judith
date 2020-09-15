package Karelly.Auto2;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String exePath=Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;  
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establecer la propiedad exe
        WebDriver driver=new ChromeDriver(); //inicializar driver
        driver.get("https://www.cooltesters.com/tienda-de-cuersos/selenium-con-java");
        
        
    }
}
