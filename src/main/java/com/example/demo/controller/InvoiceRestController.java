/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sotobotero
 */

@RestController
@RequestMapping("/billing")
public class InvoiceRestController {

    @GetMapping("/{id}")
    public String get(@PathVariable String id) {
      return "Hola rama event cambio maven "+id;
    }


}
