package br.mackenzie.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {
    private List<Vaga> vagas = new ArrayList<>();

    public VagaController() {
        vagas.add(new Vaga(1, "Desenvolvedor Java", "Atuação em projetos backend com Java e Spring.", "2025-10-01", true, 1));
        vagas.add(new Vaga(2, "Analista de Suporte Técnico", "Suporte a clientes e resolução de chamados.", "2025-09-27", true, 2));
        vagas.add(new Vaga(3, "Engenheiro de Software", "Desenvolvimento de soluções corporativas.", "2025-10-03", false, 3));
        vagas.add(new Vaga(4, "Analista de Dados", "Manipulação de dados com SQL e Python.", "2025-09-18", true, 4));
        vagas.add(new Vaga(5, "Designer Digital", "Criação de materiais gráficos e UX/UI.", "2025-09-30", false, 5));
        vagas.add(new Vaga(6, "Consultor de Projetos", "Acompanhamento de projetos empresariais.", "2025-10-06", true, 1));
        vagas.add(new Vaga(7, "Programador Full Stack", "Desenvolvimento web frontend e backend.", "2025-10-04", true, 2));
    }

    @GetMapping
    public List<Vaga> getAll() { return vagas; }

    @PostMapping
    public Vaga create(@RequestBody Vaga v) {
        vagas.add(v);
        return v;
    }
}