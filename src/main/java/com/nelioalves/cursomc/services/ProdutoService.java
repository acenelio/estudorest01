package com.nelioalves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.ProdutoRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> list() {
		return produtoRepository.findAll();
	}

	public Produto find(Integer id) {
		Produto obj = produtoRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException(Produto.class, id);
		}
		return obj;
	}

	public Produto insert(Produto obj) {
		obj.setId(null);
		return produtoRepository.save(obj);
	}

	public Produto update(Produto obj) {
		find(obj.getId());
		return produtoRepository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		produtoRepository.delete(id);
	}
}
