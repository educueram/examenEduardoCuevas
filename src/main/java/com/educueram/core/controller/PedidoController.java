package com.educueram.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educueram.core.model.Pedido;
import com.educueram.core.service.api.PedidoServiceAPI;

public class PedidoController {
	
	@Autowired
	private PedidoServiceAPI pedidoServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("listPedidos", pedidoServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("pedido", pedidoServiceApi.get(id));
		}else {
			model.addAttribute("pedido", new Pedido());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Pedido pedido, Model model) {
		pedidoServiceApi.save(pedido);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		pedidoServiceApi.delete(id);
		return "redirect:/";
	}

}
