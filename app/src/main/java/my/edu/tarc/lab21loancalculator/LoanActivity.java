package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoanActivity extends AppCompatActivity {
    public static final String PRICE = "LoanActivity.price";
    public static final String PAYMENT = "LoanActivity.payment";
    public static final String LOAN = "LoanActivity.loan";
    public static final String INTEREST = "LoanActivity.interest";
    EditText editTextPrice, editTextPayment, editTextLoan, editTextInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        editTextPrice = (EditText)findViewById(R.id.editTextPrice);
        editTextPayment = (EditText)findViewById(R.id.editTextPayment);
        editTextLoan = (EditText)findViewById(R.id.editTextLoan);
        editTextInterest = (EditText)findViewById(R.id.editTextInterest);

    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, LoanResultActivity.class);

        Double price, payment, interest;
        Integer loan;

        price = Double.parseDouble(editTextPrice.getText().toString());
        payment = Double.parseDouble(editTextPayment.getText().toString());
        loan = Integer.parseInt(editTextLoan.getText().toString());
        interest = Double.parseDouble(editTextInterest.getText().toString());

        intent.putExtra(PRICE, price);
        intent.putExtra(PAYMENT, payment);
        intent.putExtra(LOAN, loan);
        intent.putExtra(INTEREST, interest);

        startActivity(intent);

    }
}
