package com.greenpacker.greenpacker;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView ivA1;
    ImageView ivA2;
    ImageView ivA3;
    ImageView ivA4;
    ImageView ivA5;
    ImageView ivA6;
    ImageView ivA7;
    ImageView ivA8;
    TextView  tvA1;
    public boolean bA1 = false;
    public boolean bA2 = false;
    public boolean bA3 = false;
    public boolean bA4 = false;
    public boolean bA5 = false;
    public boolean bA6 = false;
    public boolean bA7 = false;
    public boolean bA8 = false;
    //spinner
    String[] WhoText;
    Integer[] WhoImage;
    String[] MonthText;
    Spinner spinner;
    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        ImageView ivA1 = (ImageView) findViewById(R.id.imageA1City);
        ImageView ivA2 = (ImageView) findViewById(R.id.imageA2Gastro);
        ImageView ivA3 = (ImageView) findViewById(R.id.imageA3Art);
        ImageView ivA4 = (ImageView) findViewById(R.id.imageA4Party);
        ImageView ivA5 = (ImageView) findViewById(R.id.imageA5History);
        ImageView ivA6 = (ImageView) findViewById(R.id.imageA6Beach);
        ImageView ivA7 = (ImageView) findViewById(R.id.imageA7Nature);
        ImageView ivA8 = (ImageView) findViewById(R.id.imageA8Active);
        Button buttonSearch = (Button) findViewById(R.id.buttonSearch);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListActivity();
            }
        });

        //spinner With Who
        WhoText = new String[]{"Alone", "Couple", "Friends", "Family"};
        WhoImage = new Integer[]{R.drawable.alone, R.drawable.couple3, R.drawable.friends, R.drawable.family2};
        spinner = (Spinner)findViewById(R.id.spinnerWithWho);
        //Use You Custom Adapter
        MyAdapterSpinner adapter = new MyAdapterSpinner(getApplicationContext(), R.layout.item_custom, WhoText, WhoImage);
        //Set Your Custom Adapter To Your Spinner
        spinner.setAdapter(adapter);

        //spinner Month
        MonthText = new String[]{"January","February","March","April", "May","June","July","August","September","October","November","December"};
        Spinner spinnerMonth = (Spinner) findViewById(R.id.spinnerMonth);
        // Create an ArrayAdapter
        MyAdapterSpinnerT adapterMonth = new MyAdapterSpinnerT(getApplicationContext(), R.layout.item_month, MonthText);
        spinnerMonth.setAdapter(adapterMonth);
        spinnerMonth.setSelection(2);


    }

    public void openListActivity() {
        Intent intentListActivity = new Intent(this, List.class);
        startActivity(intentListActivity);
    }


    //Standard cuccok
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //Standard cuccok vége


    public void changeBGColorA1 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA1City);
        TextView tvA = (TextView) findViewById(R.id.textA1City);
        if (bA1) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA1 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA1 = true;
        }
    }
    public void changeBGColorA2 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA2Gastro);
        TextView tvA = (TextView) findViewById(R.id.textA2Gastro);
        if (bA2) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA2 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA2 = true;
        }
    }
    public void changeBGColorA3 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA3Art);
        TextView tvA = (TextView) findViewById(R.id.textA3Art);
        if (bA3) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA3 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA3 = true;
        }
    }
    public void changeBGColorA4 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA4Party);
        TextView tvA = (TextView) findViewById(R.id.textA4Party);
        if (bA4) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA4 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA4 = true;
        }
    }
    public void changeBGColorA5 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA5History);
        TextView tvA = (TextView) findViewById(R.id.textA5History);
        if (bA5) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA5 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA5 = true;
        }
    }
    public void changeBGColorA6 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA6Beach);
        TextView tvA = (TextView) findViewById(R.id.textA6Beach);
        if (bA6) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA6 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA6 = true;
        }
    }
    public void changeBGColorA7 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA7Nature);
        TextView tvA = (TextView) findViewById(R.id.textA7Nature);
        if (bA7) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA7 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA7 = true;
        }
    }
    public void changeBGColorA8 (View v) {
        ImageView ivA = (ImageView) findViewById(R.id.imageA8Active);
        TextView tvA = (TextView) findViewById(R.id.textA8Active);
        if (bA8) {
            ivA.setBackgroundColor(0x0027ae60);
            tvA.setBackgroundColor(0x0027ae60);
            bA8 = false;
        } else {
            ivA.setBackgroundResource(R.color.colorPrimaryDark);
            tvA.setBackgroundResource(R.color.colorPrimaryDark);
            bA8 = true;
        }
    }

    //Spinner+Image
    protected class MyAdapterSpinner extends ArrayAdapter {

        Integer[] Image;
        String[] Text;

        public MyAdapterSpinner(Context context, int resource, String[] text, Integer[] image) {
            super(context, resource, text);
            Image = image;
            Text = text;
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.item_custom, parent, false);

            //Set Custom View
            TextView tv = (TextView)view.findViewById(R.id.textView);
            ImageView img = (ImageView) view.findViewById(R.id.imageView);

            tv.setText(Text[position]);
            img.setImageResource(Image[position]);

            return view;
        }

        @Override
        public View getDropDownView(int position,View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
    }


    //Spinner just Text
    protected class MyAdapterSpinnerT extends ArrayAdapter {
        String[] Text;

        public MyAdapterSpinnerT(Context context, int resource, String[] text) {
            super(context, resource, text);
            Text = text;
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.item_month, parent, false);

            //Set Custom View
            TextView tv = (TextView)view.findViewById(R.id.textView);

            tv.setText(Text[position]);

            return view;
        }

        @Override
        public View getDropDownView(int position,View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
    }




}
