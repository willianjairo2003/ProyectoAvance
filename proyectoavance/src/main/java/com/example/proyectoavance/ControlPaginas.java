package com.example.proyectoavance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
    @GetMapping("/paginaproductos")
    public String paginaproductos() {
    	return "paginaproductos";
    }
    
    @GetMapping("/paginaofertas")
    public String paginaofertas() {
    	return "paginaofertas";
    }
    
    @GetMapping("paginacontacto")
    public String paginacontacto() {
    	return "paginacontacto";
    }
    
    @GetMapping("carritocompras")
    public String carritocompras() {
    	return "carritocompras";
    }
    
    @GetMapping("/panelAdmin")
    public String panelAdmin(Model model) {
        model.addAttribute("mensaje", "Bienvenido al Panel de Administración");
        return "panelAdmin"; // busca panelAdmin.html en templates
    }
    


    @PostMapping("/procesarLogin")
    public String procesarLogin(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        if ("admin@gmail.com".equals(email) && "123".equals(password)) {
            model.addAttribute("usuario", email);
            return "redirect:/panelAdmin";
        } else {
            model.addAttribute("usuario", email);
            return "principal";
        }
    }



    // Procesar registro (sin guardar aún)
    @PostMapping("/procesarRegistro")
    public String procesarRegistro() {
        return "principal"; 
    }
}