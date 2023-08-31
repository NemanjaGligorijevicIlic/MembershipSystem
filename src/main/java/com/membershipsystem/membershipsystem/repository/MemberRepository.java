package com.membershipsystem.membershipsystem.repository;

import com.membershipsystem.membershipsystem.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
