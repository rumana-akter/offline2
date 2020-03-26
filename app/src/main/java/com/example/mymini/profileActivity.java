package com.example.mymini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView=(ImageView)findViewById(R.id.imageViewId);
        textView=(TextView)findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String name = bundle.getString("name");
            showDetails(name);

        }
    }
    void showDetails(String name)
    {
        if(name.equals("harry"))
        {
            imageView.setImageResource(R.drawable.harry);
            textView.setText(R.string.harry_text);
        }
        if(name.equals("hermione"))
        {
            imageView.setImageResource(R.drawable.hermione);
            textView.setText(R.string.hermione_text);
        }
        if(name.equals("ron"))
        {
            imageView.setImageResource(R.drawable.ron);
            textView.setText(R.string.ron_text);
        }
    }
}
