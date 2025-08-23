package com.example.proyectoavance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlPaginas {

    // Página de login
    @GetMapping("/login")
    public String login() {
        return "login"; // busca login.html en /templates
    }

    // Página de registro
    @GetMapping("/registro")
    public String registro() {
        return "registro"; // busca registro.html en /templates
    }

    // Procesar login (sin validar)
    @PostMapping("/procesarLogin")
    public String procesarLogin() {
        return "principal"; // siempre redirige a principal.html
    }

    // Procesar registro (sin guardar aún)
    @PostMapping("/procesarRegistro")
    public String procesarRegistro() {
        return "principal"; // después del registro vuelve a login.html
    }
}