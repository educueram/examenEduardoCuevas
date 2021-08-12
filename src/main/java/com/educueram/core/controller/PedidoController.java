package com.educueram.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educueram.core.model.PedidoDetalle;
import com.educueram.core.service.api.PedidoDetalleServiceAPI;
import com.educueram.core.service.api.PedidoServiceAPI;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoServiceAPI pedidoServiceApi;
	
	@Autowired
	private PedidoDetalleServiceAPI pedidoDetalleServiceApi;
	
	@RequestMapping("/pedidoIndex")
	public String index(Model model) {
		model.addAttribute("listaPedidos", pedidoDetalleServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("pedidos", pedidoDetalleServiceApi.get(id));
		}else {
			model.addAttribute("pedidos", new PedidoDetalle());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(PedidoDetalle pedidoDetalle, Model model) {
		pedidoDetalleServiceApi.save(pedidoDetalle);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		pedidoDetalleServiceApi.delete(id);
		return "redirect:/";
	}

}
