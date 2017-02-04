package com.app;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.classes.Address;
import com.classes.Course;
import com.classes.FacultyMember;
import com.classes.Student;

public class Driver {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<FacultyMember> faculty = new ArrayList<FacultyMember>();

	public static void main(String args[]) {
		initializeCourses();
		addDummyObjects();
		int intMain;

		do {
			intMain = JOptionPane.showOptionDialog(null,
					"Student List: \n" + student.toString() + "\nFaculty List : \n" + faculty.toString(), "Manage",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					new String[] { "Add", "Delete", "Add/Delete Courses", "Exit" }, null);

			switch (intMain) {

			// Add
			case 0:
				int intAdd = JOptionPane.showOptionDialog(null, "What do you want to add?", "Add",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
						new String[] { "Student", "Faculty", "Course" }, null);
				// Add Student.
				if (intAdd == 0) {
					addStudent();
				}
				// Add Faculty.
				else if (intAdd == 1) {
					// FacultyMember f1 = new FacultyMember();
					// faculty.add(f1);
					addFaculty();
				}
				// Add Course.
				else {
					addCourse();
				}
				break;

			// Delete
			case 1:
				int intDelete = JOptionPane.showOptionDialog(null, "What do you want to Delete?", "Delete",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
						new String[] { "Student", "Faculty" }, null);
				if (intDelete == 0) {
					// Delete Student is selected
					String[] stud = new String[student.size()];

					for (Student s : student) {
						stud[student.indexOf(s)] = s.getName();
					}

					int intDelStudent = JOptionPane.showOptionDialog(null,
							"Select the name of student you want to delete.", "Delete", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, stud, null);

					student.remove(intDelStudent);
				} else {
					// Delete Faculty is selected
					String[] facu = new String[faculty.size()];

					for (FacultyMember f : faculty) {
						facu[faculty.indexOf(f)] = f.getName();
					}

					int intDelFaculty = JOptionPane.showOptionDialog(null,
							"Select the name of student you want to delete.", "Delete", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, facu, null);

					faculty.remove(intDelFaculty);
				}
				break;

			// Add or Remove Courses from a person.
			case 2:
				int intCourses = JOptionPane.showOptionDialog(null, "Select what do you want to modify",
						"Change Courses", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
						new String[] { "Student", "Faculty" }, null);

				if (intCourses == 0) {
					modifyStudentCourse();
				} else {
					modifyFacultyCourse();
				}
				break;

			// Exit
			case 3:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Something went terribly wrong. Lets start again.");
				break;
			}

		} while (intMain != 3);
	}

	// Creating and adding Dummy people to the list to test the application.
	private static void addDummyObjects() {
		Address a1 = new Address("5151", "State University Drive", "Los Angeles", "CA", "USA");
		Address a2 = new Address("321", "W Grand Ave", "Alhambra", "CA", "USA");
		// Address a3 = new Address("1107", "Venice Blvd", "Venice", "CA",
		// "USA");
		Address a4 = new Address("3839", "Baldvin Ave", "El Monte", "CA", "USA");
		Address a5 = new Address("1801", "W Garvey Ave", "Alhambra", "CA", "USA");
		// Address a6 = new Address("535", "S Curson Ave", "Los Angeles", "CA",
		// "USA");

		ArrayList<Course> c1 = new ArrayList<>();
		c1.add(courses.get(0));
		c1.add(courses.get(1));
		ArrayList<Course> c2 = new ArrayList<>();
		c2.add(courses.get(2));
		c2.add(courses.get(1));
		ArrayList<Course> c3 = new ArrayList<>();
		c3.add(courses.get(2));
		c3.add(courses.get(3));
		ArrayList<Course> c4 = new ArrayList<>();
		c4.add(courses.get(3));
		c4.add(courses.get(5));
		ArrayList<Course> c5 = new ArrayList<>();
		c5.add(courses.get(4));
		c5.add(courses.get(1));
		ArrayList<Course> c6 = new ArrayList<>();
		c6.add(courses.get(5));
		c6.add(courses.get(0));

		// Dummy Student
		Student s1 = new Student("Student 1", a1, "3050678912", c1);
		student.add(s1);
		Student s2 = new Student("Student 2", a2, "3050123456", c2);
		student.add(s2);
		// Student s3 = new Student("Student 3", a3, "6483901003", c3);
		// people.add(s3);

		// Dummy Faculty
		FacultyMember f1 = new FacultyMember("Faculty 1", a4, "1234567890", c4);
		faculty.add(f1);
		FacultyMember f2 = new FacultyMember("Faculty 2", a5, "0987654321", c5);
		faculty.add(f2);
		// FacultyMember f3 = new FacultyMember("Faculty 3", a6, "5678901234",
		// c6);
		// people.add(f3);

		// System.out.println(s1.toString());
		// System.out.println("-------------");
		// System.out.println(s2.toString());
		// System.out.println("-------------");
		// System.out.println(s3.toString());
		// System.out.println("-------------");
		// System.out.println(f1.toString());
		// System.out.println("-------------");
		// System.out.println(f2.toString());
		// System.out.println("-------------");
		// System.out.println(f3.toString());
		// System.out.println("-------------");
		// System.out.println(people.toString());

	}

