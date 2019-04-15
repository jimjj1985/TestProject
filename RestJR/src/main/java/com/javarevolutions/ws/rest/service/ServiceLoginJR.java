package com.javarevolutions.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javarevolutions.ws.rest.vo.VOUsuario;

@Path("/TestLogin")
public class ServiceLoginJR {

	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo) {
		vo.setUserValido(false);
		if (vo.getUsuario().equals("REX") && vo.getPassword().equals("LEYENDA")) {
			vo.setUserValido(true);
		}
		vo.setPassword("**************************");
		return vo;
	}
}
