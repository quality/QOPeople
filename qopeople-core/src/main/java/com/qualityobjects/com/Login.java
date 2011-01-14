package com.qualityobjects.com;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Login implements LoginLocal {

    /**
     * Default constructor.
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

    public String login(String name, char[] password) {
    	if(name.endsWith("admin"))
    		return "loginAdmin";
    	else if(name.endsWith("user"))
    		return "loginUser";
    	else
    		return "loginFailed";
    }
}
