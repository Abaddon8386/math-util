package com.abaddon.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.abaddon.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test case 1: test hàm với đầu vào hợp lệ n = 5, trả về 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expexted = 120;
        int i = 5;
        long actual = getFactorial(i);


        //so sánh tự động expected có == actual hay ko
        //nếu == thì màu xanh
        //else màu đỏ
        assertEquals(expexted, actual);
    }

    //test case 2: test hàm với đầu vào hợp lệ n = 6, trả về 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expexted = 720;
        int i = 6;
        long actual = getFactorial(i);


        //so sánh tự động expected có == actual hay ko
        //nếu == thì màu xanh
        //else màu đỏ
        assertEquals(expexted, actual);
    }

    //test case 3: test hàm với đầu vào hợp lệ n = 0, trả về 1
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expexted = 1;
        int i = 0;
        long actual = getFactorial(i);


        //so sánh tự động expected có == actual hay ko
        //nếu == thì màu xanh
        //else màu đỏ
        assertEquals(expexted, actual);
    }

    //test case 4: test hàm với đầu vào ko hợp lệ n = -1, trả về ngoại lệ !! illegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {

        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-1);});
    }

}