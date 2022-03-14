package bu.banck.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.banck.model.Cliente;


public interface ClienteDAO extends JpaRepository<Cliente,Long> {

}
