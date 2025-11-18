public class PLAPP
{
 public static void main(String x[])
 {
  int sp=Integer.parseInt(x[0]);
  int cp=Integer.parseInt(x[1]);
  String msg=sp>cp? "Seller made Profit"+(sp-cp) :"Seller made Loss"+(sp-cp);
  System.out.println(msg);
 }
}