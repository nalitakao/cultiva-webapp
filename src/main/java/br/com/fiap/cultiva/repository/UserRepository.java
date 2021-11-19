package br.com.fiap.cultiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cultiva.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
