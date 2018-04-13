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
public class FitbitAPI_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        MySQLConnect sql = new MySQLConnect("140.138.77.109", "root", "tear040MARC668", "fitbit_log");
        sql.connectDB();
        sql.doQuery("select access_token from access where account =  'yzuacchc17@gmail.com';");

        StringBuffer rs = sql.getResultString();
        String str = rs.toString();
        str = str.substring(15, 288);
        System.out.println("S: " + str);

//            GetSleep sleep = new GetSleep();
//            sleep.sendGetSleep(str);
//            sleep.sendDateRangeSleep(str,"111","00");
//            GetHR hr = new GetHR();
//            hr.sendGet(str);
//            GetFriends fr = new GetFriends();
//            fr.sendGet(str);
        GetAct act = new GetAct();
        act.sendGet(str);

        /*            GetSubscription sb = new GetSubscription();
            sb.sendGetAPI(str);
            sb.sendGetAct(str);
            sb.sendGetSleep(str);
            sb.sendGetFood(str);
            sb.sendGetBody(str);
         */
        return;

    }
}
