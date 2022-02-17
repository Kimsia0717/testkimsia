package com.sia.service;

import com.sia.domain.MemberDTO;

public interface MemberService {
    public int memberJoin(MemberDTO dto);

    public int idCheck(String userID);

    public MemberDTO memberLogin(MemberDTO dto);
}
