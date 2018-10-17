package org.pearl.service;

import java.util.List;

import org.pearl.domain.BoardVO;
import org.pearl.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
	
	@Setter(onMethod = @__({ @Autowired }))
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		

	    log.info("register......" + board);

	    mapper.insertSelectKey(board);


	}

	@Override
	public BoardVO get(Long bno) {
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify ServiceImpl... 나오나...");
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		
		return mapper.delete(bno) == 1 ;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("get List~~^00^");
		return mapper.getList();
	}

}
