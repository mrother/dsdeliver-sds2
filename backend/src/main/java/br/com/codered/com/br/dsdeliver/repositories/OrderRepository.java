package br.com.codered.com.br.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codered.com.br.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
