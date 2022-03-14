package bu.banck.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bu.banck.dao.CuentaDAO;
import bu.banck.model.Cuenta;

@RestController
@RequestMapping("cuenta")
@CrossOrigin("http://localhost:8081/")
public class CuentaController {
	@Autowired
	private CuentaDAO cuentaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Cuenta cuenta) {
		cuentaDAO.save(cuenta);
	}
	@GetMapping("/listar")
	public List<Cuenta> listar(){
		
		return cuentaDAO.findAll();
	}
	
	@GetMapping("/listar/{id_cliente}")
	public List<Cuenta> listarCuenta(@PathVariable("id_cliente") long id_cliente){
		List<Cuenta>f=new  ArrayList<Cuenta>();
		List<Cuenta> cuenta=cuentaDAO.findAll();
		for (int i=0 ;i<cuenta.size();i++) {
			if(cuenta.get(i).getId_cliente()==id_cliente)
				f.add(cuenta.get(i));
		}
		return f;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		
		cuentaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Cuenta cuenta) {
		cuentaDAO.save(cuenta);
	}

}
