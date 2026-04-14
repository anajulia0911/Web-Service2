package br.mackenzie.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    private List<Empresa> empresas = new ArrayList<>();

    public EmpresaController() {
        empresas.add(new Empresa(1, "Empresa Alfa LTDA", "12.345.678/0001-90", "contato@empresa-alfa.com"));
        empresas.add(new Empresa(2, "Beta Comércio ME", "98.765.432/0001-10", "beta@comercio.com"));
        empresas.add(new Empresa(3, "Gamma Serviços S.A.", "11.222.333/0001-44", "servicos@gamma.com"));
        empresas.add(new Empresa(4, "Delta Engenharia", "22.333.444/0001-55", "contato@deltaeng.com"));
        empresas.add(new Empresa(5, "Epsilon Digital", "33.444.555/0001-66", "email@epsilondigital.com"));
    }

    @GetMapping
    public List<Empresa> getAll() { return empresas; }

    @PostMapping
    public Empresa create(@RequestBody Empresa e) {
        empresas.add(e);
        return e;
    }
}