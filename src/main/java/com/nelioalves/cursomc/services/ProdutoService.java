package com.nelioalves.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> list() {
		return produtoRepository.findAll();
	}

	public Produto find(Integer id) {
		return produtoRepository.findOne(id);
	}

	public Produto insert(Produto obj) {
		return produtoRepository.save(obj);
	}

	public Produto update(Produto obj) {
		return produtoRepository.save(obj);
	}
	
	public void delete(Integer id) {
		produtoRepository.delete(id);
	}
}
