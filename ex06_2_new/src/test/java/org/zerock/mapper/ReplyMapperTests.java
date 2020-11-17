package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = { org.zerock.config.PersistenceConfig.class
// })
@Log4j
public class ReplyMapperTests {

	// 테스트 전에 해당 번호의 게시물이 존재하는지 반드시 확인할 것
	private Long[] bnoArr = { 13L, 14L, 16L, 17L };
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;

	
	@Test
	public void testCreate() {

//		IntStream.rangeClosed(1, 10).forEach(i -> {
//
//			ReplyVO vo = new ReplyVO();
//
//			// 게시물의 번호
//			vo.setBno(bnoArr[i % 4]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("replyer" + i);
//
//			mapper.insert(vo);
//		});
		
		
		
		// 게시물의 번호
		ReplyVO vo = new ReplyVO();
					vo.setBno(3L);
					vo.setReply("댓글 테스트 33" );
					vo.setReplyer("replyer 33" );

					mapper.insert(vo);
		

	}

	/*
	
	@Test
	public void testRead() {

		Long targetRno = 13L;

		ReplyVO vo = mapper.read(targetRno);

		log.info(vo);

	}
	
	
	

	@Test
	public void testMapper() {

		log.info(mapper);
	}
	
	@Test
	public void testDelete() {

		Long targetRno = 1L;

		mapper.delete(targetRno);
	}
	
	
	
	
	@Test
	public void testUpdate() {

		Long targetRno = 7L;

		ReplyVO vo = mapper.read(targetRno);

		vo.setReply("Update Reply ");

		int count = mapper.update(vo);

		log.info("UPDATE COUNT: " + count);
	}


	
	
	@Test
	public void testList() {

		Criteria cri = new Criteria();

		// 3145745L
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);

		replies.forEach(reply -> log.info(reply));

	}
	
	
	@Test
	public void testList2() {

		Criteria cri = new Criteria(2, 10);

		// 3145745L
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 3145745L);

		replies.forEach(reply -> log.info(reply));

	}

	*/


}
