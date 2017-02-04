package com.app;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.classes.Address;
import com.classes.Course;
import com.classes.FacultyMember;
import com.classes.Person;
import com.classes.Student;

public class Driver {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<FacultyMember> members = new ArrayList<>();
	JPanel p = new JPanel();

	public static void main(String args[]) {
		initializeCourses();
		addDummyObjects();
		String strInputfirst;

		do {
			strInputfirst = JOptionPane.showInputDialog(null,
					"Hello, Please enter the item number to process further. \n" + "1. Show all. \n"
							+ "2. Add student \n" + "3. Add faculty \n" + "4. Delete \n" + "5. Add Cources \n"
							+ "6. Delete Courses \n" + "7. Exit \n",
					"1");

			switch (strInputfirst) {
			case "1":
				JOptionPane.showInputDialog(students.toString() + members.toString());
				break;

			case "2":
				Student s1 = new Student();
				students.add(s1);
				break;

			case "3":
				FacultyMember f1 = new FacultyMember();
				members.add(f1);
				break;

			case "4":
				Person p = new Person("");

				String type = JOptionPane
						.showInputDialog("Enter the role of person : \n" + "1. Student \n" + "2. Faculty \n");

				if (type.equals("1")) {

					String name = JOptionPane.showInputDialog("Enter the name of person : " + students.toString());

					for (Person p1 : students) {
						if (p1.getName().equals(name))
							p = p1;
					}
					students.remove(p);
				} else {
					String name = JOptionPane.showInputDialog("Enter the name of person : " + members.toString());

					for (Person p1 : members) {
						if (p1.getName().equals(name))
							p = p1;
					}
					members.remove(p);
				}

				break;

			case "5":
				String typ = JOptionPane
						.showInputDialog("Enter the role of person : \n" + "1. Student \n" + "2. Faculty \n");
				if (typ.equals("1")) {
					String nam = JOptionPane.showInputDialog("Enter the name of person : " + students.toString());
					int sel = JOptionPane.showOptionDialog(null, "Select course", "course add.", 0,
							JOptionPane.QUESTION_MESSAGE, null, courses.toArray(), 0);
					for (Student stu : students) {
						if (stu.getName().equals(nam))
							stu.setCourses(courses.get(sel));
					}
				} else {
					String nam = JOptionPane.showInputDialog("Enter the name of person : " + members.toString());
					int sel = JOptionPane.showOptionDialog(null, "Select course", "course add.", 0,
							JOptionPane.QUESTION_MESSAGE, null, courses.toArray(), 0);
					for (FacultyMember mem : members) {
						if (mem.getName().equals(nam))
							mem.setCourses(courses.get(sel));
					}
				}
				break;

			case "6":
				String ty = JOptionPane
						.showInputDialog("Enter the role of person : \n" + "1. Student \n" + "2. Faculty \n");
				if (ty.equals("1")) {
					String nam = JOptionPane.showInputDialog("Enter the name of person : " + students.toString());
					for (Student stu : students) {
						if (stu.getName().equals(nam)) {
							int sel = JOptionPane.showOptionDialog(null, "Select course", "course add.", 0,
									JOptionPane.QUESTION_MESSAGE, null, stu.getCourses().toArray(), 0);
							stu.getCourses().remove(sel);
						}
					}
				} else {
					String nam = JOptionPane.showInputDialog("Enter the name of person : " + members.toString());

					for (FacultyMember mem : members) {
						if (mem.getName().equals(nam)) {
							int sel = JOptionPane.showOptionDialog(null, "Select course", "course add.", 0,
									JOptionPane.QUESTION_MESSAGE, null, mem.getCourses().toArray(), 0);
							mem.getCourses().remove(sel);
						}
					}
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Something went terribly wrong. Lets start again.");
				break;
			}

		} while (!strInputfirst.equals("7"));
	}

	// Creating and adding Dummy people to the list to test the application.
	private static void addDummyObjects() {
		Address a1 = new Address("5151", "State University Drive", "Los Angeles", "CA", "USA");
		Address a2 = new Address("321", "W Grand Ave", "Alhambra", "CA", "USA");
		Address a3 = new Address("1107", "Venice Blvd", "Venice", "CA", "USA");
		Address a4 = new Address("3839", "Baldvin Ave", "El Monte", "CA", "USA");
		Address a5 = new Address("1801", "W Garvey Ave", "Alhambra", "CA", "USA");
		Address a6 = new Address("535", "S Curson Ave", "Los Angeles", "CA", "USA");

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
		students.add(s1);
		Student s2 = new Student("Student 2", a2, "3050123456", c2);
		students.add(s2);
		// Student s3 = new Student("Student 3", a3, "6483901003", c3);
		// people.add(s3);

		// Dummy Faculty
		FacultyMember f1 = new FacultyMember("Faculty 1", a4, "1234567890", c4);
		members.add(f1);
		FacultyMember f2 = new FacultyMember("Faculty 2", a5, "0987654321", c5);
		members.add(f2);
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

}
