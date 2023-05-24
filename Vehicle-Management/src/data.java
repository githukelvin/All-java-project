import java.sql.Connection;

public class data extends  ConnectToMysql {
  public void datag() {
      ConnectToMysql conn = new ConnectToMysql();
      conn.connectToDB();

      Connection con = conn.connection;
      String sql = "SELECT * FROM Register";
      try {
          statement = con.createStatement();
          resultSet = statement.executeQuery(sql);
          while (resultSet.next()) {
            //   String userName = resultSet.getString("userName");
            //   String email = resultSet.getString("email");
          }
      } catch (Exception e) {
          System.out.println(e);
      }
    
  }
    
}
