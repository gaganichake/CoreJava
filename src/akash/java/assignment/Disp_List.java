package akash.java.assignment;

public class Disp_List{
static String list[]={"ICICI Bank","HDFC Bank","Axis Bank","Standard Chartered Bank", "Barclays Bank"};
static void Disp_List(){

for (int i=1;i<=25;i++) System.out.print("\n");
Msg.Msg("**********Welcome to the Safest & Fastest Credit Card Payment System***********");
for(int i=1;i<=5;i++){
Msg.Msg(i + "." + list[i-1]);
}
Msg.Msg1("\n\nPlease enter your bank serial no.: ");
}
}