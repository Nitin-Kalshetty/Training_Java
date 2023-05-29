package multipleObject4Times;

public abstract class Employee {

	static int managerCount;
	static int traineeCount;
	static int total;
	
	Employee(){
		total++;
		if(this instanceof Manager) {
			managerCount++;
		}else if(this instanceof Trainee) {
			traineeCount++;
		}
		if(total==4) {
			System.out.println("Total "+total+" employees are created in which "+managerCount+" are managers and "+traineeCount+" are trainees");
		}
	}
	
}
