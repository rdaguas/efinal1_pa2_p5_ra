package com.uce.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.ITransferenciaService;

@SpringBootApplication
public class Efinal1Pa2P5RaApplication implements CommandLineRunner{

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5RaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CuentaBancaria cb1 = new CuentaBancaria();
		cb1.setNumero("123");
		cb1.setSaldo(new BigDecimal(500));
		cb1.setTipo("Ahorros");
		
		CuentaBancaria cb2 = new CuentaBancaria();
		cb2.setNumero("12345");
		cb2.setSaldo(new BigDecimal(200));
		cb2.setTipo("Ahorros");
		
		Propietario p1 = new Propietario();
		p1.setNombre("Roberto");
		p1.setApellido("Aguas");
		p1.setCedula("1724");
		
		Propietario p2 = new Propietario();
		p2.setNombre("Daniel");
		p2.setApellido("Valencia");
		p2.setCedula("1710");
		
		List<Propietario> prop = new ArrayList<>();
		prop.add(p1);
		prop.add(p2);
		this.iCuentaBancariaService.guardar(cb1);
		this.iCuentaBancariaService.guardar(cb2);
	
		//this.iTransferenciaService.lista("", "");
		
		
	
	
	}

}
