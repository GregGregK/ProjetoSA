package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



    @Controller
   public class PopController {

   @GetMapping("/projeto/pop")
    public String pop(){
       System.out.println("Ok");
       return "projeto/pop";
   }

   }
