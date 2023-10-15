package br.com.apsgois.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/** representacao dos metodos **/
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
