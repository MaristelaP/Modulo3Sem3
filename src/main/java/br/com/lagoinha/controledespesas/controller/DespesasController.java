package br.com.lagoinha.controledespesas.controller;

import br.com.lagoinha.controledespesas.entity.Despesas;
import br.com.lagoinha.controledespesas.service.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("despesas")
public class DespesasController {

    @Autowired
    private DespesasService despesasService;

    @PostMapping
    public Despesas post(@RequestBody Despesas despesas) throws Exception {


        return despesasService.salvarDespesas(despesas);
    }



}
