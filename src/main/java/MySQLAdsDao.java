
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException{
        try{
            //implements a driver to translate the java to mysql
            DriverManager.registerDriver(new Driver());
            //requires certain items in order to connect
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getPassword(),
                    config.getUser()
            );
        } catch (SQLException e) {
           throw new SQLException("you messed it up");

        }


    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
          ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM ads");
            while(rs.next()){
                Ad newAd = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(newAd);
            }
        }catch(SQLException e){
            throw new RuntimeException("it no work");
        }
        return ads;

    }
        @Override
    public Long insert(Ad ad) {
        Long newAdId = -1L;
               String query = String.format("INSERT INTO ads(user_id, title, description) VALUES('%d', '%s', '%s')",
                        ad.getUserId(),
                        ad.getTitle(),
                        ad.getDescription());
               try{
                   connection.prepareStatement();
                connection.createStatement().executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = connection.createStatement().getGeneratedKeys();
                if(rs.next()){
                    newAdId = rs.getLong(1);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
               return newAdId;
    }

    public static void main(String[] args) {
        try {
            MySQLAdsDao dao = new MySQLAdsDao(new Config());
            dao.insert(new Ad(1, "JDBC Ad", "Ad created in Java"));
            for (Ad ad : dao.all()) {
                System.out.println(ad.getTitle());
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

}//end of class