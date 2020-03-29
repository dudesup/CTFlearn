package ctflearn.cryptography;

import java.math.BigInteger;

public class BeginnerNoobTwinsRSA {
    public String rsa(BigInteger c, BigInteger n, BigInteger e, BigInteger p, BigInteger q) throws Exception{
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger d = e.modInverse(phi);
        BigInteger m = c.modPow(d,n);

        String mHex = m.toString(16);

        StringBuilder hexToASCII = new StringBuilder();

        if(mHex.length()%2!=0){
            throw new Exception("mHex.length() must be even number");
        }
        for(int i = 0; i<mHex.length(); i+=2){
            String str = mHex.substring(i, i+2);
            int characterASCII = Integer.valueOf(str, 16);
            hexToASCII.append((char)characterASCII);
        }

        return hexToASCII.toString();
    }
}
