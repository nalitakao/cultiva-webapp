package br.com.fiap.cultiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cultiva.model.Harvests;

public interface HarvestRepository extends JpaRepository<Harvests, Long> {

}
