package adil.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListExampleWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Mohammad", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("123334344"), new MobileNumber("12322")));

		Student student2 = new Student("Adil", 20, new Address("1234"), Arrays.asList(new MobileNumber("232323232"),
				new MobileNumber("3232323232"), new MobileNumber("323232221")));

		Student student3 = new Student("Yusuf", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		/*****************************************************
		 * Get student with exact match name "Mohammad"
		 *****************************************************/
		Optional<Student> stud = students.stream().filter(student -> student.getName().equals("Mohammad")).findFirst();
		System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
		System.out.println("--------------------");

		Optional<Student> stud1 = students.stream().filter(student -> student.getName().equals("Mohammad")).findAny();
		System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
		System.out.println("--------------------");

		/*****************************************************
		 * Get student with exact match name "Mohammad"
		 *****************************************************/

		Optional<Student> stud3 = students.stream().filter(student -> student.getAddress().getZipcode().equals("1234"))
				.findAny();
		System.out.println(stud3.isPresent() ? stud3.get().getName() : "No student found");
		System.out.println("--------------------");

		List<Student> studentList = students.stream()
				.filter(s1 -> s1.getMobileNumbers().stream().anyMatch(x -> x.getNumber().equals("4444")))
				.collect(Collectors.toList());
		String mobileUpdate = studentList.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(mobileUpdate);
		System.out.println("--------------------");
		List<String> studentsName = students.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentsName.stream().collect(Collectors.joining(",")));
		System.out.println(studentsName.stream().collect(Collectors.joining(",", "[", "]")));
		System.out.println("--------------------");
		
		/*****************************************************
        Change the case of List<String>
       *****************************************************/
       List<String> nameList =
           Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");

       nameList.stream()
           .map(String::toUpperCase)
           .forEach(System.out::println);
       System.out.println("--------------------");
	}

}
