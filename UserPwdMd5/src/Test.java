import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        List<User> list = new ArrayList<User>();
        try
        {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //得到连接
            Connection ct = DriverManager.getConnection("jdbc:oracle:thin:@192.168.5.59:1521:orcl",
                    "nt_jmyj",
                    "nt_jmyj");
            
            Statement sm = ct.createStatement();
            String sql1 = "";
            
            if (args[0].equals("fbs_users"))
            {
                sql1 = "select fuserid,pwd from fbs_users";
            }
            else
            {
                sql1 = "select userid,password from t_users";
            }
            ResultSet rs = sm.executeQuery(sql1);
            while (rs.next())
            {
                User user = new User();
                user.setFuserid(rs.getInt(1));
                String pwd = rs.getString(2);
                
                user.setPwd(MD5.digest(pwd));
                list.add(user);
            }
            String sql = "";
            for (User user : list)
            {
                if (args[0].equals("fbs_users"))
                {
                    sql = "update fbs_users set pwd='" + user.getPwd()
                            + "' where fuserid=" + user.getFuserid();
                }
                else
                {
                    sql = "update t_users set password='" + user.getPwd()
                            + "' where userid=" + user.getFuserid();
                }
                
                sm.executeUpdate(sql);
            }
            rs.close();
            sm.close();
            ct.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
