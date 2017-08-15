package com.example.steivew.popmusic123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView paymentActivityText = (TextView) findViewById(R.id.payment_activity_description);
        String paymentText = getString(R.string.payment_activity_description);
        paymentActivityText.setText(paymentText);

        TextView backToHome = (TextView) findViewById(R.id.back_to_home_button);

        if (backToHome != null) {
            backToHome.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToHomeIntent = new Intent(PaymentActivity.this, MainActivity.class);
                    startActivity(backToHomeIntent);
                }
            });
        }
    }
}
