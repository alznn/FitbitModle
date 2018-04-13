/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import com.google.gson.Gson;

/**
 *
 * @author hp
 */
public class ParserAct {
     public static void decode_act(String response) {
        Gson gson = new Gson();
        ActModel actData = gson.fromJson(response, ActModel.class);
        
/*******************************************Goal*******************************************/
        System.out.println("\n Goals ActMin : " + actData.goal.getActiveMinutes());
        System.out.println("\n Goals calout : " + actData.goal.getCaloriesOut());
        System.out.println("\n Goals distance : " + actData.goal.getDistance());
        System.out.println("\n Goals floors : " + actData.goal.getFloors());
        System.out.println("\n Goals steps : " + actData.goal.getSteps());
        
/*******************************************Summary*******************************************/
        System.out.println("\n sum ActScore : " + actData.summary.getActiveScore());
        System.out.println("\n sum ActCal : " + actData.summary.getActivityCalories());
        System.out.println("\n sum caloriesBMR : " + actData.summary.getCaloriesBMR());
        System.out.println("\n sum caloriesOut : " + actData.summary.getCaloriesBMR());
        System.out.println("\n sum elevation : " + actData.summary.getElevation());
        System.out.println("\n sum fairlyActiveMinutes : " + actData.summary.getFairlyActiveMinutes());
        System.out.println("\n sum floors : " + actData.summary.getFloors());
        System.out.println("\n sum lightlyActiveMinutes : " + actData.summary.getLightlyActiveMinutes());
        System.out.println("\n sum marginalCalories : " + actData.summary.getMarginalCalories());
        System.out.println("\n sum restingHeartRate : " + actData.summary.getRestingHeartRate());
        System.out.println("\n sum sedentaryMinutes : " + actData.summary.getSedentaryMinutes());
        System.out.println("\n sum steps : " + actData.summary.getSteps());
        System.out.println("\n sum veryActiveMinutes : " + actData.summary.getVeryActiveMinutes());
        for(int i = 0 ; i <actData.summary.dist.size() ; i++){
            System.out.println("\n sum dist Act : " + actData.summary.dist.get(i).getActivity());
            System.out.println("\n sum dist Dist : " + actData.summary.dist.get(i).getDistance());
        }
        for(int i = 0 ; i <actData.summary.HRZone.size() ; i++){
            System.out.println("\n sum Name : " + actData.summary.HRZone.get(i).getName());
            System.out.println("\n sum Max : " + actData.summary.HRZone.get(i).getMax());
            System.out.println("\n sum Min : " + actData.summary.HRZone.get(i).getMin());
            System.out.println("\n sum Minutes : " + actData.summary.HRZone.get(i).getMunutes());
            System.out.println("\n sum Cal out : " + actData.summary.HRZone.get(i).getCaloriesOut());
        }
        
     }
        public static void decode_detailAct(String response) {
        Gson gson = new Gson();
        ActDetailModel actData = gson.fromJson(response, ActDetailModel.class);
     }
    
}
