package com.rubby;

import com.rubby.domain.Board;
import com.rubby.persistence.BoardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class QueryAnnotationTest {
    @Autowired
    private BoardRepository boardRepo;

   /* @Test
    public void testQueryAnnotationTest1(){
        List<Board> boardList = boardRepo.queryAnnotationTest1("테스트 제목10");

        System.out.println("검색 결과");
        for(Board board : boardList){
            System.out.println("------->" + board.toString());
        }
    }

    @Test
    public void testQueryAnnotationTest2(){
        List<Object[]> boardList = boardRepo.queryAnnotationTest2("테스트 제목10");

        System.out.println("검색 결과");
        for(Object[] row : boardList){
            System.out.println("------->" + Arrays.toString(row));
        }
    }

    @Test
    public void testQueryAnnotationTest3(){
        List<Object[]> boardList = boardRepo.queryAnnotationTest3("테스트 제목10");

        System.out.println("검색 결과");
        for(Object[] row : boardList){
            System.out.println("------->" + Arrays.toString(row));
        }
    }

    @Test
    public void testQueryAnnotationTest4(){
        Pageable paging = PageRequest.of(0,3, Sort.Direction.DESC, "seq");
        List<Board> boardList = boardRepo.queryAnnotationTest4(paging);

        System.out.println("검색 결과");
        for(Board board : boardList){
            System.out.println("--->" + board.toString());
        }

    }*/

}
