package com.nelioalves.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoServico;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Produto> list() {
		return produtoServico.list();
	}

	@RequestMapping(method=RequestMethod.POST)
	public Produto insert(@RequestBody Produto obj) {
		return produtoServico.insert(obj);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Produto find(@PathVariable Integer id) {
		return produtoServico.find(id);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {
		produtoServico.delete(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Produto update(@RequestBody Produto obj, @PathVariable Integer id) {
		obj.setId(id);
		return produtoServico.update(obj);
	}
}
