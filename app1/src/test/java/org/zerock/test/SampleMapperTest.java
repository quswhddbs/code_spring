package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.persistence.SampleMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}		
		//locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"}
		)
public class SampleMapperTest {

	@Inject
	private SampleMapper mapper;
	
	@Test
	public void testTime(){
		
		System.out.println(mapper.getClass().getName());
		System.out.println(mapper.getTime());
		
	}
	
	@Test
	public void testMail(){
		
		String email = mapper.getEmail("user01", "user01");
		
		System.out.println(email);
		
	}
			
	@Test
	public void testSearch(){
		
		String userName = mapper.search("uid", "user01");
		
		System.out.println(userName);
		
	}	
	
	@Test
	public void testUserName(){
		
		String email = mapper.getUserName("user01", "user01");
		
		System.out.println(email);
		
	}	
	
}
