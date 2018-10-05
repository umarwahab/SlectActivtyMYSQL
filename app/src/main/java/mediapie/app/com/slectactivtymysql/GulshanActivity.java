package mediapie.app.com.slectactivtymysql;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class GulshanActivity extends AppCompatActivity {

    Button tokenbtn, confirmbtn;
    boolean checkedittext;
    String DateTimeHolder;
    public EditText time;
    Calendar mycalendar = Calendar.getInstance();
   // EditText editText =(EditText)findViewById(R.id.editText);

    //Databse start here
    private static final String url="jdbc:mysql://163.182.168.141:3306/admin_gistore";
    private static final String user="admin_imti";
    private static final String pass="qqkyf2fXx3";



    EditText editText;
    TextView tv ,ctime,tresult ,intvlres;
    public String al;



public String ftime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulshan);

       // final EditText arival=(EditText)findViewById(R.id.editText);
        //final EditText current=(EditText)findViewById(R.id.editText2);

        confirmbtn=( Button)findViewById(R.id.confirm);
        tokenbtn=(Button)findViewById(R.id.tokbtn1);





            tv= (TextView)findViewById(R.id.textView2);
            confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View view) {
                //tv.setText("Your Selected time: "+al);//selected time show in textview
testDB();

                }
                });



    }


    public void testDB() {

        time=(EditText)findViewById(R.id.editTime);


        ctime = (TextView) findViewById(R.id.curenttext);
        tresult=(TextView)findViewById(R.id.timresult);
        intvlres=(TextView)findViewById(R.id.tv6);
        //String time1="09:00 AM";
        //String time2="10:00 AM";
       // SimpleDateFormat format= new SimpleDateFormat("h:mm a");
        /*try {
            Date d1= format.parse(time1);
            Date d2=format.parse(time2);
            long timeDiff= d2.getTime()-d1.getTime();
            tresult.setText((timeDiff / 3600000) + " hour/s " + (timeDiff % 3600000) / 60000 + " minutes");

        } catch (ParseException e) {
            e.printStackTrace();
        }*/


        // tv3 = (TextView) findViewById(R.id.tv3);
        //tvtoken = (TextView) findViewById(R.id.tvtoken);
        //tvdate = (TextView) findViewById(R.id.tvdate);
        //tvtime = (TextView) findViewById(R.id.tvtime);

        //listView=(ListView)findViewById(R.id.lv1);
        try {
            int count = 0;
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            ///********************Time Divide Start Here**************************
           /* String time1="09:00 AM";
            String time2="10:00 AM";
            int interval=10;

            String finalresult;
            int intervalresult;
            int fnal;
            int akhri;
            SimpleDateFormat format= new SimpleDateFormat("h:mm a");
            Date d1= format.parse(time1);
            Date d2=format.parse(time2);
            long timeDiff= d2.getTime() - d1.getTime();
            //tresult.setText((timeDiff / 3600000) + " hour/s " + (timeDiff % 3600000) / 60000 + " minutes");
            finalresult = ((timeDiff / 3600000) + " hour/s " + (timeDiff % 3600000) / 60000 + " minutes");//time show
            //tv.setText(finalresult);//differnece show horahai





         int a = Integer.parseInt(finalresult);//String to int

            fnal=a*60;
            akhri=fnal/interval;
            tv.setText(akhri+"kitne number aayenge itni dair mein");


*/





            //intervalresult = a % 10;
            //System.out.println("Your Answer is : " + intervalresult);




           // interval=Integer.parseInt(finalresult);
            //intervalresult=interval/10;
            //intvlres.setText(intervalresult);



            //ab interval /10 krna hai



            //finalresult = al;
            //interval = tresult/10;
            ///********************Time Divide Start Here**************************


            //int a = time.getText().toString();




           // "SELECT * FROM queues WHERE department_id=1 AND updated_at > CURDATE();
String timear;
            String result = "Database connection success\n";
            Statement st = con.createStatement();
            ResultSet re = st.executeQuery("SELECT * FROM queues WHERE department_id=1 AND number < 2000 ");
            //order by id asc limit 5
            ResultSetMetaData rsmd = re.getMetaData();

            while (re.next()) {
                //  result = rsmd.getColumnName(1)+ ":" + re.getInt(1) + "\n";
                //  tv.setText(result);
                //result += rsmd.getColumnName(2)+ ":" + re.getInt(2) + "\n";
                // result = rsmd.getColumnName(2)+ ":" + re.getInt(2) + "\n";
                // tv3.setText(result);

                result = re.getTime(5) + "\n";
                 ctime.setText(result);
                 timear=result;


                //result= re.getInt(6)+"\n";
                //tvdate.setText(result);

              //  result = re.getDate(6) + "\n";
               // tvdate.setText(result);


               // result = re.getTime(6) + "\n";
                //tvtime.setText(result);
                //System.out.println("The date is: " + text);


                count++;
            }
            //tresult.setText(result);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            //tv.setText(e.toString());



        }


    }}

