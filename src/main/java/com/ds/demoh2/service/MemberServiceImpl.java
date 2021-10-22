package com.ds.demoh2.service;

import com.ds.demoh2.entity.Member;
import com.ds.demoh2.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member add(Member member) throws Exception {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAll() throws Exception {
        return memberRepository.findAll();
    }

    @Override
    public void deleteAll() throws Exception {
        memberRepository.deleteAll();
    }
}
