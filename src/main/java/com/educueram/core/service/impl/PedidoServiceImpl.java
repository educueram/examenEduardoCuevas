package com.educueram.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.educueram.core.commons.GenericServiceImpl;
import com.educueram.core.dao.api.PedidoDaoAPI;
import com.educueram.core.model.Pedido;
import com.educueram.core.service.api.PedidoServiceAPI;

@Service
public class PedidoServiceImpl extends GenericServiceImpl<Pedido, Long> implements PedidoServiceAPI {
	
	@Autowired
	private PedidoDaoAPI pedidoDaoAPI;

	@Override
	public CrudRepository<Pedido, Long> getDao() {
		return pedidoDaoAPI;
	}

}
