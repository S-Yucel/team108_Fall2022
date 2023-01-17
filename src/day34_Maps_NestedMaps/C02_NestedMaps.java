package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

        /*
        {
        "firstname" : "Ahmet",
        "lastname" : "Bulut",
        "totalprice" : 500,
        "depositpaid" : false,
        "bookingdates" : {
        "checkin" : "2021-06-01",
        "checkout" : "2021-06-10"
          },
        "additionalneeds" : "wi-fi" }
         */
        public static void main(String[] args) {
            Map<String,String> bookingdatesMap = new HashMap<>();
            bookingdatesMap.put("checkin","2021-06-01");
            bookingdatesMap.put("checkout","2021-06-10");

            Map<String,Object> bookingMap = new HashMap<>();
            bookingMap.put("firstname","Ahmet");
            bookingMap.put("lastname" , "Bulut");
            bookingMap.put("totalprice" , 500);
            bookingMap.put("depositpaid" , false);
            bookingMap.put("bookingdates",bookingdatesMap);
            bookingMap.put("additionalneeds" , "wi-fi");

            System.out.println(bookingMap);
    }
    
}
