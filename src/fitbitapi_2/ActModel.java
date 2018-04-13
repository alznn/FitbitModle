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
public class ActModel {

    @SerializedName("summary")
    public sum summary;
    @SerializedName("goals")
    public Goal goal;
    @SerializedName("activities")
    public List<activity> activities;

    public class sum implements Serializable {

        @SerializedName("activeScore")
        private double activeScore;
        @SerializedName("activityCalories")
        private double activityCalories;
        @SerializedName("caloriesBMR")
        private double caloriesBMR;
        @SerializedName("caloriesOut")
        private double caloriesOut;
        @SerializedName("distances")
        public List<distances> dist;
        @SerializedName("elevation")
        private double elevation;
        @SerializedName("fairlyActiveMinutes")
        private double fairlyActiveMinutes;
        @SerializedName("floors")
        private double floors;
        @SerializedName("heartRateZones")
        public List<heartRateZones> HRZone;
        @SerializedName("lightlyActiveMinutes")
        private double lightlyActiveMinutes;
        @SerializedName("marginalCalories")
        private double marginalCalories;
        @SerializedName("restingHeartRate")
        private double restingHeartRate;
        @SerializedName("sedentaryMinutes")
        private double sedentaryMinutes;
        @SerializedName("steps")
        private double steps;
        @SerializedName("veryActiveMinutes")
        private double veryActiveMinutes;

        public double getActiveScore() {
            return activeScore;
        }

        public void setActiveScore(double activeScore) {
            this.activeScore = activeScore;
        }

        public double getActivityCalories() {
            return activityCalories;
        }

        public void setActivityCalories(double activityCalories) {
            this.activityCalories = activityCalories;
        }

        public double getCaloriesBMR() {
            return caloriesBMR;
        }

        public void setCaloriesBMR(double caloriesBMR) {
            this.caloriesBMR = caloriesBMR;
        }

        public double getElevation() {
            return elevation;
        }

        public void setElevation(double elevation) {
            this.elevation = elevation;
        }

        public double getFairlyActiveMinutes() {
            return fairlyActiveMinutes;
        }

        public void setFairlyActiveMinutes(double fairlyActiveMinutes) {
            this.fairlyActiveMinutes = fairlyActiveMinutes;
        }

        public double getFloors() {
            return floors;
        }

        public void setFloors(double floors) {
            this.floors = floors;
        }

        public double getLightlyActiveMinutes() {
            return lightlyActiveMinutes;
        }

        public void setLightlyActiveMinutes(double lightlyActiveMinutes) {
            this.lightlyActiveMinutes = lightlyActiveMinutes;
        }

        public double getMarginalCalories() {
            return marginalCalories;
        }

        public void setMarginalCalories(double marginalCalories) {
            this.marginalCalories = marginalCalories;
        }

        public double getRestingHeartRate() {
            return restingHeartRate;
        }

        public void setRestingHeartRate(double restingHeartRate) {
            this.restingHeartRate = restingHeartRate;
        }

        public double getSedentaryMinutes() {
            return sedentaryMinutes;
        }

        public void setSedentaryMinutes(double sedentaryMinutes) {
            this.sedentaryMinutes = sedentaryMinutes;
        }

        public double getSteps() {
            return steps;
        }

        public void setSteps(double steps) {
            this.steps = steps;
        }

        public double getVeryActiveMinutes() {
            return veryActiveMinutes;
        }

        public void setVeryActiveMinutes(double veryActiveMinutes) {
            this.veryActiveMinutes = veryActiveMinutes;
        }

        public double getCaloriesOut() {
            return caloriesOut;
        }

        public void setCaloriesOut(double caloriesOut) {
            this.caloriesOut = caloriesOut;
        }
        
    }

    public class Goal implements Serializable {

        @SerializedName("activeMinutes")
        private String activeMinutes;
        @SerializedName("caloriesOut")
        private String caloriesOut;
        @SerializedName("distance")
        private String distance;
        @SerializedName("floors")
        private String floors;
        @SerializedName("steps")
        private String steps;

        public String getActiveMinutes() {
            return activeMinutes;
        }

        public void setActiveMinutes(String activeMinutes) {
            this.activeMinutes = activeMinutes;
        }

        public String getCaloriesOut() {
            return caloriesOut;
        }

        public void setCaloriesOut(String caloriesOut) {
            this.caloriesOut = caloriesOut;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getFloors() {
            return floors;
        }

        public void setFloors(String floors) {
            this.floors = floors;
        }

        public String getSteps() {
            return steps;
        }

        public void setSteps(String steps) {
            this.steps = steps;
        }
        
        
    }

    public class activity implements Serializable {}
     
    public class distances implements Serializable {
        @SerializedName("activity")
        private String activity;
        @SerializedName("distance")
        private double distance;

        public String getActivity() {
            return activity;
        }

        public void setActivity(String activity) {
            this.activity = activity;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }
        
        
     }
    
     public class heartRateZones implements Serializable {
         @SerializedName ("caloriesOut")
         private double caloriesOut;
         @SerializedName ("max")
         private int max;
         @SerializedName ("min")
         private int min;
          @SerializedName ("munutes")
         private int munutes;
         @SerializedName ("name")
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

        public int getMunutes() {
            return munutes;
        }

        public void setMunutes(int munutes) {
            this.munutes = munutes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
         
     }
}
