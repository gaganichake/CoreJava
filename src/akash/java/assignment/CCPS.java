package akash.java.assignment;

import java.io.IOException;
public class CCPS{
static void CCPS() throws IOException {
Field_Structure ob1=new Field_Structure();
int option;
Disp_List.Disp_List();
ob1.BI=0;
ob1.BI=Read_Option.Read_num();
while ((ob1.BI<=0) || (ob1.BI> Disp_List.list.length)){
Msg.Msg1("\n\nPlease enter valid bank serial no.: ");
ob1.BI=Read_Option.Read_num();
}
Msg.Msg1("\nPlease Enter your Credit Card no.: ");
ob1.Card_no=Read_Option.Read_Info();
Msg.Msg1("\nPlease Re-Enter your Credit Card no.: ");
String chk=Read_Option.Read_Info();
while(ob1.Card_no.equals(chk)==false){
for (int i=1;i<=25;i++) System.out.print("\n");
Msg.Msg1("\n Credit card no. not matching\nPlease Enter your Credit Card no.: ");
ob1.Card_no=Read_Option.Read_Info();
Msg.Msg1("\nPlease Re-Enter your Credit Card no.: ");
chk=Read_Option.Read_Info();	
}
Msg.Msg1("\nPlease Enter your Mobile no.: ");
ob1.mob_no=Read_Option.Read_Info();
Msg.Msg1("\nPlease Enter your email-id: ");
ob1.email=Read_Option.Read_Info();
Msg.Msg1("\nPlease Enter the amount to be paid: ");
ob1.amt=Read_Option.Read_amt();
Msg.Msg1("\nPlease Enter your Pin: ");
ob1.pin=Read_Option.Read_num();
Msg.Msg("\nBelow are the details entered by you: \n\n Your Bank: " + Disp_List.list[ob1.BI]);
Msg.Msg(" Your Credit Card no.: " + ob1.Card_no);
Msg.Msg(" Your Mobile no.: " + ob1.mob_no);
Msg.Msg(" Your email-id: " + ob1.email);
Msg.Msg(" Amount to be paid: " + ob1.amt);
Msg.Msg(" Your Pin: " + ob1.pin + "\n\n");
}
}

