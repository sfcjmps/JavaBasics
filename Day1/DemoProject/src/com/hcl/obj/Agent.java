package com.hcl.obj;

public class Agent {
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipcode){
		StringBuilder sbError=new StringBuilder();
		boolean isValid= true;
		
		if(agentId.charAt(0)!='A'){
			sbError.append("agentId must start with 'A'" + "\r\n");
			isValid=false;
		}
		if(fullName.indexOf(' ')==-1){
			sbError.append("Name must contain first name and last name"+"\r\n" );
			isValid=false;
		}
		if(fullName.length()>20){
			sbError.append("name is too long" + "\r\n");
		    isValid=false;
	    }
	    if(maritalStatus==0){
	    	sbError.append("not married" + "\r\n");
	    	isValid=false;
	    }
	    if(zipcode.length()>6){
	    	sbError.append("zipcode is long"+"\r\n");
	    	isValid=false;
	    }
	    if(isValid==true){
	    	sbError.append("AgentId is     :" + agentId+"\r\n");
	    	sbError.append("Name is        :" + fullName+"\r\n");
	    	sbError.append("marital status :" + maritalStatus+"\r\n");
	    	sbError.append("zipcode is     :" + zipcode+"\r\n");	    	
	    }
	    return sbError;
	}    

	public static void main(String[] args) {
		String agentId="A001";
		String fullName="sai kumar";
		int maritalStatus=1;
		String zipcode="518003";
		StringBuilder result=new Agent().show(agentId, fullName, maritalStatus, zipcode);
		System.out.println(result);				
	}
}
