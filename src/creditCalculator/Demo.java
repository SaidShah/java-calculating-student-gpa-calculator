package creditCalculator;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("cst111","intro to math",4);
		Course c2 = new Course("cst112","intro to Seminar",1);
		Course c3 = new Course("cst113","intro to College",3);
		Course c4 = new Course("cst114","intro to Science",4);
		Course c5 = new Course("cst115","intro to Computers",3);
		Course c6 = new Course("cst116","intro to IT",4);

		CourseBag courseBag = new CourseBag(10);
		courseBag.insertCourse(c1);
		courseBag.insertCourse(c2);
		courseBag.insertCourse(c3);
		courseBag.insertCourse(c4);
		courseBag.insertCourse(c5);
		courseBag.insertCourse(c6);
		String[] coursesTook = {"cst111", "cst112"};
		String[] coursesTaking = {"cst113","cst114","cst115"};
		String[] coursesToTake = {"cst116"};

		System.out.println("Credits Took " + CreditCalculator.getCredit(coursesTook,courseBag.getCourseArray()));
		System.out.println("Credits Taking " + CreditCalculator.getCredit(coursesTaking,courseBag.getCourseArray()));
		System.out.println("Credits To Take " + CreditCalculator.getCredit(coursesToTake,courseBag.getCourseArray()));
	}

}
