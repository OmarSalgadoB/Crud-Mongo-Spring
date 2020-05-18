package mx.com.bayport.sai.dao;
//import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import mx.com.bayport.sai.document.Concepts;
@Repository
public interface ConceptDao extends MongoRepository<Concepts , String> {
	

}
