package mediapie.app.com.slectactivtymysql;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner spin;
    Button GOTO;
    String[] SPINNERVALUES={"Gulshan","Awami","Bahadurabad"};
    String SpinnerValues;
    Intent intent;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

spin=(Spinner)findViewById(R.id.spinner1);
GOTO =(Button)findViewById(R.id.btn1);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,SPINNERVALUES);

        spin.setAdapter(adapter);//pass above adapter values into spinner

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                SpinnerValues=(String)spin.getSelectedItem();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {



            }
        });

        GOTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (SpinnerValues){

                    case "Gulshan":
                        intent= new Intent(MainActivity.this,GulshanActivity.class);
                        startActivity(intent);
                        break;

                    case "Awami":
                        intent= new Intent(MainActivity.this,AwamiMarkazActivity.class);
                        startActivity(intent);
                        break;

                    case "Bahadurabad":
                        intent= new Intent(MainActivity.this,BahadurabadActivity.class);
                        startActivity(intent);
                        break;

                }

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("Proceeding");
                progressDialog.setMessage("Loading....Please Wait");
                progressDialog.show();



            }

        });


}}
