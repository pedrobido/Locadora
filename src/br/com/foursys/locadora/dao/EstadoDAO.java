package br.com.foursys.locadora.dao;

import java.sql.Connection;

public class EstadoDAO {

	private Connection bd;

	public EstadoDAO(Connection bd) {
		this.bd = bd;
	}

}