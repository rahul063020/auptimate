package auptimate.rd.investor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "AUPINVTR")
public class InvestorTransection {

	public InvestorTransection(){}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TRID")
    public int ID;
	@Column(name = "TRSYNID")
    public long SyndicateID ;
	
	@Column(name ="TRINVID")
    public long InvestorID;
	
	@Column(name ="TRAMT")
    public double Amount;
    
   
    @Nullable
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name="TRDATE")
    public Date TransectionDate;
    
    @Transient
    public int total_synd; 
    
}
