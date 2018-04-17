package com.example.bupt.ex11;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView5);
        editText = (EditText)findViewById(R.id.editText6);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message").toString().trim();
        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String result = editText.getText().toString().trim();
                Intent intent = new Intent();
                intent.putExtra("result", result);
                setResult(1001, intent);
                finish();
            }
        });
    }
}
