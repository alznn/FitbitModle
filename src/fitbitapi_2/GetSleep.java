/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author hp
 */
public class GetSleep {

    public static void sendGetSleep(String actk) throws Exception {
        //new url : GET https://api.fitbit.com/1.2/user/[user-id]/sleep/date/[date].json
        String url = "https://api.fitbit.com/1.2/user/-/sleep/date/2017-07-01.json";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        String auth = "Bearer ";
        String header = auth + actk;;
        con.setRequestProperty("Authorization", header);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print result
        System.out.println(response.toString());
        ParserSleep parser = new ParserSleep();
        parser.decode_sleep(response.toString());
        parser.decodeTotalSleep(response.toString());

    }

    public static void sendDateRangeSleep(String actk , String Start , String End) throws IOException, JSONException, SQLException{
        String url = "https://api.fitbit.com/1.2/user/-/sleep/date/2017-06-28/2017-07-01.json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        String auth = "Bearer ";
        String header = auth + actk;;
        con.setRequestProperty("Authorization", header);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        ParserSleep parser = new ParserSleep();
        parser.decode_sleep(response.toString());
    }
}
