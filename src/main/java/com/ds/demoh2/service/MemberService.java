package com.ds.demoh2.service;

import com.ds.demoh2.entity.Member;

import java.util.List;

public interface MemberService {
    public Member add(Member member) throws Exception;
    public List<Member> getAll() throws Exception;
    public void deleteAll() throws Exception;
}
