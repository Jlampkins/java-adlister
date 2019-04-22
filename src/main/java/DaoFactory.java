import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws Exception {
        if (adsDao == null) {
            //            adsDao = new ListAdsDao();
            try {
                adsDao = new MySQLAdsDao(new Config());
            }catch(SQLException e) {
                throw new Exception("there was a problem");
            }
        }
        return adsDao;
    }
}
