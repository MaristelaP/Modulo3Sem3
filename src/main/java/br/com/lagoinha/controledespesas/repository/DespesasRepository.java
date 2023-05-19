package br.com.lagoinha.controledespesas.repository;

import br.com.lagoinha.controledespesas.entity.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesasRepository extends JpaRepository<Despesas, Long> {
}
