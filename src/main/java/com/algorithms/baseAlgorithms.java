package com.algorithms;

/**
 * Created by yonney.yang on 2015/5/11.
 */
public class BaseAlgorithms {
    //素数
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //计算平方根(牛顿迭代法)
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1.0 - 15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(1/0);
        System.out.println(1.0/0.0);
        System.out.println(Double.POSITIVE_INFINITY);
    }
}
