package com.infy.agco.controller;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import com.infy.agco.util.Welcome;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class VPCLinkTestController {
	

private static final String welcomemsg = "Welcome!";
	
@RequestMapping(value="/vpcinvoke/{welcome}", method=RequestMethod.POST )
@ResponseBody
public Welcome welcomeUser(@PathVariable("welcome") String welcome) {
    return new Welcome(String.format(welcome));
}


	
	
}