	// Default List of Courses
	private static void initializeCourses() {

		courses.add(new Course("EE-132", "Intro to Electrical Engineering"));
		courses.add(new Course("EE-347", "Computer Logic Design"));
		courses.add(new Course("EE-371", "Analog Electronics"));
		courses.add(new Course("EE-372", "Digital Electronics"));
		courses.add(new Course("EE-412", "Antennas"));
		courses.add(new Course("EE-413", "Systems Engineering "));

		// Test Statement to print all courses.
		// System.out.println(courses.toString());
	}

	// To modify a course from a Student array
	private static void modifyStudentCourse() {
		// Modify Courses of a Student is selected
		String[] stud = new String[student.size()];

		for (Student s : student) {
			stud[student.indexOf(s)] = s.getName();
		}

		int intDelCourse = JOptionPane.showOptionDialog(null,
				"Select the name of student you want to modify courses of.", "Modify Courses", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, stud, null);

		int intSelActions = JOptionPane.showOptionDialog(null,
				"Select the name of student you want to modify courses of.", "Modify Courses", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, new String[] { "Add Course", "Delete Course" }, null);

		// If the user wants to add the course
		if (intSelActions == 0) {
			ArrayList<Course> studCour = student.get(intDelCourse).getCourses();

			String[] cour = new String[courses.size() - studCour.size()];
			int index = 0;
			ArrayList<Course> courShort = new ArrayList<Course>();

			for (Course c : courses) {
				if (!studCour.contains(c)) {
					cour[index] = c.toString();
					courShort.add(c);
					index++;
				}
			}

			int intDelCourseSel = JOptionPane.showOptionDialog(null, "Select the course you want to delete.", "Delete",
					JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, cour, null);

			student.get(intDelCourse).getCourses().add(courShort.get(intDelCourseSel));
		}
		// If the user wants to delete the course
		else {
			ArrayList<Course> studCour = student.get(intDelCourse).getCourses();

			String[] cour = new String[studCour.size()];

			for (Course c : studCour) {
				cour[studCour.indexOf(c)] = c.toString();
			}

			int intDelCourseSel = JOptionPane.showOptionDialog(null, "Select the course you want to delete.", "Delete",
					JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, cour, null);

			student.get(intDelCourse).getCourses().remove(intDelCourseSel);
		}
	}

	// To delete a course from a Faculty array
	private static void modifyFacultyCourse() {
		// Delete Courses of a Faculty is selected
		String[] facu = new String[faculty.size()];

		for (FacultyMember f : faculty) {
			facu[faculty.indexOf(f)] = f.getName();
		}

		int intDelCourse = JOptionPane.showOptionDialog(null,
				"Select the name of faculty you want to delete course from.", "Delete", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, facu, null);

		int intSelActions = JOptionPane.showOptionDialog(null,
				"Select the name of student you want to modify courses of.", "Modify Courses", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, new String[] { "Add Course", "Delete Course" }, null);

		if (intSelActions == 0) {
			ArrayList<Course> facuCour = faculty.get(intDelCourse).getCourses();

			String[] cour = new String[courses.size() - facuCour.size()];
			int index = 0;
			ArrayList<Course> courShort = new ArrayList<Course>();

			for (Course c : courses) {
				if (!facuCour.contains(c)) {
					cour[index] = c.toString();
					courShort.add(c);
					index++;
				}
			}

			int intDelCourseSel = JOptionPane.showOptionDialog(null, "Select the course you want to delete.", "Delete",
					JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, cour, null);

			faculty.get(intDelCourse).getCourses().add(courShort.get(intDelCourseSel));
		}
		// If the user wants to delete the course
		else {
			ArrayList<Course> facuCour = faculty.get(intDelCourse).getCourses();

			String[] cour = new String[facuCour.size()];

			for (Course c : facuCour) {
				cour[facuCour.indexOf(c)] = c.toString();
			}

			int intDelCourseSel = JOptionPane.showOptionDialog(null, "Select the course you want to delete.", "Delete",
					JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, cour, null);

			faculty.get(intDelCourse).getCourses().remove(intDelCourseSel);
		}
	}

