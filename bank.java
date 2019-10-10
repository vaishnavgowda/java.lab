import java.util.*;
class account
{
   	String name=new String();
	int number;
}
class savings extends account
{
	double balance=0, deposit,interest=0;
	double min=500.0,wd;
	Scanner s=new Scanner(System.in);
	savings()
	{}
void accept()
{
	System.out.println("enter the deposit amount");
	deposit=s.nextInt();
        balance=balance+deposit;
}
void balance()
{
	interest=0.12*deposit;
	
	System.out.println("the total balance amount is"+balance);
	balance+=interest;
	System.out.println("the total balance after interest credited to the account is:"+balance);
}
void withdrawal()
{
	System.out.println("enter the amount you want to withdrawal");
	wd=s.nextInt();
	if(balance<wd)
	System.out.println("balance in the account is not sufficient");
	else
	{
	balance=balance-wd;
	System.out.println("the balance in the account is :"+balance);
	}
}

}
class current extends account
{
	 double balance=0, deposit;
	double min=500.0,wd;
	Scanner s=new Scanner(System.in);
	current()
	{}
void accept()
{
	System.out.println("enter the deposit amount");
	deposit=s.nextInt();
}
void balance()
{

	balance=balance+deposit;
	System.out.println("the total balance amount is"+balance);

}
void withdrawal()
{
	System.out.println("enter the amount you want to withdrawal");
	wd=s.nextInt();
	if(balance<wd)
	System.out.println("balance in the account is not sufficient");
	else
	{
	balance=balance-wd;
	System.out.println("the balance in the account is :"+balance);
	}
}
void minimum()
{
	if (balance<min)
	{
	System.out.println("plz credit the amount to the account else service charges will be deducted");
	balance=balance-100.00;
	System.out.println("the balance after deducting the service charges is:"+balance);
	}
}
}
class Bank
{
	public static void main(String xx[])
	{
		int ch,x;
	savings s=new savings();
	current c=new current();
 
	
        do{
          System.out.println("enter the type of account :1.savings 2.current");
	Scanner p=new Scanner(System.in);
	ch=p.nextInt();
	if (ch==1)
	   {
            do
              {
 	       System.out.println("1.credit amount 2.check balance 3.withdrawal");
 	     x=p.nextInt();
	     switch(x)
	    {
 	case 1: s.accept();
        	break;
 	case 2:s.balance();
        	break;
	case 3:s.withdrawal();
       		break;
	   }
            }while(x<=3);
	}
	else
	{
          do
            {
 	    System.out.println("1.credit amount 2.check balance 3.withdrawal");
 	    x=p.nextInt();
	    switch(x)
	{
 	case 1: c.accept();
        	break;
 	case 2:c.balance();
        	break;
	case 3:c.withdrawal();
       		c.minimum();
       		break;
	}
          }while(x<=3);
	} 
       }while(ch<=2);
	}
}



