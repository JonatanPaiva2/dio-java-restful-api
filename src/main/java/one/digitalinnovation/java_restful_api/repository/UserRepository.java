package one.digitalinnovation.java_restful_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.java_restful_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
