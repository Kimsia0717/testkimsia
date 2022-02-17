package com.sia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sia.domain.MemberDTO;
import com.sia.mapper.MemberMapper;

@Service

public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public int memberJoin(MemberDTO dto) {

        return memberMapper.memberJoin(dto);
    }

    @Override
    public int idCheck(String userId) {

        return memberMapper.idCheck(userId);
    }

    @Override
    public MemberDTO memberLogin(MemberDTO dto) {
        return memberMapper.memberLogin(dto);
    }
}
