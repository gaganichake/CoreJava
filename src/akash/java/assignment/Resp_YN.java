package akash.java.assignment;

import java.io.IOException;
public class Resp_YN {
	static String resp;
	static void Resp()throws IOException{
	boolean flageA=false;
	do{resp= Read_Option.Read_Info();
	if (resp.equalsIgnoreCase("Y")||resp.equalsIgnoreCase("N"))	flageA=true; else Msg.Msg1("Please enter valid option............\nPresss 'Y' if Correct and 'N' if incorrect:");
	} while (flageA==false);
	}
}