package com.example.sample;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;

import org.springframework.http.*;

@RestController()
public class ControllerClass{
	Time_Conversion t=new Time_Conversion();
	@RequestMapping(value = "/transactions", method = RequestMethod.POST)
	public ResponseEntity<TransactionClass> update(@RequestBody TransactionClass tc) throws ParseException {
	
		Time_Conversion t=new Time_Conversion();
		boolean result=t.timeConversion(tc.getTimestamp());
		if (result==false)
		{
			return new ResponseEntity<TransactionClass>(tc, HttpStatus.NO_CONTENT);
		}
		else 
	   return new ResponseEntity<TransactionClass>(tc, HttpStatus.CREATED);
	}
	

}
