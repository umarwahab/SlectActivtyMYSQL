package mediapie.app.com.slectactivtymysql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BahadurabadActivity extends AppCompatActivity {

    Button tokenbtn, confirmbtn;
    boolean checkedittext;
    String DateTimeHolder;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahadurabad);

        confirmbtn=( Button)findViewById(R.id.confirm);
        tokenbtn=(Button)findViewById(R.id.tokbtn1);

        time=(EditText)findViewById(R.id.editTime);
        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                tokenbtn.setEnabled(true);

            }
        });

    }
}
