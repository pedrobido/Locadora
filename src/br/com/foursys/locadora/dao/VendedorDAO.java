package br.com.foursys.locadora.dao;

import java.sql.Connection;

public class VendedorDAO {

	private Connection bd;

	public VendedorDAO(Connection bd) {
		this.bd = bd;
	}

}
