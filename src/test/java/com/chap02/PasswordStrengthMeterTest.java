package com.chap02;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void meetsAllCriteria_Then_Strong (){

        PasswordStrengthMeter meter = new PasswordStrengthMeter();

        // [case1] assertEquals만 통과하도록 작성한 case1을 검증
        PasswordStrength result = meter.meter("ab12!@AB");
        assertEquals(PasswordStrength.STRONG,result);

    }

    @DisplayName("길이만 8글자미만, 나머지조건은 충족")
    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal(){

        // [case2] case2 추가
        // 길이만 8글자미만, 나머지조건은 충족
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result2 = meter.meter("ab12!@AB");
        assertEquals(PasswordStrength.NORMAL,result2);
        // --> PasswordStrengthMeter.meter()가 STRONG을 리턴하는 한, 테스트는 계속 FAIL이다

        // --> 여기까지 확인한 후, 다음 단계에서 case 1,2를 모두 충족하는 메서드로직을 작성한다.
    }
}
