package com.uce.ec;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.repository.modelo.CuentaBancaria;
import com.uce.ec.repository.modelo.Propietario;
import com.uce.ec.service.ICuentaBancariaService;
import com.uce.ec.service.IPropietarioService;

@SpringBootApplication
public class Efinal1Pa2P5RgApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService iBancariaService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5RgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Romina");
		propietario1.setApellido("Guevara");
		propietario1.setCedula("1750888404");
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("123456789");
		cuenta1.setSaldo(new BigDecimal(1000));
		cuenta1.setPropietario(propietario1);
		
		this.iBancariaService.guardar(cuenta1);
		
		Propietario propietario2 = new Propietario();
		propietario2.setNombre("Luis");
		propietario2.setApellido("Guevara");
		propietario2.setCedula("1712872157");
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("987654321");
		cuenta2.setSaldo(new BigDecimal(50));
		cuenta2.setPropietario(propietario2);
		
		this.iBancariaService.guardar(cuenta2);
		

		
		
	}
}
