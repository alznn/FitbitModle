package fitbitapi_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author hp
 */
public class SleepModel {
    @SerializedName("sleep")
    public List<sleep> sleep;
    @SerializedName("summary")
    public Summary_obj summary;
    
    public class Summary_obj implements Serializable{
        @SerializedName("totalMinutesAsleep")
        private String totalMinutesAsleep;
        @SerializedName("totalSleepRecords")
        private String totalSleepRecords;
        @SerializedName("totalTimeInBed")
        private String totalTimeInBed;

        public String getTotalMinutesAsleep() {
            return totalMinutesAsleep;
        }

        public void setTotalMinutesAsleep(String totalMinutesAsleep) {
            this.totalMinutesAsleep = totalMinutesAsleep;
        }

        public String getTotalSleepRecords() {
            return totalSleepRecords;
        }

        public void setTotalSleepRecords(String totalSleepRecords) {
            this.totalSleepRecords = totalSleepRecords;
        }

        public String getTotalTimeInBed() {
            return totalTimeInBed;
        }

        public void setTotalTimeInBed(String totalTimeInBed) {
            this.totalTimeInBed = totalTimeInBed;
        }
        
    }
    
      public class sleep implements Serializable{
        @SerializedName("dateOfSleep")
        private String dateOfSleep;
        @SerializedName("duration")
        private String duration;
        @SerializedName("efficiency")
        private String efficiency;
        @SerializedName("endTime")
        private String endTime;
        @SerializedName("infoCode")
        private String infoCode;
        @SerializedName("isMainSleep")
        private String isMainSleep;
        @SerializedName("levels")
        public levels levels;
        @SerializedName("logId")
        private String logId;
        @SerializedName("minutesAfterWakeup")
        private String minutesAfterWakeup;
        @SerializedName("minutesAsleep")
        private String minutesAsleep;
        @SerializedName("minutesAwake")
        private String minutesAwake;
        @SerializedName("minutesToFallAsleep")
        private String minutesToFallAsleep;
        @SerializedName("startTime")
        private String startTime;
        @SerializedName("timeInBed")
        private String timeInBed;
        @SerializedName("type")
        private String type;

        public String getDateOfSleep() {
            return dateOfSleep;
        }

        public void setDateOfSleep(String dateOfSleep) {
            this.dateOfSleep = dateOfSleep;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getEfficiency() {
            return efficiency;
        }

        public void setEfficiency(String efficiency) {
            this.efficiency = efficiency;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getInfoCode() {
            return infoCode;
        }

        public void setInfoCode(String infoCode) {
            this.infoCode = infoCode;
        }

        public String getIsMainSleep() {
            return isMainSleep;
        }
        public void setIsMainSleep(String isMainSleep) {
            this.isMainSleep = isMainSleep;
        }
        public String getLogId() {
            return logId;
        }
        public void setLogId(String logId) {
            this.logId = logId;
        }
        public String getMinutesAfterWakeup() {
            return minutesAfterWakeup;
        }
        public void setMinutesAfterWakeup(String minutesAfterWakeup) {
            this.minutesAfterWakeup = minutesAfterWakeup;
        }
        public String getMinutesAsleep() {
            return minutesAsleep;
        }
        public void setMinutesAsleep(String minutesAsleep) {
            this.minutesAsleep = minutesAsleep;
        }
        public String getMinutesAwake() {
            return minutesAwake;
        }
        public void setMinutesAwake(String minutesAwake) {
            this.minutesAwake = minutesAwake;
        }
        public String getMinutesToFallAsleep() {
            return minutesToFallAsleep;
        }
        public void setMinutesToFallAsleep(String minutesToFallAsleep) {
            this.minutesToFallAsleep = minutesToFallAsleep;
        }
        public String getStartTime() {
            return startTime;
        }
        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }
        public String getTimeInBed() {
            return timeInBed;
        }
        public void setTimeInBed(String timeInBed) {
            this.timeInBed = timeInBed;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
    } 
    public class levels implements Serializable{
        @SerializedName("data")
        public  List<data> myData;
        @SerializedName("summary")
        public summary summ;
    }
    
    public class data implements Serializable{
        @SerializedName("dateTime")
        private String dateTime;
        @SerializedName("level")
        private String level;
         @SerializedName("seconds")
        private String seconds;

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getSeconds() {
            return seconds;
        }

        public void setSeconds(String seconds) {
            this.seconds = seconds;
        }
         
    }       

    public class summary implements Serializable{
        @SerializedName("asleep")
        private Count_and_Min asleep;
        @SerializedName("awake")
        private Count_and_Min awake;
         @SerializedName("restless")
        private Count_and_Min restless;

        public Count_and_Min getAsleep() {
            return asleep;
        }

        public void setAsleep(Count_and_Min asleep) {
            this.asleep = asleep;
        }

        public Count_and_Min getAwake() {
            return awake;
        }

        public void setAwake(Count_and_Min awake) {
            this.awake = awake;
        }

        public Count_and_Min getRestless() {
            return restless;
        }

        public void setRestless(Count_and_Min restless) {
            this.restless = restless;
        }
    }        
    
     public class Count_and_Min implements Serializable{
        @SerializedName("count")
        private String count;
        @SerializedName("minutes")
        private String minutes;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getMinutes() {
            return minutes;
        }

        public void setMinutes(String minutes) {
            this.minutes = minutes;
        }
        
    }        
}
