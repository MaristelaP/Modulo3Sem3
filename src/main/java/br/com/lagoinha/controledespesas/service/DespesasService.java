package br.com.lagoinha.controledespesas.service;

import br.com.lagoinha.controledespesas.entity.Despesas;
import br.com.lagoinha.controledespesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DespesasService {

    @Autowired
    private DespesasRepository despesasRepository;

    public Despesas salvarDespesas(Despesas despesas) throws Exception {
        despesas.setPendente(true);
        despesas.setDataPagamento(null);

        if (despesas.getCredor() == null || despesas.getCredor().isEmpty()){
            throw new Exception("Por favor, informe o Credor.");
        }
        if (despesas.getValorDespesa() == null) {
            throw new Exception("Por favor, informe o valor.");
        }
        return despesasRepository.save(despesas);
    }

    public Despesas alterarDespesas(Long id, Despesas despesas)throws Exception{
        despesas.setDataPagamento(null);
        despesas.setPendente(null);

        if (despesas.getPendente() == false){
            throw new Exception("Esta despesa já foi paga");
        }
        return despesasRepository.save(despesas);
    }

    public List<Despesas> listarDespesas(){

        return despesasRepository.findAll();
    }

 /*   public List<Despesas> listarDespesasPendentes(){
        if (listarDespesas().contains(true))
        return despesasRepository.exists();
    }*/

}
