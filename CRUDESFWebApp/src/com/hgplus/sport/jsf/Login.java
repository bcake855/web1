package com.hgplus.sport.jsf;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class Login implements Serializable{

	private static final long serialVersionUID = 1L;
	private final String ADMIN = "admin";
	private final String PASS = "admin";
	
	private String username;
	private String password;
	public Login() {
	}
	
	
	public void grantPermission(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession)facesContext.getExternalContext().getSession(true);
		Object adminLoggedIn = session.getAttribute("admin");
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		if(adminLoggedIn == null){
			try {
				ec.redirect("login.xhtml?faces-redirect=true");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public String logout(){
		HttpSession session = SessionUtil.getSession();
		session.invalidate();
		return "index.xhtml?faces-redirect=true";
	}
	
	public String validateLogin() {
		
		if(username.equals(ADMIN) && password.equals(PASS)) {
			
			HttpSession session = SessionUtil.getSession();
			session.setAttribute("admin", ADMIN);
			
			return "dashboard?faces-redirect=true";
		}else {
			String message = "Oops! Something is wrong with your username and password";
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,message,null));
			return "login";
		}
	}
	
	
	public String getUsername() {
		return username;
	}
		
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	public String getPASS() {
		return PASS;
	}



	public String getADMIN() {
		return ADMIN;
	}

}
