package com.sia.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sia.domain.MemberDTO;

@Mapper
public interface MemberMapper {
    public int memberJoin(MemberDTO dto);

    public int idCheck(String userID);

    public MemberDTO memberLogin(MemberDTO dto);

}
