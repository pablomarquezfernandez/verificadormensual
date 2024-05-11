package co.inphotech.marshando;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("--->>><<<----");
            String transmissionsURL = System.getenv("transmissions_url");
            System.out.println(transmissionsURL);
            HttpResponse<String>data = Unirest.get( transmissionsURL + "/transmission-package/verify-monthly").header("Authorization", "Data-Temp").header("content-type", "application/json").asString();
            System.out.println( data.getStatus() );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}