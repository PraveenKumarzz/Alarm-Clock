package com.clock;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class time {
	  int seconds,minutes,hours;
	  public static final long CURRENT_TIME_MILLIS = System.currentTimeMillis();

	  
		      
	  
	  void input() {
		  System.out.println(System.currentTimeMillis()/1000);
		  Scanner in=new Scanner(System.in);
		  hours=in.nextInt();
		  minutes=in.nextInt();
		  seconds=in.nextInt();
		  
	  }
	  void secconvert() {
		  
		  hours=hours*3600;
		  minutes=minutes*60;
		  seconds=seconds;
		  
	  }
	  void start() {
		  Date instant = new Date(CURRENT_TIME_MILLIS);
		     SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss" );
		     String time = sdf.format( instant );
		    
		     String[] str=time.split(":",3);
		    
		      int[] x=new int[3];
		      int i=0;
		      for(String s:str) {
		    	  x[i]=Integer.parseInt(s);
		    	  i++;
		      }
		      int h1=x[0]*3600;
		      int m1=x[1]*60;
		      int s1=x[2];
		      int total1=h1+m1+s1;
		      
		     
		      int totalsec=hours+minutes+seconds;
		      int diff=totalsec-total1;
		      long diffsec=(System.currentTimeMillis()/1000)+(diff);
		      System.out.println(diffsec);
		      System.out.println(System.currentTimeMillis()/1000);
		      
		      
		      
		      while((System.currentTimeMillis()/1000)<(diffsec)) {
		    	  System.out.println(diffsec - (System.currentTimeMillis()/1000));
		    	  try {  Thread.sleep(1000);
		    	  }
		    	  catch(InterruptedException e) {
		    		Thread.currentThread().interrupt();
		    		
		    	  }
		      }
		    	
		     
		    	 try {
		    		  Desktop desktop = java.awt.Desktop.getDesktop();
		    		  URI oURL = new URI("https://www.youtube.com/watch?v=eNvUS-6PTbs");
		    		  desktop.browse(oURL);
		    		} catch (Exception e) {
		    		  e.printStackTrace();
		    		}
		      
		      }

	  
		      
	  }    
