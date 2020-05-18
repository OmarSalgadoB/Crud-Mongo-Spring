package mx.com.bayport.sai.services;

import java.util.List;
import java.util.Optional;


import mx.com.bayport.sai.document.Concepts;

public interface IConceptServices  {

	public List<Concepts>  findAll();
	
	public Concepts save(Concepts concept);
	
	public  Optional<Concepts> findById(String id);

	public void delete(String id);
	
	
}
