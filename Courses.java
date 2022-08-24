package org.jayavel;

import java.util.List;

import org.pojo.API;
import org.pojo.Mobile;
import org.pojo.Webautomation;

public class Courses {
	
	private List<Webautomation> webAutomation;
	
	private List<API> api;
	
	public List<Webautomation> getWebAutomation() {
		return webAutomation;
	}

	public void setWebAutomation(List<Webautomation> webAutomation) {
		this.webAutomation = webAutomation;
	}

	public List<API> getApi() {
		return api;
	}

	public void setApi(List<API> api) {
		this.api = api;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	private List<Mobile> mobile;

}
