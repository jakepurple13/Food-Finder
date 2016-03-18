package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends Activity {


    final String FRIDGE = "Fridge";
    final String FREEZER = "Freezer";
    final String PANTRY = "Pantry";

    final String CURRENT = "Current";
    final String OUTOF = "Out Of";
    final String ALL = "All";
    final String REMIND = "Remind to Pick Up";

    TabHost th;
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        th = (TabHost) findViewById(R.id.tabHost);
        lv = (ListView) findViewById(R.id.listView);



        th.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

                if(tabId.equals(CURRENT)) {
                    //change data to what's current

                } else if(tabId.equals(OUTOF)) {
                    //change data to what the user is out of

                } else if(tabId.equals(ALL)) {
                    //change to everything

                } else if(tabId.equals(REMIND)) {
                    //change to reminder

                }

            }
        });




    }
}
