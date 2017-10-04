package useSwitch.java.inEnum;

public class EnumUtil {

    public static String OTHER = "OTH";

public static enum RuleParamCase {
GRP_SCR_SLC, GRP_SCR_OTHER, GRP_OTHER_SLC, GRP_OTHER_OTHER, OTHER_SRC_SCL, OTHER_SRC_OTHER, OTHER_OTHER_SCL, OTHER_OTHER_OTHER;

	public RuleParam getRuleParam(String grpCodeVal, String srcCodeVal, String slcCodeVal){
	    
	    RuleParam ruleParam = new RuleParam();
	    
	    switch(this){
	    
	    case GRP_SCR_SLC:
	            ruleParam.setGrpCode(grpCodeVal);
	            ruleParam.setSrcCode(srcCodeVal);
	            ruleParam.setSlcCode(slcCodeVal);
	    break;
	    case GRP_SCR_OTHER:
	            ruleParam.setGrpCode(grpCodeVal);
	            ruleParam.setSrcCode(srcCodeVal);
	            ruleParam.setSlcCode(OTHER);
	    break;
	    case GRP_OTHER_SLC:
	            ruleParam.setGrpCode(grpCodeVal);
	            ruleParam.setSrcCode(OTHER);
	            ruleParam.setSlcCode(slcCodeVal);
	    break;
	    case GRP_OTHER_OTHER:
	            ruleParam.setGrpCode(grpCodeVal);
	            ruleParam.setSrcCode(OTHER);
	            ruleParam.setSlcCode(OTHER);
	    break;
	    case OTHER_SRC_SCL:
	            ruleParam.setGrpCode(OTHER);
	            ruleParam.setSrcCode(srcCodeVal);
	            ruleParam.setSlcCode(slcCodeVal);
	    break;
	    case OTHER_SRC_OTHER:
	            ruleParam.setGrpCode(OTHER);
	            ruleParam.setSrcCode(srcCodeVal);
	            ruleParam.setSlcCode(OTHER);
	    break;
	    case OTHER_OTHER_SCL:
	            ruleParam.setGrpCode(OTHER);
	            ruleParam.setSrcCode(OTHER);
	            ruleParam.setSlcCode(slcCodeVal);
	    break;
	    case OTHER_OTHER_OTHER:
	            ruleParam.setGrpCode(OTHER);
	            ruleParam.setSrcCode(OTHER);
	            ruleParam.setSlcCode(OTHER);
	    break;
	    default: throw new AssertionError("Unknown case: " + this);
	    }
	    
	    return ruleParam;
	}
	
	public static class RuleParam{
	    
	    String grpCode;
	    String srcCode;
	    String slcCode;
	    
	    public String getGrpCode() {
	        return grpCode;
	    }
	    public void setGrpCode(String grpCode) {
	        this.grpCode = grpCode;
	    }
	    public String getSrcCode() {
	        return srcCode;
	    }
	    public void setSrcCode(String srcCode) {
	        this.srcCode = srcCode;
	    }
	    public String getSlcCode() {
	        return slcCode;
	    }
	    public void setSlcCode(String slcCode) {
	        this.slcCode = slcCode;
	    }
	}
	
};

}
