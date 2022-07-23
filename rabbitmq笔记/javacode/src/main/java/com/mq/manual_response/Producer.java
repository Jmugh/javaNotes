package com.mq.manual_response;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Producer {
    public static void main(String[] args) {

        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar instance = Calendar.getInstance();

            String today = simpleDateFormat.format(instance.getTime());
            instance.add(Calendar.DATE,1);
            System.out.println(instance.getTime());
            String tomorrow = simpleDateFormat.format(instance.getTime());
            System.out.println(today);
            System.out.println(tomorrow);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("catch............");
        }
        System.out.println("app is running ...");

    }
}
