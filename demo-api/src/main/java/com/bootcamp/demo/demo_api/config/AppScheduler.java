package com.bootcamp.demo.demo_api.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AppScheduler {
  // @Scheduled(fixedDelay = 1000)
  // public void sayHello() {
  //   // System.out.println("Hello world !!!");
  //   long startTime = System.currentTimeMillis();
  //   System.out.println("Hello startTime: " + startTime);
  // }

  //  @Scheduled(fixedRate = 2000)
  //  public void sayGoodbye() throws InterruptedException {
  //    // System.out.println("Hello world !!!");
  //    long startTime = System.currentTimeMillis();
  //    Thread.sleep(3000L);
  //    System.out.println("Goodbye startTime: " + startTime);
  //  }
  
   @Scheduled(cron = "0 41 21 * * MON-FRI") 
   public void runTask() {
      System.out.println("Testing cron job");
   }
}
