package creditCalculator;

import java.util.Arrays;

public class CourseBag {
	private Course[] courseArray;
	private int nElms;

	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElms = 0;
	}

	public Course[] getCourseArray() {
		return Arrays.copyOf(courseArray, nElms);// deep copy of array
	}

	public void insertCourse(Course course) {
		courseArray[nElms++] = course;
	}
}
