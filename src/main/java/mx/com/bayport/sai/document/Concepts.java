
package mx.com.bayport.sai.document;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="concepts")
public class Concepts {
	@Id
	@NotNull
	private String id;
    
    private String agreement;
    
    private String paid;
    
    private String name;
    
    private Boolean status;
    
    private Date fCreation;
    
    
    private Date fExperation;
    
   /* @PrePersist
    public void prePersist() {
    	fCreation = new Date();
    } */
    
    public Concepts() {
   
    }
    
    public Concepts( String agreement ,String paid ,String name, boolean status ,  Date fCreation ,Date fExperation ) {
    	this.agreement = agreement;
    	this.paid =paid;
    	this.name = name;
    	this.status = status;
    	this.fCreation = fCreation;
    	this.fExperation = fExperation;
    	
    }
	

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgreement() {
		return agreement;
	}


	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}


	public String getPaid() {
		return paid;
	}


	public void setPaid(String paid) {
		this.paid = paid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Date getfCreation() {
		return fCreation;
	}


	public void setfCreation(Date fCreation) {
		this.fCreation = fCreation;
	}


	public Date getfExperation() {
		return fExperation;
	}


	public void setfExperation(Date fExperation) {
		this.fExperation = fExperation;
	}
    
    
}
