package creditCalculator;

public class CreditCalculator {
	public static int getCredit(String[] courses, Course[] masterCourses) {
		int totalCredits = 0;
		for (int i = 0; i < courses.length; i++) {
			for (int j = 0; j < masterCourses.length; j++) {
				if (courses[i].equals(masterCourses[j].getCourseNumber())) {
					totalCredits += masterCourses[j].getCredits();
				}
			}
		}
		return totalCredits;
	}

	/*public static double getGPA(String[] courses, Course[] masterCourses){

	}*/
}
