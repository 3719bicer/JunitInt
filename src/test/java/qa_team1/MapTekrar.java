package qa_team1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTekrar {

    public static void main(String[] args) {

        Map<String, Integer> subeVeMasaSayisiMap = new HashMap<>();
        subeVeMasaSayisiMap.put("Karsiyaka", 100);
        subeVeMasaSayisiMap.put("Goztepe", 50);
        subeVeMasaSayisiMap.put("Yesilyurt", 60);
        subeVeMasaSayisiMap.put("Gaziemir", 80);

        Set<String> ilceler = subeVeMasaSayisiMap.keySet();
        for (String ilce : ilceler) {
            System.out.println(ilce);
        }

        Collection<Integer> masayilari = subeVeMasaSayisiMap.values();
        for (Integer masasayisi : masayilari) {
            System.out.println(masasayisi);
        }

        Set<Map.Entry<String, Integer>> entries = subeVeMasaSayisiMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        /*
        Map'e eleman ekleme,
        Map'in key'lerini for loopta nasil doneriz,
                Map'in value'larini for loopta nasil doneriz,
                Map'in hem key hem de value'larini for loopta nasil doneriz.
                Note: For loop ile bu islemleri yaparken intelij kisayollarindan faydalandigimizda islemleri daha hizli ve hatasiz yapabiliyoruz.
                Ornek olarak,
        1- map.keySet(); yazdiktan sonra,
            CTRL + ALT+ V tuslarina bastigimizda bize referansin tipini
            otomatik olarak olusturuyor.
        2- map.values(); yazdiktan sonra,
            CTRL + ALT+ V tuslarina bastigimizda bize referansin tipini
            otomatik olarak olusturuyor.
        3- map.entrySet(); yazdiktan sonra,
            CTRL + ALT+ V tuslarina bastigimizda bize referansin tipini
            otomatik olarak olusturuyor.
        */
    }
}
