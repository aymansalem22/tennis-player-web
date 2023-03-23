package com.paltecno.springmvc;


import org.hibernate.validator.constraints.NotEmpty;

import com.paltecno.springmvc.validation.HeadToHead;

public class BaseballPlayer {
	
	private String player3;
	
	private String player4;
	
	@NotEmpty(message="Field cannot be left blank.")
	@HeadToHead
	private String head3head;
	
	public BaseballPlayer() {
		super();
	}

	public String getPlayer3() {
		return player3;
	}

	public void setPlayer3(String player3) {
		this.player3 = player3;
	}

	public String getPlayer4() {
		return player4;
	}

	public void setPlayer4(String player4) {
		this.player4 = player4;
	}

	public String getHead3head() {
		return head3head;
	}

	public void setHead3head(String head3head) {
		this.head3head = head3head;
	}
	
	
	

}
