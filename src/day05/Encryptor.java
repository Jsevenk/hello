package day05;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Encryptor
{
  private static final String PASSWORD_CRYPT_KEY = "KP#M6EB8";
  private static final String ALGORITHM = "DES/CBC/PKCS5Padding";

  public static final String encrypt(String data)
    throws Exception
  {
    return byte2hex(encrypt(data.getBytes(), PASSWORD_CRYPT_KEY.getBytes()));
  }

  public static final String decrypt(String data)
    throws Exception
  {
    return new String(decrypt(hex2byte(data.getBytes()), PASSWORD_CRYPT_KEY.getBytes()));
  }

  private static byte[] encrypt(byte[] data, byte[] key)
    throws Exception
  {
    DESKeySpec dks = new DESKeySpec(key);

    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey securekey = keyFactory.generateSecret(dks);

    IvParameterSpec iv = new IvParameterSpec(key);

    Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

    cipher.init(1, securekey, iv);

    return cipher.doFinal(data);
  }

  private static byte[] decrypt(byte[] data, byte[] key)
    throws Exception
  {
    DESKeySpec dks = new DESKeySpec(key);

    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");

    SecretKey securekey = keyFactory.generateSecret(dks);

    IvParameterSpec iv = new IvParameterSpec(key);

    Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

    cipher.init(2, securekey, iv);

    return cipher.doFinal(data);
  }

  public static String byte2hex(byte[] b)
  {
    String hs = "";
    String stmp = "";
    for (int n = 0; n < b.length; ++n) {
      stmp = Integer.toHexString(b[n] & 0xFF);
      if (stmp.length() == 1)
        hs = hs + "0" + stmp;
      else
        hs = hs + stmp;
    }
    return hs.toUpperCase();
  }

  public static byte[] hex2byte(byte[] b)
  {
    if (b.length % 2 != 0)
      throw new IllegalArgumentException("���Ȳ���ż��");
    byte[] b2 = new byte[b.length / 2];
    for (int n = 0; n < b.length; n += 2) {
      String item = new String(b, n, 2);
      b2[(n / 2)] = (byte)Integer.parseInt(item, 16);
    }
    return b2;
  }

  public static void main(String[] args) throws Exception
  {
    System.out.println(encrypt("001007"));
    System.out.println(decrypt("ynZiep5pWto=".toUpperCase()));

  }
}