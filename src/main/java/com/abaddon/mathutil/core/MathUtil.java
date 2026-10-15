package com.abaddon.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        long total = 1; //cố tình sửa sai
        //fix lại để pass testcase, để thấy màu xanh trên github

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        //n đang ổn, lặp vằng for
        for (int i = 1; i <= n ; i++) {
            total *=i;

        }
        return total;
    }
}

//code chính, code base , code dân dev phải làm