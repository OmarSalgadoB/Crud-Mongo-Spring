package mx.com.bayport.sai;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import mx.com.bayport.sai.dao.ConceptDao;
import mx.com.bayport.sai.document.Concepts;

@SpringBootApplication
public class BackEndBayportTestApplication implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(BackEndBayportTestApplication.class);
	
    @Autowired
	private ConceptDao conceptDao;
	
	public static void main(String[] args) {
		SpringApplication.run(BackEndBayportTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		conceptDao.deleteAll();
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 2);
		System.out.println("+2 años: " + formatearCalendar(c));
		

	//	log.info("Se han insertado datos a Mongo");  
	} 
	public static String formatearCalendar(Calendar c) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
		return df.format(c.getTime());
} 

}
