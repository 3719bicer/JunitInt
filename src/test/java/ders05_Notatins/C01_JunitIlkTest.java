package ders05_Notatins;

import org.junit.Test;

public class C01_JunitIlkTest {

    /*
    Junit ile;
    1- Bir class'da birden fazla bagımsız test method olusturabiliriz.
    2- Bu test method'larıni istersek bagımsız olarak calistirabilir,
       istersek slass level'den tün methodları calistirabiliriz.
    3-
     */
    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test
    public void test03(){
        System.out.println("test03");
    }
}
