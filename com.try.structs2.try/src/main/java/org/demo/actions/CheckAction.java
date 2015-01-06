package org.demo.actions;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import jp.opensquare.sandbox.cxf.jaxrs.requestor.ServiceRequestor;

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
    	
    	System.out.println("[cnInfo.getTxtcn()]:" + cnInfo.getTxtcn());
    	String result = ServiceRequestor.doRestTest(cnInfo.getTxtcn());
    	System.out.println("Result:" + result);
    	redirectName = "hello";
    	
    	cnInfo.setTxtcn(cnInfo.getTxtcn());
        return Action.SUCCESS;
    }
}
