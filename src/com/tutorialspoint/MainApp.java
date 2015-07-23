package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    /*--------------------------------------------------------------
     | This API loads beans configuration file and eventually based on 
     | the provided API, it takes care of creating and initializing 
     | all the objects i.e. beans mentioned in the configuration file.
     */
     ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
     
     /*-------------------------------------------------------------
      | get the required helloWorld bean using getBean() method of the created context. 
      | getBean() uses bean ID to return a generic object which finally can be 
      | casted to actual HelloWorld object. Once you have object, you can use this object 
      | to call any class method.
      */
     HelloWorld hw = (HelloWorld) ac.getBean("helloWorld");
     hw.getMessage();
  }

}
