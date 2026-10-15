package com.abaddon.mathutil;

import com.abaddon.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        testFactorialGivenValidN5ReturnsWell120();
        //TDD - Viết code bắt đầu từ viết test
    }


    //test hàm tính giai thừa với n = 5 và hy vọng trả về 120
    public static void testFactorialGivenValidN5ReturnsWell120(){
        long expexted = 120;
        long actual = MathUtil.getFactorial(5);

        System.out.println("check 5! | Expected: " + expexted
                         + " | actual: "+actual);
    }

}


//code dùng để test code base, test code chính thì code này gọi là test script
// code này vể lý thuyết ko cần ship cho k/hàng
