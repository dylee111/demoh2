package com.ds.demoh2.controller;

import com.ds.demoh2.entity.Member;
import com.ds.demoh2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Member add(@RequestBody Member member) {
        Member addMember = null;
        try {
            addMember = memberService.add(member);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addMember;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Member> getAll() {
        try {
            return memberService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
    public String deleteAll() {
        try {
            memberService.deleteAll();
            return "All Deleted";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Fail to delete!";
    }
}
