package com.thecode.sistemadepedido.sistemadepedido.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thecode.sistemadepedido.sistemadepedido.model.Cliente;
import com.thecode.sistemadepedido.sistemadepedido.repository.ClienteRepository;

@Controller
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public String index(){
        return "clientes/index";
    }

    @GetMapping("/clientes/new")
    public ModelAndView nNew(Cliente cliente){
        ModelAndView mv = new ModelAndView("clientes/new");
        mv.addObject("clientes", cliente);
        return mv;
    }

    @PostMapping("/clientes")
    public ModelAndView create(@Valid Cliente cliente, BindingResult result ){
        if(result.hasErrors()){
            System.out.println("Contem erros");

            ModelAndView mv = new ModelAndView("clientes/new");
            mv.addObject("clientes", cliente);
            return mv;
        }else{
        cliente.toCliente();
        clienteRepository.save(cliente);
            
        return new ModelAndView("redirect:/clientes/" + cliente.getId());
    }
    }
}
