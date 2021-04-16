package educationCulture1;

public class EducationSystem {

	public EducationSystem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduation gd = new Graduation();
		  gd. streams();
		  gd. ageCriteria();
		  gd. hscPercentage();
		
		Engineering eg = new Engineering();
		eg. streams();
	    eg. typeOfEngineering();
		
		
	ComputerScienceEngineering cse = new ComputerScienceEngineering();
	    cse. hscPercentage();
		cse. subjects();

	}

}
