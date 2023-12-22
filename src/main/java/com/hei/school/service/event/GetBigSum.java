package com.hei.school.service.event;

import java.math.BigInteger;

public class GetBigSum {
    public static BigInteger getBigSum(String a , String b){
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        return A.add(B);
    }
}

