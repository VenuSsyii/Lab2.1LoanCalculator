package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoanResultActivity extends AppCompatActivity {
    TextView textViewPrice, textViewPayment, textViewLoan, textViewInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_result);

        textViewPrice = (TextView)findViewById(R.id.textViewPrice);
        textViewPayment = (TextView)findViewById(R.id.textViewPayment);
        textViewLoan = (TextView)findViewById(R.id.textViewLoan);
        textViewInterest = (TextView)findViewById(R.id.textViewInterest);

        Intent intent = getIntent();

        Double price = intent.getDoubleExtra(LoanActivity.PRICE,0.00);
        Double payment = intent.getDoubleExtra(LoanActivity.PAYMENT,0.00);
        Integer loan = intent.getIntExtra(LoanActivity.LOAN,0);
        Double interest = intent.getDoubleExtra(LoanActivity.INTEREST,0.00);

        textViewPrice.setText(getString(R.string.car_price)+" >> "+price);
        textViewPayment.setText(getString(R.string.down_payment)+" >> "+payment);
        textViewLoan.setText(getString(R.string.loan_period)+" >> "+loan);
        textViewInterest.setText(getString(R.string.interest_rate)+" >> "+interest);
    }

    public void closeMessage(View view){
        finish();
    }
}
