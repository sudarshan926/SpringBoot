package com.fusion;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.springframework.util.Assert;

import com.fusion.service.StudentService;

public class StudentControllerTest2 {
	
	StudentController studentController;
	
	@Mock
	StudentService studentService;
	
	@Before
	public void setup() /// to activate all mockito annotation
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void createStudentPositiveTest()
	{
		Student s1 = new Student();
		s1.setId(1);
		s1.setFname("zz");
		s1.setLname("zz_l");
		s1.setEmail("zz@gmail.com");
		
		when(studentService.createStudent(any(Student.class))).thenReturn(studentResponseMock());
		
		Student response=studentController.createStudent(s1);
		System.out.println("---response --->"+response);
		
		//verify the result
		Assert.assertNotNull(response);
		//expected (30) and actual (return value)
		Assert.assertEquals(100, response.getId());
		Assert.assertEquals("pp", response.getFname());
		
	}
	
	@Test
	public void createStudentNegativeTest()
	{
		Student s1 = new Student();
		s1.setId(1);
		s1.setFname("zz");
		s1.setLname("zz_l");
		s1.setEmail("zz@gmail.com");
		
		
		
		Student response=studentController.createStudent(s1);
		System.out.println("---response --->"+response);
		
		//verify the result
		Assert.assertNull(response);
		
		
	}
	
	@Test
	public void getAllStudentTest()
	{
		when(studentService.getAllStudent()).thenReturn(createStudentMock());
		Iterable<Student> response=studentController.getAllStudent();
		System.out.println("---response --->"+response);
		Assert.assertNotNull(response);
	
	//	Assert.assertEquals("ms@gmail.com", response.iterator().next().getEmail());
		Assert.assertEquals("ms@gmail1.com", response.iterator().next().getEmail());
	}

	private Iterable<Student> createStudentMock() {
		List< Student> stdlist = new ArrayList<>();
		
		Student s1= new Student();
		s1.setId(101);
		s1.setFname("MS");
		s1.setEmail("ms@gmail.com");
		
		Student s2= new Student();
		s2.setId(102);
		s2.setFname("VIRAT");
		s2.setEmail("virat@gmail.com");
		
		stdlist.add(s1);
		stdlist.add(s2);
		
		return stdlist;
	}

	private Student studentResponseMock() {
		Student student = new Student();
		student.setId(100);
		student.setFname("pp");
		student.setLname("pp_l");
		student.setEmail("pp@gmail.com");
		
		return student;
	}

}

//junit --> mockito framework 

}
