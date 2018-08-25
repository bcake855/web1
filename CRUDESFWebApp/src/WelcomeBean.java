import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class WelcomeBean {

	private String message1 = "JSF is fun!";
	
	public WelcomeBean() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

}
