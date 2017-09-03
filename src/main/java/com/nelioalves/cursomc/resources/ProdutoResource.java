package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Produto;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Produto> listar() {
		Produto p1 = new Produto(1, "Mouse", 80.00);
		Produto p2 = new Produto(2, "Teclado", 120.00);
		
		List<Produto> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		
		return lista;
	}
}
