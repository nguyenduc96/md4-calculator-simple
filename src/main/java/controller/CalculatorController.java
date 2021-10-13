package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping
    public String view() {
        return "index";
    }

    @GetMapping("calculator")
    public ModelAndView showResult(@RequestParam char opera,
                                   @RequestParam double op1,
                                   @RequestParam double op2) {
        ModelAndView modelAndView = new ModelAndView("index");
        double result = 0;

        switch (opera) {

            case '+': {
                result = op1 + op2;
                break;
            }
            case '-': {
                result = op1 - op2;
                break;
            }
            case '*': {
                result = op1 * op2;
                break;
            }
            case '/': {
                if (op2 != 0) {
                    result = op1 / op2;
                }
                else {
                    return modelAndView.addObject("message", "Can not division by zero");
                }
                break;
            }
        }
        modelAndView.addObject("result", result);
        return  modelAndView;
    }
}
