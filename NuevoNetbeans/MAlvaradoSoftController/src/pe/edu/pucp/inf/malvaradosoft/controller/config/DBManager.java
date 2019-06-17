/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.malvaradosoft.controller.config;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DBManager {
    private static String url;
    private static String user;
    private static String password;
    private static final DBManager dbManager = new DBManager();

    public DBManager() {
        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);
        FileReader reader;
        try{
<<<<<<< HEAD
            reader = new FileReader("src/pe/edu/pucp/inf/config/config.xml");
=======
            reader = new FileReader("src/pe/edu/pucp/inf/lp2/config/config.xml");
>>>>>>> 138933a3c4c4777bc8191fb9329f1c52bb41c5f8
            ConnectionParameters connParam =
            (ConnectionParameters) xstream.fromXML(reader);
            url = connParam.getUrl();
            password = connParam.getPassword();
            user = connParam.getUser();
            if(url.contains("mysql")){
                Class.forName("com.mysql.cj.jdbc.Driver");
            }else{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            }
            System.out.println("Se ha registrado el Driver");
        }catch(FileNotFoundException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public static DBManager getDbManager() {
        return dbManager;
    }
    
    
=======
    public static DBManager getdbManager() {
        return dbManager;
    }
    
>>>>>>> 138933a3c4c4777bc8191fb9329f1c52bb41c5f8
}
