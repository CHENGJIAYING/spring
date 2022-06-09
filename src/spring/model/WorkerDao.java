package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wDao")
public class WorkerDao {

//	@Autowired
//	@Qualifier("worker2")
	private Worker worker;

	public WorkerDao() {
	}
	
	@Autowired
	public WorkerDao(@Qualifier("worker1") Worker worker) {
		this.worker = worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public void printDetails() {
		System.out.println("ID:" + worker.getId());
		System.out.println("name:" + worker.getName());
		System.out.println("title:" + worker.getTitle());
	}
}
