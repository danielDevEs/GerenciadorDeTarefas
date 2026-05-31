package br.com.lip.gerenciador_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sixseven")
    public String hello() {
        return "farmou aura";
    }
}
