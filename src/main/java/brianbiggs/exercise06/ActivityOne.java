package brianbiggs.exercise06;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        final EditText e1 = (EditText) findViewById(R.id.editTextNumOne);
        final EditText e2 = (EditText) findViewById(R.id.editTextNumTwo);

        Button add = (Button) findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);

                Bundle b = new Bundle();

                intent.putExtra("numbers",b);
                intent.putExtra("int1",e1.getText().toString());
                intent.putExtra("int2",e2.getText().toString());

                startActivity(intent);
                e1.setText(null);
                e2.setText(null);
            }
        });
    }


}
