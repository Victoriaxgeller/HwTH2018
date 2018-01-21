package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CurrencyComparison {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //Ukrsibbank
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String ukrBuy = driver.findElement(By.xpath("//td[text()='26,6500']")).getText();
        String ukrSell = driver.findElement(By.xpath("(//TD[text()='26,9000'][text()='26,9000'])[1]")).getText();
        double ukrBuyD = Double.parseDouble(ukrBuy.replaceAll(",", "."));
        double ukrSellD = Double.parseDouble(ukrSell.replaceAll(",", "."));

        //Aval
        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        String avalBuy = driver.findElement(By.xpath("//TD[@class='right'][text()='26,600']")).getText();
        String avalSell = driver.findElement(By.xpath("//TD[@class='right'][text()='26,950']")).getText();
        double avalBuyD = Double.parseDouble(avalBuy.replaceAll(",", "."));
        double avalSellD = Double.parseDouble(avalSell.replaceAll(",", "."));

        //Oschadbank
        driver.get("https://www.oschadbank.ua/ua/");
        String oschadBuy = driver.findElement(By.xpath("//strong[@class='buy-USD']")).getText();
        String oschadSell = driver.findElement(By.xpath("//strong[@class='sell-USD']")).getText();
        double oschadBuyD = Double.parseDouble(oschadBuy.replaceAll(",", "."));
        double oschadSellD = Double.parseDouble(oschadSell.replaceAll(",", "."));

        //NBU
        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String nbu = driver.findElement(By.xpath("//td[@class='cell_c'][text()='2681.2058']")).getText();
        double nbuD = Double.parseDouble(nbu.replaceAll(",", ""));
        double nbuOne = nbuD / 100;

        String[] bank = {"УкрсибБанк", "Аваль", "Ощадбанк", "НБУ"};
        String minBuyBank = "";
        String maxSellBank = "";
        double maxSell = 0;
        double minBuy = 0;

        //Average Buy
        double buyArr[] = {ukrBuyD, avalBuyD, oschadBuyD, nbuOne};
        double averageBuy = 0;
        if (buyArr.length > 0) {
            double sumBuy = 0;
            for (int i = 0; i < buyArr.length; i++) {
                sumBuy += buyArr[i];
                if (i == 0) {
                    minBuy = buyArr[i];
                    minBuyBank = bank[i];
                } else if (i > 0 && buyArr[i] < minBuy) {
                    minBuy = buyArr[i];
                    minBuyBank = bank[i];
                }
            }
            averageBuy = sumBuy / buyArr.length;
        }

        //Average Sell
        double sellArr[] = {ukrSellD, avalSellD, oschadSellD, nbuOne};
        double averageSell = 0;
        if (sellArr.length > 0) {
            double sumSell = 0;
            for (int x = 0; x < sellArr.length; x++) {
                sumSell += sellArr[x];
                if (sellArr[x] > maxSell) {
                    maxSell = sellArr[x];
                    maxSellBank = bank[x];
                }
            }
            averageSell = sumSell / sellArr.length;
        }

        System.out.println("Средняя сумма покупки: " + averageBuy);
        System.out.println("Средняя сумма продажи: " + averageSell);
        System.out.println(minBuyBank + ": " + minBuy);
        System.out.println(maxSellBank + ": " + maxSell);

        driver.quit();
        //driver.close();
    }
}
