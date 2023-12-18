package com.learntech.k8slearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerController
 *
 * @author Uthiraraj Saminathan
 */
@RestController
public class ServerController {

    @GetMapping("/servercheck")
    public String getNodeData(){
       return "Reached Server Controller";
    }
}
