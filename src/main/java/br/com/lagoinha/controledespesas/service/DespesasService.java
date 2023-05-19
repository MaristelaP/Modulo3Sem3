package br.com.lagoinha.controledespesas.service;

import br.com.lagoinha.controledespesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesasService {

    @Autowired
    private DespesasRepository despesasRepository;
}
