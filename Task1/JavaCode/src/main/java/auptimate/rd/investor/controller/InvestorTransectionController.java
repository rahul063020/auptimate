package auptimate.rd.investor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import auptimate.rd.investor.model.TransectionTDO;
import auptimate.rd.investor.repository.TransectionRepository;
import io.swagger.annotations.Api;


@RestController
@RequestMapping("/api/investor/transection/")
@Api( tags = { "API: TOP Five Investor" })
public class InvestorTransectionController {

	@Autowired
	private TransectionRepository _trnRepo;
	
	@GetMapping("/topfiveinv")
	public ResponseEntity<Object> getTopFive() {
		
		TransectionTDO dto=new TransectionTDO();
		
		
		return new  ResponseEntity<>(dto.TransectionToDTO(_trnRepo.getTopFiveTransection()),HttpStatus.OK);
	}
}
