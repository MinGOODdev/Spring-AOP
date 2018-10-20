package com.springboot.aop.aop;

import com.springboot.aop.service.BoardService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceTest {

  @Autowired
  private BoardService boardService;

  @Test
  public void findBoards() throws Exception {
    Assert.assertEquals(boardService.getBoards().size(), 100);
  }

}