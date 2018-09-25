package com.example.sample;

/*import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;*/

public class Time_Conversion extends TransactionClass {
	 TransactionClass tc1=new TransactionClass();

 
 public boolean timeConversion(long usertransact)  {
	
	 long time=System.currentTimeMillis();
	 long dif=time-usertransact;
	
	 if(dif>60)
		 return false;
	 else 
		 return true;
	
	
		
	 
 }
 
 
 
 
 

}
