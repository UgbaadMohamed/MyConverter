package com.example.myconverter.Controller;
import com.example.myconverter.Model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
    public class HomeController {
        @GetMapping("/")
        public String index() {
            return "home/index";
        }

        @PostMapping("/index")
        public String C2F(WebRequest wR, @ModelAttribute Calculator temp, Model model) {
            String btn = wR.getParameter("type");
            if (btn.equals("C2F")) {
                temp.setFahrenheit(temp.getTemperature() * 9 / 5 + 32);
                model.addAttribute("res", temp.getFahrenheit());

            } else if (btn.equals("F2C")){
                temp.setCelsius(temp.getTemperature()- 32 * 5/9);
                model.addAttribute("res", temp.getCelsius());
            }
            return "home/index";
        }

    }



