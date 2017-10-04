package akash.java.assignment;

import java.io.IOException;
import java.util.Scanner;
public class Read_Option {
static int Read_num() throws IOException {
Scanner opt=new Scanner(System.in);
String temp= opt.nextLine();
int option= Integer.parseInt((new String(temp)).trim());
return option;
}
static String Read_Info() throws IOException {
Scanner inf=new Scanner(System.in);
String info = inf.nextLine();
return info;
}
static double Read_amt() throws IOException {
Scanner inf=new Scanner(System.in);
String temp1 = inf.nextLine();
double info= Double.parseDouble((new String(temp1)).trim());
return info;
}
}
