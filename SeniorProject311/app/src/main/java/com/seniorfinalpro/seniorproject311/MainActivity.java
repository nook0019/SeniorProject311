package com.seniorfinalpro.seniorproject311;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.seniorfinalpro.seniorproject311.Model.ListModel;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    HttpRequest httpRequest;
    ListModel listModel = new ListModel();
    TextView tem01,hum01,cloud01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tem01 = (TextView)findViewById(R.id.tem01);
        hum01 =(TextView)findViewById(R.id.hum01);
        cloud01 = (TextView)findViewById(R.id.cloud01);


        httpRequest = new HttpRequest();
        String result = httpRequest.getJSONUrl(URL_connect.path_forcast_weather);
        Gson gson = new Gson();
        listModel = gson.fromJson(result, ListModel.class);

        Log.e("Test",result);
        Log.e("Siza"," "+listModel.getList().size());
        Log.e("Weather","temp;"+convertKtoC(listModel.getList().get(5).getMainModel().getTemp()));
        Log.e("Clouds","Cloud;"+listModel.getList().get(5).getClouds().getAll());
        tem01.setText("Temperature : "+convertKtoC(listModel.getList().get(5).getMainModel().getTemp()));
        hum01.setText("Humidity : "+listModel.getList().get(5).getMainModel().getHumidity());
        cloud01.setText("Cloud : "+listModel.getList().get(5).getClouds().getAll());

    }

    public static int convertFtoC (double f){
        double c = (f-32)*5/9;
        Log.e("F :" + f ,"C :" +c);
        return (int)c;
    }

    public static int convertKtoC (double f){

        double c = f - 273.15;
        Log.e("K :" + f ,"C :" +c);
        return (int)c;
    }


}
