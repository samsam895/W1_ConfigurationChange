package mejia.sam.configurationchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.tvmn2);

        Bundle extras = getIntent().getExtras();
        if(extras !=null) {
            String value = extras.getString("MIOss");
            tv.setText(value);
        }
    }
}
