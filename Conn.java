package atm.project;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            
            c=DriverManager.getConnection("jdbc:mysql:///atmproject","root","Archana@07");
            s= c.createStatement();
        
        }catch (Exception e){
            System.out.println(e);
        }
    
}

    
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
