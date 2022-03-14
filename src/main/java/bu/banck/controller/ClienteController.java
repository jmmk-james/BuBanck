package bu.banck.controller;

import java.util.List;

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


import bu.banck.dao.ClienteDAO;
import bu.banck.model.Cliente;

@RestController
@RequestMapping("cliente")
@CrossOrigin("http://localhost:8081/")
public class ClienteController {
	@Autowired
	private ClienteDAO clienteDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Cliente cliente) {
		clienteDAO.save(cliente);
	}
	@GetMapping("/listar")
	public List<Cliente> listar(){
		
		return clienteDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		
		clienteDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Cliente cliente) {
		clienteDAO.save(cliente);
	}

}
