package ambiental.ambiental.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ambiental.ambiental.Service.IImagenService;

@Controller
@RequestMapping("/imagen")
public class ImagenController {
    @Autowired
    private IImagenService imagenI;

    @GetMapping("/listar")
    public String listar(Model m){
        m.addAttribute("imagenes", imagenI.findAll());
        
        return "views/imagen/imagen";
    }
}
