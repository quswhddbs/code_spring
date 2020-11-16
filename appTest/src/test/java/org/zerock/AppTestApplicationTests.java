package org.zerock;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

@SpringBootTest
class AppTestApplicationTests {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sqlSession;

	@Autowired
	private MemberMapper mapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {

		System.out.println(ds);

		Connection con = ds.getConnection();

		System.out.println(con);

		con.close();

	}

	@Test
	public void testSqlSession() throws Exception {


		System.out.println(sqlSession);


	}


	@Test
	public void testInsert()throws Exception{

		MemberVO vo = new MemberVO();

		vo.setUserid("user543");
		vo.setUserpw("user543");
		vo.setUsername("Billy Kang");
		vo.setEmail("zerockcode@gmail.com");
		mapper.create(vo);

	}

	@Test
	public void testLogin()throws Exception{

		MemberVO vo  = mapper.login("user543", "user543");

		System.out.println(vo);

	}

}
