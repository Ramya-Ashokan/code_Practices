class CreditCardFinal
{
String cardType;
final long cardNumber;
CreditCardFinal(String cardType,long cardNumber)
{
this.cardType=cardType;
this.cardNumber=cardNumber;
}
void cardDetails()
{
System.out.println("Card type is"+cardType);
System.out.println("Card number is"+cardNumber);
}
public static void main(String args[])
{
CreditCardFinal visaCard=new CreditCardFinal("VISA",7456478547485l);
visaCard cardNumber="3746385483785893l";
CreditCardFinal masterCard=new CreditCardFinal("Master",7456475747485l);
visaCard.cardDetails();
masterCard.cardDetails();

}
}