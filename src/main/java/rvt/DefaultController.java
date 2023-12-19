package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    // @GetMapping(value = "/hello")
    // String myName = "lauris";
    // model.addAttribute("name", myName);
    


    @GetMapping(value = "/dziesmina")
    String dziesmina(){
        return "dziesmina";
    }
    @GetMapping(value = "/about")
    ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("about");
        
        return modelAndView;
    }
    @GetMapping(value = "/inputins")
    String inputins(){
        return "inputins";
}
}