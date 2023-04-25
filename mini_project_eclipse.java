package mini;

import java.util.*;

class Welcomes 
{  
    public void Welcomess(){
            try{
                    System.out.println("        -----Welcome to Mytel-------");
                    Thread.sleep(1000);
                    System.out.println("    Enter option 1 for mobile recharge"); 
                    System.out.println("    Enter option 2 for pay bills"); 
                    System.out.println("    Enter option 3 to convert prepaid to postpaid / postpaid to prepaid"); 
                    System.out.println("    Enter option 4 to know the balance ");
                    System.out.println("    Enter option 5 for profile details");
                    System.out.println("    Enter 0 to exit");
                    }catch(Exception e){
                        System.out.println("    you entered wrong number");
                    }                  
                    try{
                        System.out.print("Enter your option : ");
                        Scanner entering_details=new Scanner(System.in);
                        int user_entering_details=entering_details.nextInt();
        
                        while((user_entering_details>=0))
                        {
                            if(user_entering_details==1){
                                mobile_recharge b=new mobile_recharge();
                                b.recharge_modules();
                            }
                            else if(user_entering_details==2){
                            	post_paid c=new post_paid();
                            		c.postpaids();	
                            }
                            else if(user_entering_details==3){
                            	convertion c=new convertion();
                            		c.module();	
                            }
                            else if(user_entering_details==4){
                                balance_modules e=new balance_modules();
                                e.balance();
                            }
                            else if(user_entering_details==5){
                                profiles f=new profiles();
                                f.profiless();
                            }else if(user_entering_details==0) {
                            	System.out.println("----thank you for visit----");
                            	break;
                            } else {
                            	System.out.println("---you entered wrong option---");
                            }
                            returning f=new returning();
                                f.returnss();
                                break;
                        }
                        }catch(Exception e){
                            System.out.println("    you entered wrong number"+"\n");
                            returning f=new returning();
                            f.returnss();             
                        } 
            }
}
class returning 
{
    public void returnss()
    {
            System.out.println("Enter option 9 to go back to main options "+"\n"+"Enter 0 to exit ");
            Scanner re=new Scanner(System.in);
            int returns=re.nextInt();    
            if(returns==9)
            {
                Welcomes check=new Welcomes();
                check.Welcomess();
            }
            else if(returns==0)
            { 
                System.out.println("Thankyou for visit");               
            }
            else {
            	System.out.println("---you entered wrong option---");
            }
    }
}
class money 
{
	public void pay() {
		try {
		System.out.println("Enter payment deatails ");
        System.out.print("Enter debit card/credit card number : ");
        Scanner card=new Scanner(System.in);
        long card_no=card.nextLong();

        System.out.print("Enter expiry date (mmyy): ");
        Scanner expiry=new Scanner(System.in);
        long expiry_date=expiry.nextLong();

        System.out.print("Enter CVV number : ");
        Scanner cvv=new Scanner(System.in);
        long cvv_no=cvv.nextLong();
        System.out.print("processing...");
	       
        Thread.sleep(1000);
        System.out.println("done...congratulations..your recharge is successful");
        
		}catch(Exception e){
			System.out.println("you entered wrong number");
		} 
	}
}

class mobile_recharge  
{  
    public void recharge_modules()
        {  
        try{
        	boolean a=true,c;
            TreeSet<Long> prepaid_numbers=new TreeSet<>();
            prepaid_numbers.add(1005867345l);
            prepaid_numbers.add(1234567890l);
            prepaid_numbers.add(1212121212l);
            prepaid_numbers.add(9876543210l);
            
            System.out.print("Enter prepaid number : ");
            Scanner enter_prepaid=new Scanner(System.in);
            long enter_prepaid_number=enter_prepaid.nextLong();
            c=prepaid_numbers.contains(enter_prepaid_number);
            if((c==a))
            {
	            System.out.println("package 1 "+"\n"+"Amount 200 "+"\n"+"Validity 30 days ");
	            System.out.println("Data 3GB/day "+"\n"+"package 2 ");
	            System.out.println("Amount 300 "+"\n"+"Validity 30 days "+"\n"+"Data 6GB/day");
	
	            System.out.println("Enter the appropriate package number to proceed further ");
	
	            System.out.print("Enter package number do you want : ");
	            Scanner packages=new Scanner(System.in);
	            int package_no=packages.nextInt();
           
	            if((package_no==1)||(package_no==2))
	            {	            	
		            money n=new money();
		            n.pay();
	            }else {
	            	System.out.println("you entered wrong package");
	            		}
            }
            else{
                System.out.println("your number not available in my services");
            }          
            }catch(Exception e){
                System.out.println(e+"    check entered details ");
            }

        }
}
class post_paid 
{
	public void postpaids()
 {
     try{
    	 boolean a=true,c;
         TreeSet postpaid_numbers=new TreeSet<>();
         postpaid_numbers.add(1005867345l);
         postpaid_numbers.add(1234567890l);
         postpaid_numbers.add(1212121212l);
         postpaid_numbers.add(9876543210l);
                  
         System.out.println("Enter postpaid number : ");
         Scanner post_mobile_number=new Scanner(System.in);
         long enter_postpaid_number=post_mobile_number.nextLong();
         c=postpaid_numbers.contains(enter_postpaid_number);
         if((c==a))
         {
             System.out.println("your due amount is :600INR");
             System.out.println("\n");

             money m=new money();
             m.pay();
         }
         else
         {
             System.out.println("your number not available in my services");
         }          
         }
         catch(Exception f)
         {
             System.out.println("Entered wrong number check entered details ");
         }
         
     }
}

