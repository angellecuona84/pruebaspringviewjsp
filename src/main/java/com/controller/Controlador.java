package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Angel Luis on 13/05/2015.
 */
@Controller
public class Controlador {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }


}