	// To add a Course
	private static void addCourse() {
		JTextField identifier = new JTextField(15);
		JTextField title = new JTextField(15);

		JPanel myPanel = new JPanel(new GridLayout(3, 2));
		myPanel.add(new JLabel("identifier:"));
		myPanel.add(identifier);
		myPanel.add(new JLabel("title:"));
		myPanel.add(title);

		do {
			int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter the identifier and title",
					JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.CANCEL_OPTION) {
				break;
			}
		} while (identifier.getText() == null && title.getText() == null);

		if (identifier.getText() != null && title.getText() != null) {
			Course c1 = new Course(identifier.getText(), title.getText());
			courses.add(c1);
		}
	}

	//Code to add student
	private static void addStudent(){
		JTextField name = new JTextField(15);
		JTextField no = new JTextField(15);
		JTextField streetName = new JTextField(15);
		JTextField city = new JTextField(15);
		JTextField state = new JTextField(15);
		JTextField country = new JTextField(15);
		JTextField cin = new JTextField(15);
		
		JPanel myPanel = new JPanel(new GridLayout(9, 2));
		myPanel.add(new JLabel("Name:"));
		myPanel.add(name);
		myPanel.add(new JLabel("Street Number:"));
		myPanel.add(no);
		myPanel.add(new JLabel("Street:"));
		myPanel.add(streetName);
		myPanel.add(new JLabel("City:"));
		myPanel.add(city);
		myPanel.add(new JLabel("State:"));
		myPanel.add(state);
		myPanel.add(new JLabel("Country:"));
		myPanel.add(country);
		myPanel.add(new JLabel("CIN:"));
		myPanel.add(cin);
		
		do {
			int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter the identifier and title",
					JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.CANCEL_OPTION) {
				break;
			}
		} while (name.getText().trim().equals(""));

		if (!name.getText().trim().equals("")) {
			Student s1 = new Student(name.getText(), new Address(no.getText(), streetName.getText(), city.getText(), state.getText(), country.getText()),cin.getText());
			student.add(s1);
		}
	}

	//Code to Add Faculty
	private static void addFaculty(){
		JTextField name = new JTextField(15);
		JTextField no = new JTextField(15);
		JTextField streetName = new JTextField(15);
		JTextField city = new JTextField(15);
		JTextField state = new JTextField(15);
		JTextField country = new JTextField(15);
		JTextField eid = new JTextField(15);
		
		JPanel myPanel = new JPanel(new GridLayout(9, 2));
		myPanel.add(new JLabel("Name:"));
		myPanel.add(name);
		myPanel.add(new JLabel("Street Number:"));
		myPanel.add(no);
		myPanel.add(new JLabel("Street:"));
		myPanel.add(streetName);
		myPanel.add(new JLabel("City:"));
		myPanel.add(city);
		myPanel.add(new JLabel("State:"));
		myPanel.add(state);
		myPanel.add(new JLabel("Country:"));
		myPanel.add(country);
		myPanel.add(new JLabel("Employee ID:"));
		myPanel.add(eid);
		
		do {
			int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter the identifier and title",
					JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.CANCEL_OPTION) {
				break;
			}
		} while (name.getText().trim().equals(""));

		if (!name.getText().trim().equals("")) {
			FacultyMember f1 = new FacultyMember(name.getText(), new Address(no.getText(), streetName.getText(), city.getText(), state.getText(), country.getText()),eid.getText());
			faculty.add(f1);
		}
	}

}
