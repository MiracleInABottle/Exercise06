package brianbiggs.exercise06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_layout);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("numbers");

        String num1 = intent.getStringExtra("int1");
        String num2 = intent.getStringExtra("int2");
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

        TextView t1 = (TextView)findViewById(R.id.textViewNumOne);
        t1.setText(num1);
        TextView t2 = (TextView)findViewById(R.id.textViewNumTwo);
        t2.setText(num2);
        TextView r = (TextView)findViewById(R.id.textViewResult);
        r.setText(Integer.toString(sum));

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }





}
