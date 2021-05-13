package br.com.proel.testelogica.algumaLogica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.proel.testelogica.algumaLogica.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
