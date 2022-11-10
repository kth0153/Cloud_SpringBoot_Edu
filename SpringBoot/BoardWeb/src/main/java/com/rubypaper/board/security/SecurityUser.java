package com.rubypaper.board.security;

import com.rubypaper.board.domain.Member;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class SecurityUser extends User {
    private static final long serialVersionUID = 1L;
    private Member member;


    public SecurityUser(Member member) {
        super(member.getId(),
                member.getPassword(), AuthorityUtils.createAuthorityList(member.getRole().toString()));
        this.member=member;
    }
    public Member getMember(){
        return member;
    }
}