package bank.managament.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
        //mysql is an external entity so runtime time erreor might be possible so try and catch are used
                
        try{
            //step 1: register the driver
//            Class.forName(com.mysql.cj.jdbc.Driver);S
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Harshada@2003");
            s=c.createStatement();
            
        }catch( Exception e){
            System.out.println(e);
        }
    
    
    }
    
}
