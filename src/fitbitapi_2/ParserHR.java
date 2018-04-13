/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import com.google.gson.Gson;
import java.sql.SQLException;
import org.json.JSONException;

/**
 *
 * @author hp
 */
public class ParserHR {

    public static void decodeHR(String response) throws JSONException, SQLException {
        Gson gson = new Gson();
        HRModel hrData = gson.fromJson(response, HRModel.class);
        System.out.println("\n Size: = " + hrData.heart.size());
        for (int i = 0; i < hrData.heart.size(); i++) {
            System.out.println("\ndateTime = " + hrData.heart.get(i).getDateTime());
            for (int j = 0; j < hrData.heart.get(i).value.heartRateZones.size(); j++) {
                System.out.println("\n Value Car = " + hrData.heart.get(i).value.heartRateZones.get(j).getCaloriesOut());
                System.out.println("\n Value Minu        = " + hrData.heart.get(i).value.heartRateZones.get(j).getMinutes());
                System.out.println("\n Value Name = " + hrData.heart.get(i).value.heartRateZones.get(j).getName());
                System.out.println("\n Value MAX = " + hrData.heart.get(i).value.heartRateZones.get(j).getMax());
                System.out.println("\n Value Min = " + hrData.heart.get(i).value.heartRateZones.get(j).getMin());
            }
        }
        System.out.println("\ndatasetInterval = " + hrData.intraday_heart.getDatasetInterval());
        System.out.println("\ndataType = " + hrData.intraday_heart.getDatasType());
        for (int j = 0; j < hrData.intraday_heart.dataset.size(); j++) {
            System.out.println("\ndataset Time = " + hrData.intraday_heart.dataset.get(j).getTime());
            System.out.println("\ndataset Value = " + hrData.intraday_heart.dataset.get(j).getValue());
        }
    }
}
