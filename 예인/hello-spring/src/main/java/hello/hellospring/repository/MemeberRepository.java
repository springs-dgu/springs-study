package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemeberRepository {
    Member save(Member member); //멤버 저장
    Optional<Member> findById(Long id);//회원 조회
    Optional<Member> findByName(String name);//회원 조회
    List<Member> findAll();//모든 회원 리스트 반환
}
