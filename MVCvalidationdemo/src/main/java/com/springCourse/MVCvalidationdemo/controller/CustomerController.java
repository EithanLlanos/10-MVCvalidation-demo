package com.springCourse.MVCvalidationdemo.controller;

import com.springCourse.MVCvalidationdemo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/customerForm")
    public String getCustomerForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/customerView")
    public String getCustomerView(@ModelAttribute("customer") Customer theCustomer) {
        return "customer-view";
    }
}
