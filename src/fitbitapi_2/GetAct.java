/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author hp
 */
public class GetAct {

    public static void sendGet(String actk) throws Exception {

        //base-date	The range start date, in the format yyyy-MM-dd or today.
        //period	The range for which data will be returned. Options are 1d, 7d, 30d, 1w, 1m
        //end-date	The end date of the range.
//                        https://api.fitbit.com/1/user/-/activities/heart/date/today/1d/1sec/time/00:00/00:01.json
        String url = " https://api.fitbit.com/1/user/-/activities/date/2017-07-01.json";

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
        ParserAct act = new ParserAct();
        act.decode_act(response.toString());
    }
//細項運動資料
    public static void sendGetDetial(String actk) throws Exception {

        //base-date	The range start date, in the format yyyy-MM-dd or today.
        //period	The range for which data will be returned. Options are 1d, 7d, 30d, 1w, 1m
        //end-date	The end date of the range.
//                        https://api.fitbit.com/1/user/-/activities/heart/date/today/1d/1sec/time/00:00/00:01.json
        String act = "floors";
        
        //https://api.fitbit.com/1/user/-/activities/steps/date/today/1m.json
                    //https://api.fitbit.com/1/user/-/[resource-path]/date/[date]/1d/[detail-level]/time/[start-time]/[end-time].json
        String url = "https://api.fitbit.com/1/user/-/activities/" + act + "/date/2017-07-01/1d/1min/time/00:00/23:59.json";

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
    }
}