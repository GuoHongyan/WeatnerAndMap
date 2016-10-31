package com.example.test10_25;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AddCityActivity extends Activity {
    String code;
    ListView province;
    ListView city;
    ViewGroup.MarginLayoutParams provinceLayoutParams;//省份layout的参数
    ViewGroup.MarginLayoutParams cityLayoutParams;//市layout的参数
    int screenWidth;//屏幕宽度
    ArrayAdapter<String> adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_city);
        province=(ListView)findViewById(R.id.add_province);
        city=(ListView)findViewById(R.id.add_city);

        WindowManager wm=(WindowManager) getSystemService(WINDOW_SERVICE);
        screenWidth=wm.getDefaultDisplay().getWidth();

        provinceLayoutParams=(ViewGroup.MarginLayoutParams) province.getLayoutParams();
        cityLayoutParams=(ViewGroup.MarginLayoutParams) city.getLayoutParams();


        String[] s=new String[]{"广东","福建","上海","北京","广西","西藏",
                "云南","内蒙古","新疆","海南","重庆","南京","台北","吉林","海口",
                "江西德安","山西","湖南","湖北","河南","河北","甘肃","四川九寨沟","合肥",
                "青海","陕西","贵州","江苏连云项"};
        Set<String> set=new TreeSet<String>();
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<s.length;i++){
            set.add(s[i]);
        }
        list.addAll(set);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);
        province.setAdapter(adapter);


        province.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                if(arg2==0){
                    code="101020100";//上海

                    sendCode(code);
                }
                else if(arg2==1){

                    code="101290101";//yunnan kunming
                    sendCode(code);

                }
                else if(arg2==2){
                    code="101080201";//包头

                    sendCode(code);

                }
                else if(arg2==3){
                    code="101010100";//beijing

                    sendCode(code);

                }
                else if(arg2==4){

                    code="101190101";//nanjing
                    sendCode(code);


                }




                else if(arg2==5){


                    code="101340101";//taibei
                    sendCode(code);
                }
                else if(arg2==6){

                    code="101220101";//hefei
                    sendCode(code);
                }
                else if(arg2==7){

                    code="101060201";//jilin
                    sendCode(code);
                }
                else if(arg2==8){

                    code="101271906";//四川九寨沟
                    sendCode(code);
                }
                else if(arg2==9){


                    code="101100107";//山西
                    sendCode(code);
                }
                else if(arg2==10){

                    code="101280601";//guangdongshenzhen
                    sendCode(code);
                }
                else if(arg2==11){

                    code="101300101";//广西
                    sendCode(code);
                }
                else if(arg2==12){

                    code="101130101";//新疆
                    sendCode(code);
                }
                else if(arg2==13){

                    code="101191001";//jiangsu lianyunxiang
                    sendCode(code);
                }
                else if(arg2==14){

                    code="101240205";//江西德安
                    sendCode(code);
                }
                else if(arg2==15){

                    code="101090101";//河北石家庄
                    sendCode(code);
                }
                else if(arg2==16){

                    code="101180611";//河南信阳
                    sendCode(code);
                }
                else if(arg2==17){

                    code="101310212";//海南文昌
                    sendCode(code);
                }
                else if(arg2==18){

                    code="101310101";//海口
                    sendCode(code);
                }
                else if(arg2==19){

                    code="101200701";//湖北咸宁
                    sendCode(code);
                }
                else if(arg2==20){

                    code="101250903";//湖南洞口
                    sendCode(code);
                }
                else if(arg2==21){

                    code="101160305";//甘肃华庭
                    sendCode(code);
                }
                else if(arg2==22){

                    code="101230605";//fujian龙海
                    sendCode(code);
                }
                else if(arg2==23){

                    code="101140203";//西藏 南木林
                    sendCode(code);
                }
                else if(arg2==24){

                    code="101260211";//贵州正安
                    sendCode(code);
                }
                else if(arg2==25){

                    code="101041700";//重庆云阳
                    sendCode(code);
                }
                else if(arg2==26){

                    code="101110200";//陕西咸阳
                    sendCode(code);
                }
                else if(arg2==27){

                    code="101150203";//青海民和

                    sendCode(code);
                }


            }
        });


    }
    public void sendCode( String s){
        Intent intent=new Intent(AddCityActivity.this,MainActivity.class);
        intent.putExtra("code",s);
        startActivity(intent);
    }
}
