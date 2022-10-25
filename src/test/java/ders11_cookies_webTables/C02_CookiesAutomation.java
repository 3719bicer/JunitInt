package ders11_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C02_CookiesAutomation extends TestBase {

    //Yeni bir class olusturun : cookiesAutomation
    //1- Amazon anasayfaya gidin
    //2- tum cookie’leri listeleyin
    //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
    //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun
    //   ve sayfaya ekleyin
    //6- eklediginiz cookie’nin sayfaya eklendigini test edin
    //7- ismi skin olan cookie’yi silin ve silindigini test edin
    //8- tum cookie’leri silin ve silindigini test edin

    @Test
    public void Test(){

        //1- Amazon anasayfaya gidin.
        driver.get("https://www.amazon.com");

        //2- tum cookie’leri listeleyin.
        Set<Cookie> cookieSeti= driver.manage().getCookies();

        int siraNo=1;

        for (Cookie eachCookie: cookieSeti
             ) {
            System.out.println(siraNo + "- " + eachCookie);
            siraNo++;
        }

        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin.
        Assert.assertTrue(cookieSeti.size()>5);

        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin.
        Cookie i18nCookie= driver.manage().getCookieNamed("i18n-prefs");
        String i18nvalue=i18nCookie.getValue();
        Assert.assertEquals("USD",i18nvalue);

        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun
        //   ve sayfaya ekleyin.

        Cookie cookie=new Cookie("En sevdigim cookie","cikolatalı");
        driver.manage().addCookie(cookie);
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin.
        cookieSeti=driver.manage().getCookies();
        siraNo=1;
        for (Cookie eachCookie: cookieSeti
        ) {
            System.out.println(siraNo + "- " + eachCookie);
            siraNo++;
        }
        Cookie enSevdigimCookie=driver.manage().getCookieNamed("En sevdigim cookie");
        String enSevdigimCookieValue= enSevdigimCookie.getValue();

        Assert.assertEquals("cikolatalı",enSevdigimCookieValue);

        //7- ismi skin olan cookie’yi silin ve silindigini test edin.
        cookieSeti=driver.manage().getCookies();
        int silmedenOnceCookiesSayisi=cookieSeti.size();

        driver.manage().getCookieNamed("skin");

        cookieSeti=driver.manage().getCookies();
        int silmedenSonraCookiesSayisi=cookieSeti.size();

        Assert.assertEquals(silmedenOnceCookiesSayisi,silmedenSonraCookiesSayisi);

        //8- tum cookie’leri silin ve silindigini test edin.
        driver.manage().getCookieNamed("skin");
        cookieSeti=driver.manage().getCookies();

        Assert.assertTrue(cookieSeti.size()==0);
    }
}
