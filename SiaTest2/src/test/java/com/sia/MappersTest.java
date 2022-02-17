package com.sia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sia.domain.MemberDTO;
import com.sia.mapper.MemberMapper;

@SpringBootTest
public class MappersTest {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testOfInsert() {
        MemberDTO params = new MemberDTO();
        params.setId("test");
        params.setPw("1234");
        params.setPh("63974850");

        int result = memberMapper.memberJoin(params);
        System.out.println("결과는 " + result + "입니다.");
    }

}
