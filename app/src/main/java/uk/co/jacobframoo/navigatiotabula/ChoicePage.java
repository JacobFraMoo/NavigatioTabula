package uk.co.jacobframoo.navigatiotabula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ChoicePage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] locations = {"Restaurant", "Bar/Pub/Club", "Library/Book Shop", "Gym", "Takeaway/Fast Food"};
    String[] distances = {"500 meter", "1 Kilometer", "2 kilometer's", "5 Kilometer's"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_page);

        //Button for getting to the Map page
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ChoicePage.this, MapsActivity.class));
            }
        });

        //Spinner for selecting somewhere on the map.
        Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
        spin1.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,locations);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);

        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        spin2.setOnItemSelectedListener(this);

        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, distances);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(bb);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}