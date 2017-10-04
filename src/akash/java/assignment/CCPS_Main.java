package akash.java.assignment;

import java.io.IOException;
public class CCPS_Main{
	public static void main(String args[])throws IOException{
	boolean flageb=false;
	do{
	CCPS.CCPS();
	Msg.Msg1("\n\nPlease Confirm the details.................\n\nPresss 'Y' if Correct and 'N' if incorrect:");
	Resp_YN.Resp();
	if(Resp_YN.resp.equalsIgnoreCase("Y"))
	{Msg.Msg1("\nThank you for using CCPS. Your transaction is Succesfull.\n\nDo you want to make another payment(Y/N): ");
	Resp_YN.Resp();
	if (Resp_YN.resp.equalsIgnoreCase("N")) flageb=true;
	} 
	}while(flageb==false);
	Msg.Msg("\n");
	}
}