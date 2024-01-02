import java.sql.Connection;

public class Jdbc1 {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is loaded..");

    }
}
