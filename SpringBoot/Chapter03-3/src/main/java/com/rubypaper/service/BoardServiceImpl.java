package com.rubypaper.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rubypaper.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("테스트 제목...");
		board.setWriter("테스터");
		board.setContent("테스트 내용입니다.....");
		board.setCreateDate(new Date());
		board.setCnt(0);
		
		return board;
	}

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		for(int i = 0; i<=10;i++) {
			
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("제목"+i);
			board.setWriter("테스터");
			board.setContent(i+"번 내용입니다");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);	
		}
		return boardList;
	}

}
