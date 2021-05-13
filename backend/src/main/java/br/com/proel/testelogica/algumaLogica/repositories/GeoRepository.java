package br.com.proel.testelogica.algumaLogica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.proel.testelogica.algumaLogica.entities.Geo;

public interface GeoRepository extends JpaRepository<Geo, Long> {

}
