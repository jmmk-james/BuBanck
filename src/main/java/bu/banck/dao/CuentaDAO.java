package bu.banck.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.banck.model.Cuenta;

public interface CuentaDAO extends JpaRepository<Cuenta,Long>{
	

}
