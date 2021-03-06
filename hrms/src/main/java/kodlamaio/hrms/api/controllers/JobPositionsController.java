package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController //Sen controllersın demektir.
@RequestMapping ("/api/products") //Sayfamıza böyle bir istek gelir ise(dış dünyadan,/api/products formatında) aşağıda bulunan kodu çalıştır demektir.
public class JobPositionsController {
	
	private JobPositionService positionService;
	
	@Autowired
	public JobPositionsController(JobPositionService positionService) {
		super();
		this.positionService = positionService;
	}

	@GetMapping("/getall")// Get Mapping Veri istiyorum demektir. 2.17.11 Ayrıca sayfamıza böyle bir istek gelir ise(dış dünyadan, /getall formatında.) aşağıda bulunan kodu çalıştır demektir.
	public List<JobPosition> getAll() {
		return this.positionService.getAll();
	}

}
