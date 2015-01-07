package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * <code>Set welcome message.</code>
 */
public class HelloAction extends ActionSupport implements ModelDriven<CnInfo>{
	
	public CnInfo getModel() { 
        // TODO Auto-generated method stub 
        return cnInfo; 
    } 

    private CnInfo cnInfo = new CnInfo(); 
    
    public String execute() throws Exception {
    	if (cnInfo.getCn() != null && !cnInfo.getCn().isEmpty()){
	    	System.out.println("[cnInfo.getTxtcn()]:" + cnInfo.getCn());
	    	String result = "Ok";
	    	System.out.println("Result:" + result);
	    	
	    	cnInfo.setCnCheckResult(result);
    	} else {
    		cnInfo.setCnCheckResult("Please input CN Name!");
    	}
    	//ServiceRequestor.doRestTest();
    	
        //setMessage(getText(MESSAGE));
    	//cnInfo.setTxtcn("Nannde");
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
