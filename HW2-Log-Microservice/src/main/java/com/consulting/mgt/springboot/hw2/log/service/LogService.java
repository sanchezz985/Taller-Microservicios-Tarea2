package com.consulting.mgt.springboot.hw2.log.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LogService {

	public void sendEmail() {

		log.info("-------------------------------- CORREO DE BIENVENIDA ------------------------------");
		log.info("-                    Gracias por registrarte en Banco Azteca                       -");		
		log.info("------------------------------------------------------------------------------------");
		
	}
}
