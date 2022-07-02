package com.chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s) {
        // [step 0] 일단 호출해서 컴파일에서 제거, AssertionFailedError 확인하기
        //return null;

        // [step 1] 가장 쉬운 1가지 케이스(case1)만 통과하는 테스트코드 작성 --> case2는 FAIL
        return PasswordStrength.STRONG;
    }
}
