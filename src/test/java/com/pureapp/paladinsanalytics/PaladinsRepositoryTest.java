package com.pureapp.paladinsanalytics;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pureapp.paladinsanalytics.domain.hirez.SessionResponse;
import com.pureapp.paladinsanalytics.repository.hirez.PaladinsRepository;
import com.pureapp.paladinsanalytics.repository.hirez.PaladinsRepositoryImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class PaladinsRepositoryTest {
  
  @Inject
  private PaladinsRepository paladinsRepository;
  
  @Test
  public void testRepo() {
    assertThat(paladinsRepository, instanceOf(PaladinsRepositoryImpl.class));
    
    SessionResponse response = paladinsRepository.createSession();
    System.out.println(response);
  }
  
  @Test
  public void testRepo2() {
    SessionResponse session = paladinsRepository.createSession();
    
    Object response = paladinsRepository.getPlayerSummary(session, "g3neralzzzzz");
    System.out.println(response);
  }
}
