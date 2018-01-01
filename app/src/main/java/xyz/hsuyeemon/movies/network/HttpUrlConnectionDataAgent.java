package xyz.hsuyeemon.movies.network;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import xyz.hsuyeemon.movies.PopularMovieApp;

/**
 * Created by Dell on 12/29/2017.
 */

public class HttpUrlConnectionDataAgent implements MovieDataAgent {

    private static HttpUrlConnectionDataAgent sHttpUrlConnectionDataAgent;

    private HttpUrlConnectionDataAgent(){

    }
    public static HttpUrlConnectionDataAgent getObjInstance(){
        if(sHttpUrlConnectionDataAgent==null){
            sHttpUrlConnectionDataAgent=new HttpUrlConnectionDataAgent();
        }
        return sHttpUrlConnectionDataAgent;
    }

    @Override
    public void loadNews() {
        Log.d("","log in main thread");
        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                Log.d("","log in background thread");

                URL url;
                BufferedReader reader = null;
                StringBuilder stringBuilder;

                try {
                    // create the HttpURLConnection
                    //http://padcmyanmar.com/padc-3/mm-news/apis/v1/getMMNews.php
                    url = new URL("http://padcmyanmar.com/padc-3/mm-news/apis/v1/getMMNews.php"); //1.
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //2.

                    // just want to do an HTTP POST here
                    connection.setRequestMethod("POST"); //3.

                    // uncomment this if you want to write output to this url
                    //connection.setDoOutput(true);

                    // give it 15 seconds to respond
                    connection.setReadTimeout(15 * 1000); //4. ms-milliseconds

                    connection.setDoInput(true); //5.
                    connection.setDoOutput(true);

                    //put the request parameter into NameValuePair list.
                    List<NameValuePair> params = new ArrayList<>(); //6.
                    //params.add(new BasicNameValuePair(MyanmarAttractionsConstants.PARAM_ACCESS_TOKEN, MyanmarAttractionsConstants.ACCESS_TOKEN));
                    params.add(new BasicNameValuePair("access_token","b002c7e1a528b7cb460933fc2875e916"));
                    params.add(new BasicNameValuePair("page","1"));


                    //write the parameters from NameValuePair list into connection obj.
                    OutputStream outputStream = connection.getOutputStream();
                    BufferedWriter writer = new BufferedWriter(
                            new OutputStreamWriter(outputStream, "UTF-8"));
                    writer.write(getQuery(params));
                    writer.flush();
                    writer.close();
                    outputStream.close();

                    connection.connect(); //7.

                    // read the output from the server
                    reader = new BufferedReader(new InputStreamReader(connection.getInputStream())); //8.
                    stringBuilder = new StringBuilder();

                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line + "\n");
                    }

                    String responseString = stringBuilder.toString(); //9.
                    Log.d(PopularMovieApp.LOG_TAG,"responseSting :"+responseString);

                    //Gson gson=new Gson();
                    //GetMovieResponse getNewsResponse=gson.fromJson(responseString, GetMovieResponse.class);
                    //Log.d(PopularMovieApp.LOG_TAG, "getNewsResponse news size"+getNewsResponse.getMovies().size());

                    //EventBus.getDefault().post(new LoadedNewsEvent(getNewsResponse.getMovies())); //event broadcast

                } catch (Exception e) {
                    Log.e(PopularMovieApp.LOG_TAG,e.getMessage());
                    /*
                    Log.e(MyanmarAttractionsApp.TAG, e.getMessage());
                    AttractionModel.getInstance().notifyErrorInLoadingAttractions(e.getMessage());
                    */
                } finally {
                    // close the reader; this can throw an exception too, so
                    // wrap it in another try/catch block.
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                }


                return null;
            }
        }.execute();

    }
    private String getQuery(List<NameValuePair> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (NameValuePair pair : params) {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(pair.getName(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(pair.getValue(), "UTF-8"));
        }

        return result.toString();
    }
    }

