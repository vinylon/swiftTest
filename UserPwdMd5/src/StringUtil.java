
/**
 * 字符串处理类
 * Time：2015年4月17日 上午10:51:20<br/>
 * @author mawei
 * @version 1.0.0
 * @since 1.0.0
 */
public class StringUtil
{
    
    public static String byte2hex(byte[] b)
    {
        StringBuffer hs = new StringBuffer();
        String stmp = "";
        for (int n = 0; n < b.length; n++)
        {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
            {
                hs.append("0");
                hs.append(stmp);
            }
            else
            {
                hs.append(stmp);
            }
        }
        return hs.toString();
    }
}
