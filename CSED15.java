
/**
 * CSEDian student life.
 * 
 * Date: 28-05-2015
 */
public class CSED15 {
	private final static int GRADUATED_YEAR = 5;

	public static void main(String[] args) throws JustGraduatedException {
		int yearCounter = 0;
		
		while(true) {
			solveSheets();
			solveAssignemnts();// TODO Postpone assignment.

			exams();

			yearCounter++;
			if(yearCounter == GRADUATED_YEAR)
				throw new JustGraduatedException("Congratulations!");
		}
	}
}
