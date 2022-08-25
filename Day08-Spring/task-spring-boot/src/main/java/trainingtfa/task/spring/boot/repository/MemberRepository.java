package trainingtfa.task.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trainingtfa.task.spring.boot.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
