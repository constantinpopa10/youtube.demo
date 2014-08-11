package misc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NotThreadSafeSimpleDateFormat {
	private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd");
		}
	};

	public Date convert(String source) throws ParseException {
		Date d = df.get().parse(source);
		return d;
}
	public static void main(String[] args) throws Exception {
		
        final NotThreadSafeSimpleDateFormat nsl = new NotThreadSafeSimpleDateFormat();

	    Callable<Date> task = new Callable<Date>(){
	        public Date call() throws Exception {
	            return nsl.convert("20101022");
	        }
	    };

	    //pool with 5 threads
	    ExecutorService exec = Executors.newFixedThreadPool(10);
	    List<Future<Date>> results =
	                 new ArrayList<Future<Date>>();

	    //perform 10 date conversions
	    for(int i = 0 ; i < 1000000 ; i++){
	        results.add(exec.submit(task));
	    }
	    exec.shutdown();

	    //look at the results
	    for(Future<Date> result : results){
	        System.out.println(result.get());
	    }
	}
}
