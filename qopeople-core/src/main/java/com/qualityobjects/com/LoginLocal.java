package com.qualityobjects.com;
import javax.ejb.Local;

@Local
public interface LoginLocal {
	public String login(String name, char[] password);
}
