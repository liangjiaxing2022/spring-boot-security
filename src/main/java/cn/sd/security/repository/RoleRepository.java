package cn.sd.security.repository;
import cn.sd.security.doMain.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select t from Role t where t.name like :name")
    Page<Role> findByName(@Param("name") String name, Pageable pageRequest);
}
