/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Modelo.Usuario;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Metal
 */
public class UsuarioController {
    
    @RequestMapping(value="formusuario.htm",method=RequestMethod.GET)
    public ModelAndView formusuario()
    {
        return new ModelAndView("formusuario","command",new Usuario());
    }
    
    @RequestMapping(value="formusuario.htm",method=RequestMethod.POST)
    public String form(Usuario usuario, ModelMap model)
    {
        model.addAttribute("nombre",usuario.getNombre());
        model.addAttribute("correo",usuario.getCorreo());
        model.addAttribute("contra",usuario.getContra());
        model.addAttribute("contra",usuario.getContra());
        model.addAttribute("fecha",usuario.getFecha());
        // enviar el user a guardar
        return"resultado";
    }
}
