package com.desafio.controllers;

import com.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.desafio.model.Usuario;

import java.util.Objects;

@Controller
public class LoginController {

	@Autowired
	UsuarioRepository repository;

    @GetMapping(value = "/login")
    public ModelAndView dadosAluno(Long idAluno) {
        ModelAndView mv = new ModelAndView("/login/login");
        return mv;
    }

    @PostMapping(value = "/login")
    public ModelAndView login(String email, String senha) {

        Usuario usuario = repository.findByEmail(email);

        if (Objects.isNull(usuario)) {
            return new ModelAndView("/login/login");
        }

        if (usuario.getSenha().equals(senha)) {
            return new ModelAndView("/usuario/portalUsuario");
       }
       return new ModelAndView("/login/login");
    }
}