class convertion 
{
    public void module(){

    try{
    	 boolean a=true,c;
         TreeSet postpaid_numbers=new TreeSet<>();
         postpaid_numbers.add(1005867345l);
         postpaid_numbers.add(1234567890l);
         postpaid_numbers.add(1212121212l);
         postpaid_numbers.add(9876543210l);
    	
        System.out.println("Enter your phone number : ");
        Scanner change=new Scanner(System.in);
        long changes=change.nextLong();
        c=postpaid_numbers.contains(changes);
        if((c==a))
        {
System.out.println("Enter option 6 to convert prepaid to post "+"\n"+"Enter option 7 to convert post to prepaid ");      
        System.out.println("Enter 7 or 6 number : ");
        Scanner option=new Scanner(System.in);
        int options=option.nextInt();

            switch(options)
            {
            case 6:
    System.out.println("congrats! your request is received. you new SIM will be deliverd within 2days to your address.");
            break;
            case 7:
    System.out.println("congrats! your request is received. you new SIM will be deliverd within 2days to your address.");
            break;
            default:
            {
            	System.out.println("you entered wrong option");
            }
            }
            }else {
            	System.out.println("your numbers is not our service list");
            }       
        }catch(Exception e){
            System.out.println("you entered wrong number ");
        }
    }
}

class balance_modules
{
    public void balance()
    {
    	try {
    		boolean a=true,c;
            TreeSet postpaid_numbers=new TreeSet<>();
            postpaid_numbers.add(1005867345l);
            postpaid_numbers.add(1234567890l);
            postpaid_numbers.add(1212121212l);
            postpaid_numbers.add(9876543210l);
            
        System.out.println("Enter mobile number : ");
        Scanner mobile_number=new Scanner(System.in);
        long entered_mobile_number=mobile_number.nextLong();
        c=postpaid_numbers.contains(entered_mobile_number);
        if((c==a))
        {
            System.out.println("Balance :"+"\n"+"SMS   :30"+"\n"+"Talktime  :unlimited");
            System.out.println("Data  :1GB");                                                                       
        }
        else{
            System.out.println("you entered wrong number");
        }
    	}catch(Exception e) {
    		System.out.println("you entered wrong number");
    	}
    }
}
class profiles
{
    public void profiless()
    {           
            try{
            	boolean a=true,c;
                TreeSet postpaid_numbers=new TreeSet<>();
                postpaid_numbers.add(1005867345l);
                postpaid_numbers.add(1234567890l);
                postpaid_numbers.add(1212121212l);
                postpaid_numbers.add(9876543210l);
                System.out.print("Enter your mobile number : ");
                
                Scanner mobile=new Scanner(System.in);
                long mobile_number=mobile.nextLong();

                System.out.print("Enter your name : ");
                Scanner name=new Scanner(System.in);
                String user_name=name.nextLine();

                System.out.print("Enter your Address : ");
                Scanner Address=new Scanner(System.in);
                String user_Address=Address.nextLine();  

                System.out.println("\n");

                System.out.println("Mobile number : "+mobile_number);
                System.out.println("Name          : "+user_name);
                System.out.println("Address       : "+user_Address);           
    
        }catch(Exception p) {
                System.out.println("  you entered wrong input");
        }        
}
}   
public class mini_project_eclipse 
{
	public static void main(String[] args) {
		
		Welcomes z=new Welcomes();
		z.Welcomess();		
	}
}
