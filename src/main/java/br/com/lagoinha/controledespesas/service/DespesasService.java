package br.com.lagoinha.controledespesas.service;

import br.com.lagoinha.controledespesas.entity.Despesas;
import br.com.lagoinha.controledespesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    @Autowired
    private DespesasRepository despesasRepository;

    public Despesas salvarDespesas(Despesas despesas) throws Exception {
        despesas.setPendente(true);

        if (despesas.getCredor() == null || despesas.getCredor().isEmpty()){
            throw new Exception("Por favor, informe o Credor.");
        }
        if (despesas.getValorDespesa() == null) {
            throw new Exception("Por favor, informe o valor.");
        }
        return despesasRepository.save(despesas);
    }
}
