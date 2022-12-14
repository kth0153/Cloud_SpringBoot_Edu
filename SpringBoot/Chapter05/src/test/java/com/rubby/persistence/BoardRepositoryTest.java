package com.rubby.persistence;

import com.rubby.domain.Board;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class BoardRepositoryTest {
    @Autowired
    private BoardRepository  boardRepo;

    @Test
    public void testInsertBoard(){
        Board board = new Board();
        board.setTitle("첫 번째 게시글");
        board.setWriter("테스터");
        board.setContent("잘등록 되나요?");
        board.setCreateDate(new Date());
        board.setCnt(0L);

        boardRepo.save(board);

    }

    @Test
    public void testGetBoard(){
        Board board = boardRepo.findById(1L).get();
        System.out.println(board.toString());
    }

    @Test
    public void testUpdateBoard(){
        System.out.println("====== 1번 게시글 조회 ======");
        Board board = boardRepo.findById(1L).get();

        System.out.println("======= 1번 게시글 제목 수정 =====");
        board.setTitle("제목을 수정했습니다.");
        boardRepo.save(board);

    }

    @Test
    public void testDeleteBoard() {
        boardRepo.deleteById(1L);
    }
}