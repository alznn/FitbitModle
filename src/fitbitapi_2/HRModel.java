/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

/**
 *
 * @author hp
 */
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yang
 */
public class HRModel {
    @SerializedName("activities-heart")
    public List<heart> heart; 
     @SerializedName("activities-heart-intraday")
    public intraday intraday_heart; 
    public class heart implements Serializable{
        @SerializedName("dateTime")
        private String dateTime;
        @SerializedName("value")
        public ValueType value;        
        public String getDateTime() {
            return dateTime;
        }
        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }
    }
    public class ValueType implements Serializable{
        @SerializedName("heartRateZones")
        public List<heartrate> heartRateZones;
    }
    public class heartrate implements Serializable{
        @SerializedName("caloriesOut")  
        private double caloriesOut;
        @SerializedName("max")
        private int max;
        @SerializedName("min")
        private int min;
        @SerializedName("minutes")
        private String minutes;
        @SerializedName("name")
        private String name;
        public double getCaloriesOut() {
            return caloriesOut;
        }
        public void setCaloriesOut(double caloriesOut) {
            this.caloriesOut = caloriesOut;
        }
         public int getMax() {
            return max;
        }
        public void setMax(int max) {
            this.max = max;
        }
        public int getMin() {
            return min;
        }
        public void setMin(int min) {
            this.min = min;
        }
        public String getMinutes() {
            return minutes;
        }
        public void setMinutes(String minutes) {
            this.minutes = minutes;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    
    public class intraday implements Serializable{
        @SerializedName("dataset")
        public List<Dataset>dataset;   
        @SerializedName("datasetInterval")
        private String datasetInterval;      
        @SerializedName("datasetType")
        private String datasetType;  

        public String getDatasetInterval() {
            return datasetInterval;
        }

        public void setDatasetInterval(String datasetInterval) {
            this.datasetInterval = datasetInterval;
        }

        public String getDatasType() {
            return datasetType;
        }

        public void setDatasType(String datasType) {
            this.datasetType = datasetType;
        }
        
    }
    
     public class Dataset implements Serializable{
        @SerializedName("time")
        private String time;
         @SerializedName("value")
        private String value;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
         
         
    }
    
}

