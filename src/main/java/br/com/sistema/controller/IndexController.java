package br.com.sistema.controller;

//Seu principal objetivo é direcionar o fluxo da aplicação mapeando e direcionado as ações recebida (request)
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
