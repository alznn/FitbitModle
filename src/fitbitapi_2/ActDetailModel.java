/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */
public class ActDetailModel {

    @SerializedName("activities-calories")
    public List<datatype> calories;
    @SerializedName("activities-calories-intraday")
    public detailtype calories_detail;
    @SerializedName("activities-elevation")
    public List<datatype> elevation;
    @SerializedName("activities-elevation-intraday")
    public detailtype elevation_detail;
    @SerializedName("activities-steps")
    public List<datatype> steps;
    @SerializedName("activities-steps-intraday")
    public detailtype steps_detail;
    @SerializedName("activities-distance")
    public List<datatype> distance;
    @SerializedName("activities-distance-intraday")
    public detailtype distance_detail;
    @SerializedName("activities-floors")
    public List<datatype> floors;
    @SerializedName("activities-floors-intraday")
    public detailtype floors_detail;

    public class detailtype implements Serializable {

        @SerializedName("dataset")
        public List<detail> dataset;
        @SerializedName("datasetType")
        private String datasetType;

        public String getdatasetType() {
            return datasetType;
        }

        public void setdatasetType(String datasetType) {
            this.datasetType = datasetType;
        }
    }

    public class detail implements Serializable {

        @SerializedName("time")
        private String time = " ";
        @SerializedName("value")
        private double value;

        public String getTime() {
            return time;
        }

        public void setime(String time) {
            this.time = time;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    public class datatype implements Serializable {

        @SerializedName("dateTime")
        private String dateTime = " ";

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }
    }
}
