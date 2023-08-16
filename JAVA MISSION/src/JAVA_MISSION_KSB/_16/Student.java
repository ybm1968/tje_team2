package JAVA_MISSION_KSB._16;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	int no;
	String name;
	int score;
	String className;
	
	public Student() {
	
	}

	public Student(int no, String name, int score, String className) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
		this.className = className;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return no+ "\t" + name +"\t"+ score +"\t"+ className+"\n" ;
	}

	@Override
	public int compare(Student o1, Student o2) {
		int score1 = o1.getScore();
		int score2 = o2.getScore();
		int no1 = o1.getNo();
		int no2 = o2.getNo();
		
		int result1 = score2 - score1;
		int result2 = no1 - no2;
		
		return result1 == 0 ? result2 : result1;
	}
	
	
}
