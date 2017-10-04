package useSwitch.java.inEnum;


public class Main {
    
	public static void main(String[] arg){
		
		String grpCode = null;
	    String srcCode = null;
	    String slcCode = null;
	    
	    for(EnumUtil.RuleParamCase ruleParamCase : EnumUtil.RuleParamCase.values()){
	        
	    	EnumUtil.RuleParamCase.RuleParam ruleParam = ruleParamCase.getRuleParam("GRP20", "SRC09", "SLC55");
	        
	        grpCode = ruleParam.getGrpCode();
	        srcCode = ruleParam.getSrcCode();
	        slcCode = ruleParam.getSlcCode();
	        
	        System.out.println(grpCode+" : "+srcCode+" : "+slcCode);
	        
	    }
	 }

}
