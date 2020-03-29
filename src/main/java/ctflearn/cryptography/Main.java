package ctflearn.cryptography;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BeginnerNoobTwinsRSA rsaFlag = new BeginnerNoobTwinsRSA();
        // found p and q in factordb using n

        BigInteger[] RSA_Beginner = new BigInteger[]{
                new BigInteger("219878849218803628752496734037301843801487889344508611639028"), //c
                new BigInteger("245841236512478852752909734912575581815967630033049838269083"), //n
                new BigInteger("3"),                                                            //e
                new BigInteger("416064700201658306196320137931"),                               //p
                new BigInteger("590872612825179551336102196593")                                //q
        };

        BigInteger[] RSA_Noob = new BigInteger[]{
                new BigInteger("9327565722767258308650643213344542404592011161659991421"),      //c
                new BigInteger("245841236512478852752909734912575581815967630033049838269083"), //n
                new BigInteger("1"),                                                            //e
                new BigInteger("416064700201658306196320137931"),                               //p
                new BigInteger("590872612825179551336102196593")                                //q
        };

        BigInteger[] RSA_Twins = new BigInteger[]{
                new BigInteger("684151956678815994103733261966890872908254340972007896833477109225858676207046453897176861126186570268646592844185948487733725335274498844684380516667587"),    //c
                new BigInteger("14783703403657671882600600446061886156235531325852194800287001788765221084107631153330658325830443132164971084137462046607458019775851952933254941568056899"),  //n
                new BigInteger("65537"),                                                                                                                                                        //e
                new BigInteger("121588253559534573498320028934517990374721243335397811413129137253981502291629"),                                                                               //p
                new BigInteger("121588253559534573498320028934517990374721243335397811413129137253981502291631")                                                                                //q
        };

        //BigInteger[] getArray = RSA_Beginner;
        //BigInteger[] getArray = RSA_Noob;
        BigInteger[] getArray = RSA_Twins;
        System.out.println(rsaFlag.rsa(getArray[0], getArray[1], getArray[2], getArray[3], getArray[4]));
    }
}
