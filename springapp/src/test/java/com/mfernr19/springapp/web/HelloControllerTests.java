package com.mfernr19.springapp.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;


public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
    
    @Test
    public void testSumaNumeros(){
    	HelloController controller = new HelloController();
    	assertEquals(14,controller.sumaNumeros());
    }

}