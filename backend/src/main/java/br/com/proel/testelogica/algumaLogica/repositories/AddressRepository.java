package br.com.proel.testelogica.algumaLogica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.proel.testelogica.algumaLogica.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
