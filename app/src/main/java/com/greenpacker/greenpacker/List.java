package com.greenpacker.greenpacker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class List extends AppCompatActivity {
    private static final String TAG = "ListActivity";

    int[] imPlaces = {R.drawable.placekosice, R.drawable.placeprague, R.drawable.placevienna};
    int[] imTravelIcon = {R.drawable.nothing,  R.drawable.train, R.drawable.bus, R.drawable.car};
    int[] imActivityIcon = {R.drawable.nothing, R.drawable.city, R.drawable.gastro2, R.drawable.art, R.drawable.party2,
            R.drawable.history, R.drawable.beach, R.drawable.beach, R.drawable.nature,
            R.drawable.activ};
    String[] strNames = {"Kosice", "Prague", "Vienna"};
    String[] strTimes = {"3-5 hours", "3-6 hours", "2.5-4 hours"};
    String[] strCosts = {"€30-50", "€30-50", "€30-50"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //ez a 2. oldal listája
        ListView listview=(ListView)findViewById(R.id.ListSearchResult);
        ListSearchResultAdapter listsearchresultadapter = new ListSearchResultAdapter();
        listview.setAdapter(listsearchresultadapter);

        //ez vezérli hogy mi történik ha rákattintunk a lista egy elemére
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Log.d(TAG, "Erre kattintottál: " + strNames(position)) ;
                //Toast.makeText(List.this, "Erre kattintottál: " + strNames[position] , Toast.LENGTH_SHORT).show();
                openActivity3(position);
            }
        });
    }

    public void openActivity3(int position) {
        Intent intent = new Intent(this, LocationDetails.class);
        intent.putExtra("LOCATION", strNames[position]);
        startActivity(intent);
    }

    class ListSearchResultAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imPlaces.length;

        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.searchresultlayout,null);
            ImageView imageLocPic=(ImageView)convertView.findViewById(R.id.ivLocPic);
            TextView  textName=(TextView)convertView.findViewById(R.id.textViewListLocName);
            TextView  textCost=(TextView)convertView.findViewById(R.id.textViewListCost);
            TextView  textTime=(TextView)convertView.findViewById(R.id.textViewListTime);
            ImageView imIconActivity1=(ImageView)convertView.findViewById(R.id.ivListIconActivity1);
            ImageView imIconActivity2=(ImageView)convertView.findViewById(R.id.ivListIconActivity2);
            ImageView imIconActivity3=(ImageView)convertView.findViewById(R.id.ivListIconActivity3);
            ImageView imIconActivity4=(ImageView)convertView.findViewById(R.id.ivListIconActivity4);
            ImageView imIconActivity5=(ImageView)convertView.findViewById(R.id.ivListIconActivity5);
            ImageView imIconActivity6=(ImageView)convertView.findViewById(R.id.ivListIconActivity6);
            ImageView imIconTravel1=(ImageView)convertView.findViewById(R.id.ivListIconTravel1);
            ImageView imIconTravel2=(ImageView)convertView.findViewById(R.id.ivListIconTravel2);
            ImageView imIconTravel3=(ImageView)convertView.findViewById(R.id.ivListIconTravel3);

            imageLocPic.setImageResource(imPlaces[position]);
            textName.setText(strNames[position]);
            textCost.setText(strCosts[position]);
            textTime.setText(strTimes[position]);

            if (position == 0) {
                //Kosice
                imIconActivity1.setImageResource(imActivityIcon[1]);
                imIconActivity2.setImageResource(imActivityIcon[2]);
                imIconActivity3.setImageResource(imActivityIcon[5]);
                imIconActivity4.setImageResource(imActivityIcon[4]);
                imIconActivity5.setImageResource(imActivityIcon[0]);
                imIconActivity6.setImageResource(imActivityIcon[0]);
                imIconTravel1.setImageResource(imTravelIcon[1]);
                imIconTravel2.setImageResource(imTravelIcon[2]);
                imIconTravel3.setImageResource(imTravelIcon[3]);
            }
            else if (position == 1) {
                //Prague
                imIconActivity1.setImageResource(imActivityIcon[1]);
                imIconActivity2.setImageResource(imActivityIcon[2]);
                imIconActivity3.setImageResource(imActivityIcon[3]);
                imIconActivity4.setImageResource(imActivityIcon[4]);
                imIconActivity5.setImageResource(imActivityIcon[5]);
                imIconActivity6.setImageResource(imActivityIcon[0]);
                imIconTravel1.setImageResource(imTravelIcon[1]);
                imIconTravel2.setImageResource(imTravelIcon[2]);
                imIconTravel3.setImageResource(imTravelIcon[3]);
            }
            else if (position == 2) {
                //Vienna
                imIconActivity1.setImageResource(imActivityIcon[1]);
                imIconActivity2.setImageResource(imActivityIcon[2]);
                imIconActivity3.setImageResource(imActivityIcon[3]);
                imIconActivity4.setImageResource(imActivityIcon[4]);
                imIconActivity5.setImageResource(imActivityIcon[5]);
                imIconActivity6.setImageResource(imActivityIcon[0]);
                imIconTravel1.setImageResource(imTravelIcon[1]);
                imIconTravel2.setImageResource(imTravelIcon[3]);
                imIconTravel3.setImageResource(imTravelIcon[0]);
            }
            return convertView;
        }
    }

}
