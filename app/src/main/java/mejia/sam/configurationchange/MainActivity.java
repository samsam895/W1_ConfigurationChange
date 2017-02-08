package mejia.sam.configurationchange;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.tv));
        et = ((EditText) findViewById(R.id.et));
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, et.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                String s = et.getText().toString();
                i.putExtra("MIOss",s);
                startActivity(i);
            }
        });
    }

    public void btn(View view) {
    }


//    public void onDo (View view){
//        tv.setText(et.getText().toString());
//    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//    }
}
