/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.sql.SQLException;
//import org.immutables.gson.Gson;
import org.json.JSONException;

/**
 *
 * @author hp
 */
public class ParserSleep {
  
    public static void decode_sleep(String response) throws JSONException, SQLException {
        Gson gson = new Gson();
        SleepModel data = gson.fromJson(response, SleepModel.class);
        System.out.println("\n\n\n Size: = " + data.sleep.size());
        for (int i = 0; i < data.sleep.size(); i++){
            System.out.println("\n\n\ndateOfSleep = " + data.sleep.get(i).getDateOfSleep());
            System.out.println("\nDuration = " + data.sleep.get(i).getDuration());
            System.out.println("\nEfficiency = " + data.sleep.get(i).getEfficiency());
            System.out.println("\nEndTime = " + data.sleep.get(i).getEndTime());
            System.out.println("\nInfoCode = " + data.sleep.get(i).getInfoCode());
            System.out.println("\nIsMainSleep = " + data.sleep.get(i).getIsMainSleep());
            System.out.println("\nLogId = " + data.sleep.get(i).getLogId());
            System.out.println("\nMinutesAfterWakeup = " + data.sleep.get(i).getMinutesAfterWakeup());
            System.out.println("\nMinutesAsleep = " + data.sleep.get(i).getMinutesAsleep());
            System.out.println("\nMinutesAwake = " + data.sleep.get(i).getMinutesAwake());
            System.out.println("\nMinutesToFallAsleep = " + data.sleep.get(i).getMinutesToFallAsleep());
            System.out.println("\nStartTime = " + data.sleep.get(i).getStartTime());
            System.out.println("\nTimeInBed = " + data.sleep.get(i).getTimeInBed());
            System.out.println("\ntype = " + data.sleep.get(i).getType());
            for(int j = 0 ; j < data.sleep.get(i).levels.myData.size();j++){
                System.out.println("\nlevel dateTime = " + data.sleep.get(i).levels.myData.get(j).getDateTime());
                System.out.println("\nlevel level = " + data.sleep.get(i).levels.myData.get(j).getLevel());
                System.out.println("\nlevel second = " + data.sleep.get(i).levels.myData.get(j).getSeconds());
            }
            System.out.println("\nSummary Asleep Count = " + data.sleep.get(i).levels.summ.getAsleep().getCount());
            System.out.println("\nSummary Asleep Minutes = " + data.sleep.get(i).levels.summ.getAsleep().getMinutes());
            System.out.println("\nSummary Asleep Count = " + data.sleep.get(i).levels.summ.getAwake().getCount());
            System.out.println("\nSummary Asleep Minutes = " + data.sleep.get(i).levels.summ.getAwake().getMinutes());
            System.out.println("\nSummary Asleep Count = " + data.sleep.get(i).levels.summ.getRestless().getCount());
            System.out.println("\nSummary Asleep Minutes = " + data.sleep.get(i).levels.summ.getRestless().getMinutes());
        }
    }
    
    public static void decodeTotalSleep(String response){
        Gson gson = new Gson();
        SleepModel data = gson.fromJson(response, SleepModel.class);
        System.out.println("\nSummary totalMinutesAsleep = " + data.summary.getTotalMinutesAsleep());
        System.out.println("\nSummary totalSleepRecord = " + data.summary.getTotalSleepRecords());
        System.out.println("\nSummary totalTimeInBed = " + data.summary.getTotalTimeInBed());
    }
}