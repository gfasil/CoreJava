package threads;

import java.text.SimpleDateFormat;

public class ThreadLocalExample  {

    public static ThreadLocal<SimpleDateFormat> dateformatter = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("dd/mm/yyy");
        }

        @Override
        public SimpleDateFormat get() {
            return dateformatter.get();
        }
    };

public static  ThreadLocal<SimpleDateFormat> TLocalDfWIthJava8=ThreadLocal.withInitial(()->

    new SimpleDateFormat("dd/mm/yyy"));



}
