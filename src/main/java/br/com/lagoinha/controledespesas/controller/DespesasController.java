package br.com.lagoinha.controledespesas.controller;

import br.com.lagoinha.controledespesas.entity.Despesas;
import br.com.lagoinha.controledespesas.service.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("despesas")
public class DespesasController {

    @Autowired
    private DespesasService despesasService;

    @PostMapping
    public Despesas post(@RequestBody Despesas despesas) throws Exception {

        return despesasService.salvarDespesas(despesas);
    }

    @PutMapping("/{id}")
    public Despesas put(@PathVariable Long id, @RequestBody Despesas despesas ) throws Exception {

        return despesasService.alterarDespesas(id, despesas);
    }

    @GetMapping
    public List<Despesas> get(){

        return despesasService.listarDespesas();
    }

 /*   @GetMapping
    public List<Despesas> get(){

        return despesasService.listarDespesasPendentes();
    }*/


}
