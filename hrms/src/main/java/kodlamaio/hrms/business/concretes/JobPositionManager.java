package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service // Bu class projede servis görevi görecek demektir.
public class JobPositionManager implements JobPositionService{

	@Autowired
	private JobPositionDao positionDao;
	
	public JobPositionManager(JobPositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return this.positionDao.findAll();
	}

	@Override
	public void add(JobPosition position) {
		
		
	}

	@Override
	public void delete(JobPosition position) {
		
		
	}

	@Override
	public void update(JobPosition position) {
		
		
	}


}
