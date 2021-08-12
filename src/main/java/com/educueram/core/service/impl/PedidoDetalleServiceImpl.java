package com.educueram.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.educueram.core.commons.GenericServiceImpl;
import com.educueram.core.dao.api.PedidoDetalleDaoAPI;
import com.educueram.core.model.PedidoDetalle;
import com.educueram.core.service.api.PedidoDetalleServiceAPI;

@Service
public class PedidoDetalleServiceImpl extends GenericServiceImpl<PedidoDetalle, Long> implements PedidoDetalleServiceAPI {
	
	@Autowired
	private PedidoDetalleDaoAPI pedidoDetalleDaoApi;

	@Override
	public CrudRepository<PedidoDetalle, Long> getDao() {
		return pedidoDetalleDaoApi;
	}
	
	

}
