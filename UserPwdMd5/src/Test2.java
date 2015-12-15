
public class Test2
{
    //    public static void main(String[] args)
    //    {
    //        List<User> list = new ArrayList<User>();
    //        try
    //        {
    //            //加载驱动
    //            Class.forName("oracle.jdbc.driver.OracleDriver");
    //            //得到连接
    //            Connection ct = DriverManager.getConnection("jdbc:oracle:thin:@192.168.5.56:1521:orcl",
    //                    "nt_jmyj",
    //                    "nt_jmyj");
    //            
    //            Statement sm = ct.createStatement();
    //            ResultSet rs = sm.executeQuery("select userid,password from t_users");
    //            while (rs.next())
    //            {
    //                User user = new User();
    //                user.setFuserid(rs.getInt(1));
    //                String pwd = rs.getString(2);
    //                
    //                user.setPwd(MD5.digest(pwd));
    //                list.add(user);
    //            }
    //            for (User user : list)
    //            {
    //                String sql = "update t_users set password='" + user.getPwd()
    //                        + "' where userid=" + user.getFuserid();
    //                sm.executeUpdate(sql);
    //            }
    //            rs.close();
    //            sm.close();
    //            ct.close();
    //        }
    //        catch (Exception e)
    //        {
    //            e.printStackTrace();
    //        }
    //    }
}
