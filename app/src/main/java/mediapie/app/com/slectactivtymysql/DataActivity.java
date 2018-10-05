package mediapie.app.com.slectactivtymysql;

import android.app.Activity;
import android.net.UrlQuerySanitizer;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataActivity extends Activity {

    TextView tv , tv3,tvtoken,tvdate,tvtime;
    ListView listView;
    private static final String url="jdbc:mysql://163.182.168.141:3306/admin_gistore";
    private static final String user="admin_imti";
    private static final String pass="qqkyf2fXx3";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        testDB();
    }




public void testDB()
{

    tv=(TextView)findViewById(R.id.textView);
    tv3 = (TextView)findViewById(R.id.tv3);
    tvtoken=(TextView)findViewById(R.id.tvtoken);
    tvdate= (TextView)findViewById(R.id.tvdate);
    tvtime=(TextView)findViewById(R.id.tvtime);

    //listView=(ListView)findViewById(R.id.lv1);
    try{
int count=0;
        StrictMode.ThreadPolicy policy=
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,pass);

        String result="Database connection success\n";
        Statement st=con.createStatement();
        ResultSet re= st.executeQuery("select * from queues where department_id=1 order by id desc limit 1 ");
        //order by id asc limit 5
        ResultSetMetaData rsmd = re.getMetaData();

        while(re.next()){
          //  result = rsmd.getColumnName(1)+ ":" + re.getInt(1) + "\n";
          //  tv.setText(result);
            //result += rsmd.getColumnName(2)+ ":" + re.getInt(2) + "\n";
           // result = rsmd.getColumnName(2)+ ":" + re.getInt(2) + "\n";
           // tv3.setText(result);

            result = re.getInt(3) + "\n";
            tvtoken.setText(result);

            //result= re.getInt(6)+"\n";
            //tvdate.setText(result);

            result = re.getDate(6)+"\n";
            tvdate.setText(result);

            result=re.getTime(6)+"\n";
            tvtime.setText(result);
            //System.out.println("The date is: " + text);



            count++;
        }
        /*if(re.next()==true) {
            result = rsmd.getColumnName(1) + ":" + re.getInt(1) + "\n";
            tv.setText(result);/////////////////////////////////////////////////////////////////////////////view in textview//////////////////////

            result = rsmd.getColumnName(2)+ ":" + re.getInt(2)+"\n";
            tv3.setText(result);/////////////////////////////////////////////////////////////////////////////view in textview//////////////////////

            result = re.getInt(3) + "\n";
            tvtoken.setText(result);/////////////////////////////////////////////////////////////////////////////view in textview//////////////////////

            result = re.getInt(5)+ "\n";
            tvdate.setText(result);




        }*/










    }


    catch (Exception e)
    {
        e.printStackTrace();
        tv.setText(e.toString());



    }

}
    }

