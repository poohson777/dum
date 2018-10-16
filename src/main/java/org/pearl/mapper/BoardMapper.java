package org.pearl.mapper;

import java.util.List;

import org.pearl.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);

}
