package br.com.codered.com.br.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.codered.com.br.dsdeliver.dto.ProductDTO;
import br.com.codered.com.br.dsdeliver.entities.Product;
import br.com.codered.com.br.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAllByOrderByNameAsc();
		
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
