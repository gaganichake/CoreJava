package com.corejava.switch_.enum_;


public class Main {
    
	public static void main(String[] arg){
		
		String grpCode;
	    String srcCode;
	    String slcCode;
	    
	    for(EnumUtil.RuleParamCase ruleParamCase : EnumUtil.RuleParamCase.values()){
	        
	    	EnumUtil.RuleParamCase.RuleParam ruleParam = ruleParamCase.getRuleParam("GRP20", "SRC09", "SLC55");
	        
	        grpCode = ruleParam.getGrpCode();
	        srcCode = ruleParam.getSrcCode();
	        slcCode = ruleParam.getSlcCode();
	        
	        System.out.println(grpCode+" : "+srcCode+" : "+slcCode);
	        
	    }
	 }

}
