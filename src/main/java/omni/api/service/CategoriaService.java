package omni.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import omni.api.model.Categoria;
import omni.api.repository.CategoriaRepository;
import org.springframework.beans.BeanUtils;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria atualizar(Long codigo, Categoria categoria) {
		Categoria salva = categoriaRepository.findById(codigo).orElse(null);
		BeanUtils.copyProperties(categoria, salva, "codigo");
		return categoriaRepository.save(salva);	 
	}

}
