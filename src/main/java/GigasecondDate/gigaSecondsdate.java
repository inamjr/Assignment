package GigasecondDate;

import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;


public class gigaSecondsdate {
	public static  void main(String[] args) {
	// guide
//	 "PT20.345S" -- parses as "20.345 seconds"
//	    "PT15M"     -- parses as "15 minutes" (where a minute is 60 seconds)
//	    "PT10H"     -- parses as "10 hours" (where an hour is 3600 seconds)
//	    "P2D"       -- parses as "2 days" (where a day is 24 hours or 86400 seconds)
//	    "P2DT3H4M"  -- parses as "2 days, 3 hours and 4 minutes"
//	    "P-6H3M"    -- parses as "-6 hours and +3 minutes"
//	    "-P6H3M"    -- parses as "-6 hours and -3 minutes"
//	    "-P-6H+3M"  -- parses as "+6 hours and -3 minutes"
	 
	String age ="P2DT3H4M";
	
	Duration durationnn= Duration.parse(age);
	
		System.out.println(durationnn);

	}
}

