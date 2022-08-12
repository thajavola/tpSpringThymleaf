package mg.cdan4.tp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mg.cdan4.tp.service.EntreeService;
import mg.cdan4.tp.entity.Entree;
import java.util.List;
@Controller
@RequestMapping("/enter")
public class EntreeController {
    @Autowired
    EntreeService entreeService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
      List<Entree> listEntrees = entreeService.listAll();
      model.addAttribute("listEntrees", listEntrees);
    return "enter";
    }

    @RequestMapping("/newE")
    public String nouveauentree(Model model){
      Entree entree = new Entree();
      model.addAttribute("entree", entree);
    return "new_entree";
    }
    @PostMapping(value= "/save_E")
    public String saveentree(@ModelAttribute("entree") Entree entree){
      entreeService.save(entree);
      return "redirect:/enter/";
    }

}
