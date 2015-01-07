package org.demo.actions;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({
    @Result(name = Action.SUCCESS, location = "${redirectName}", type = "redirectAction")
})
public class CheckAction extends ActionSupport implements ModelDriven<CnInfo> {

	public CnInfo getModel() { 
        // TODO Auto-generated method stub 
        return cnInfo; 
    } 

    private CnInfo cnInfo = new CnInfo(); 	
	
    private String redirectName;

    public String getRedirectName() {
        return redirectName;
    }	
	
    public String execute() throws Exception {
    	
    	System.out.println("[cnInfo.getTxtcn()]:" + cnInfo.getCn());
    	String result = "ok";
    	System.out.println("Result:" + result);
    	redirectName = "hello";

        return Action.SUCCESS;
    }
}
