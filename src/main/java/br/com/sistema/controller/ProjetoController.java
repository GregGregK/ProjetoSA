package br.com.sistema.controller;

//Seu principal objetivo é direcionar o fluxo da aplicação mapeando e direcionado as ações recebida (request)
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoController {

    @GetMapping("/projeto/list")
    public String list(){
        System.out.println("Ok");
        return "projeto/list";
    }
}