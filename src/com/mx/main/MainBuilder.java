package com.mx.main;

import com.mx.builder.Usuario;
import com.mx.builder.UsuarioBuilder;

public class MainBuilder {

	public static void main(String[] args) {
		Usuario usuario = new UsuarioBuilder()
				.email("correo@gmail.com")
				.nombre("Juan", "Garcia")
				.telefono("5532123421")
				.direccion("Zapata #112").build();
		
		System.out.println("Valor el objeto Usuario: " + usuario);

	}

}
