/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.foundorators.bonrecreme.sameple_rounter;

/**
 *
 * @author codespace
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rounter {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}