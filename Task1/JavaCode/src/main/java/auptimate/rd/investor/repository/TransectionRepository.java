package auptimate.rd.investor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import auptimate.rd.investor.model.InvestorTransection;

public interface TransectionRepository extends JpaRepository<InvestorTransection, Integer>{
	
//	@Query(value="Select top 5 1 trinvid, t2.TRINVID TRID,t2.total_synd trsynid,t3.total_amount tramt,null trdate from "+
//			"(Select t1.TRINVID,COUNT(t1.TRSYNID) total_synd from "+
//					"(Select Distinct TRINVID,TRSYNID from AUPINVTR) t1 "+
//					" group by t1.TRINVID) t2 "+
//					"LEFT JOIN (select TRINVID,SUM(TRAMT) total_amount from AUPINVTR group by TRINVID) t3 "+
//					" on t2.TRINVID=t3.TRINVID  "+
//					" ORDER BY t2.total_synd desc",nativeQuery = true)
	 @Query(value = "EXEC SP_TOPFIVE", nativeQuery = true)
	List<InvestorTransection> getTopFiveTransection();

}
