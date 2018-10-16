package org.pearl.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pearl.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod = @__({ @Autowired }))
	private BoardMapper mapper;

	@Test
	public void getList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void insertTest() {
		BoardVO board = new BoardVO();
		board.setTitle("친구를 만나느라");
		board.setContent("샤샤샤");
		board.setWriter("트와이수~~~~");
		
		mapper.insert(board);
		
		log.info(board);
	}
}