package at.fh.swengb.twinparadox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText yearsText;
    private EditText age1Text;
    private EditText age2Text;
    private TextView resultCalc;
    private TextView problemText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yearsText = (EditText) findViewById(R.id.years);
        age1Text = (EditText) findViewById(R.id.age1);
        age2Text = (EditText) findViewById(R.id.age2);
        resultCalc = (TextView) findViewById(R.id.resultCalc);

        //HALLO
    }


    public void calcAge (View view) {

        Double years = Double.parseDouble(yearsText.getText().toString());
        Double age1 = Double.parseDouble(age1Text.getText().toString());
        Double age2 = Double.parseDouble(age2Text.getText().toString());

        if (years > 100) {
            resultCalc.setText("Please enter realistic values! :(");
        } else {

            Double afterSpace = years * 0.8 + age2;
            Double afterEarth = years + age1;
            resultCalc.setText("After " + years + " years, brother 1, who stays at the earth, is " + afterEarth + " years old and brother 2, who was in space the last " + years + " years, is " + afterSpace + " years old.");
        }

    }

}
