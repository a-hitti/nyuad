package com.example.nyuad;

import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAlarmManager extends BroadcastReceiver {
    Context _context;
    @Override
    public void onReceive(Context context, Intent intent) {
       _context= context;
       //make get request
       
//       public static InputStream getInputStreamFromUrl(String url) {
//    	   InputStream content = null;
//    	   
//    	   try {
//    	     HttpClient httpclient = new DefaultHttpClient();
//    	     HttpResponse response = httpclient.execute(new HttpGet(url));
//    	     content = response.getEntity().getContent();
//    	   } catch (Exception e) {
//
//    	   }
//    	     return content;
//    	 }
   }
}
