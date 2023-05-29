package may18.training;

public class MasaiSchool implements ClayFinBatch1{
	
	int totalTrainingRemainingDays = this.NO_OF_DAYS;
	int totalTrainingCompletedDays = 0;

	@Override
	public void trainingInJava() {
		if(totalTrainingRemainingDays>15 && totalTrainingCompletedDays<15) {
			totalTrainingRemainingDays--;
			totalTrainingCompletedDays++;
			System.out.println("Completed training days in JAVA is "+totalTrainingCompletedDays+" Days");
			System.out.println("Remaining training days in JAVA is "+(totalTrainingRemainingDays-16)+" Days");
		}
		else {
			System.out.println("Trainings for Java Completed....Go for Jsp");
		}
		
	}

	@Override
	public void trainingInJsp() {
		if(totalTrainingRemainingDays<=16 && totalTrainingCompletedDays<=30) {
			totalTrainingRemainingDays--;
			totalTrainingCompletedDays++;
			System.out.println("Completed training in JSP for "+(totalTrainingCompletedDays-16)+" Days");
			System.out.println("Remaining training in JSP for "+totalTrainingRemainingDays+" Days");
		}else if(totalTrainingRemainingDays==0) {
			System.out.println("Now completed with learning try assessment....");
		}
		else {
			System.out.println("Trainings for Java is not completed so first finish JAVA..."+totalTrainingRemainingDays);
		}
		
	}
	
	public void assessment() {
		if(totalTrainingCompletedDays>31) {
			System.out.println("You already completed....");
			return;
		}
		totalTrainingCompletedDays++;
		totalTrainingRemainingDays--;
		System.out.println("Completed with training....");
		
	}

	
}
