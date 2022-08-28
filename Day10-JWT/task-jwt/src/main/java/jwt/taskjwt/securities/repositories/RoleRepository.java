package jwt.taskjwt.securities.repositories;

import jwt.taskjwt.securities.entity.Role;
import jwt.taskjwt.securities.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName)
}
