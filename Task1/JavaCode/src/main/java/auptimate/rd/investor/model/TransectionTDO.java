package auptimate.rd.investor.model;

import java.util.ArrayList;
import java.util.List;

public class TransectionTDO {
	
	
	
	public int InvestorID;
	
	public long TotalSydicate;
	public double TotalAmount;
	
	public List<TransectionTDO> TransectionToDTO(List<InvestorTransection> invTransection) 
	{
		List<TransectionTDO> lstTrnDTO=new ArrayList<>();
		for (InvestorTransection investorTransection : invTransection) {
			TransectionTDO trMdl=new TransectionTDO();
			trMdl.InvestorID=investorTransection.ID;
			trMdl.TotalSydicate=investorTransection.SyndicateID;
			trMdl.TotalAmount=investorTransection.Amount;
			lstTrnDTO.add(trMdl);
		}
		
		return lstTrnDTO;
	}

}
