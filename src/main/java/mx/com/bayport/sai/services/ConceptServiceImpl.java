package mx.com.bayport.sai.services;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import mx.com.bayport.sai.dao.ConceptDao;
import mx.com.bayport.sai.document.Concepts;

@Service
public class ConceptServiceImpl implements IConceptServices {
    

	
	@Autowired
	private ConceptDao conceptDao; 
	
	
	
	
	@Override
	@Transactional(readOnly =true)
	public List<Concepts> findAll() {
		// TODO Auto-generated method stub
		return conceptDao.findAll();
	}
	
	@Override
	@Transactional
	public Concepts save(Concepts concept) {
		// TODO Auto-generated method stub
		return conceptDao.save(concept);
	}
	@Override
	public Optional<Concepts>  findById(String id) {
		
        return conceptDao.findById(id);
     }
	 
	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		conceptDao.deleteById(id);
	}

	


}
