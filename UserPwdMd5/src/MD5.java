import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
    public static String digest(String md5src)
            throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        return digest(md5src, null);
    }
    
    public static String digest(String md5src, String encode)
            throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        byte[] digesta = null;
        MessageDigest alga = MessageDigest.getInstance("MD5");
        if (null == encode || "".equals(encode))
        {
            alga.update(md5src.getBytes());
        }
        else
        {
            alga.update(md5src.getBytes(encode));
        }
        digesta = alga.digest();
        return StringUtil.byte2hex(digesta);
    }
}
