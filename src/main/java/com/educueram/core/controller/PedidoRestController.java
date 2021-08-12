package com.educueram.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.educueram.core.model.PedidoDetalle;
import com.educueram.core.service.api.PedidoDetalleServiceAPI;

@RestController
public class PedidoRestController {
	
	@Autowired
	private PedidoDetalleServiceAPI pedidoDetalleServiceApi;

	@RequestMapping(path = "/GetPedidos", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<PedidoDetalle> pedidos() {
		return pedidoDetalleServiceApi.getAll();
	}
	
	
}
