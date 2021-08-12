package com.educueram.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoDetalle {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column
		private Long id_pedido;
		
		@Column
		private String sku;
		
		@Column
		private Integer cantidad;
		
		@Column
		private Double price;
		
		@Column
		private String producto;
		
		//TODO: RELACION LLAVE FORANEA

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getId_pedido() {
			return id_pedido;
		}

		public void setId_pedido(Long id_pedido) {
			this.id_pedido = id_pedido;
		}

		public String getSku() {
			return sku;
		}

		public void setSku(String sku) {
			this.sku = sku;
		}

		public Integer getCantidad() {
			return cantidad;
		}

		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getProducto() {
			return producto;
		}

		public void setProducto(String producto) {
			this.producto = producto;
		}
		

}
