package com.example.proyectoavance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlPaginas {
	
	// Página principal raíz
	@GetMapping("/")
	public String principal() {
	    return "principal"; 
	}
    // Página de login
    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    // Página de registro
    @GetMapping("/registro")
    public String registro() {
        return "registro"; 
    }

    // Procesar login (sin validar)
    @PostMapping("/procesarLogin")
    public String procesarLogin() {
        return "principal"; 
    }

    // Procesar registro (sin guardar aún)
    @PostMapping("/procesarRegistro")
    public String procesarRegistro() {
        return "principal"; 
    }
}