package kevoh3.example.com.addingtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //FIELDS
    Button add;
    EditText Fnum,Snum;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ASSIGN IDS
                Fnum =(EditText)findViewById(R.id.editText1);
                Snum=(EditText)findViewById(R.id.editText2);

        sum=(TextView)findViewById(R.id.tvSum);

        add=(Button)findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(Fnum.getText().toString());
                int num2=Integer.parseInt(Snum.getText().toString());
                int total=num1+num2;
                sum.setText(Integer.toString(total));

            }
        });
    }
}
