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
public class Config {
    private String urlStr = "140.138.77.109";
    private String UserStr = "root";
    private String pwStr = "tear040MARC668";
    private String DBname = "fitbit_log";

    public String getUrlStr() {
        return urlStr;
    }

    public void setUrlStr(String urlStr) {
        this.urlStr = urlStr;
    }

    public String getUserStr() {
        return UserStr;
    }

    public void setUserStr(String UserStr) {
        this.UserStr = UserStr;
    }

    public String getPwStr() {
        return pwStr;
    }

    public void setPwStr(String pwStr) {
        this.pwStr = pwStr;
    }

    public String getDBname() {
        return DBname;
    }

    public void setDBname(String DBname) {
        this.DBname = DBname;
    }
}
