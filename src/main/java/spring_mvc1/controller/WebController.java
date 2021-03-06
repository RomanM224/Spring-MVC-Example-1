package spring_mvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage() {
        return "final.jsp";
    }
    
    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect2() {
       return "redirect:/pages/final.html";
    }
}
