package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

/**
 * endi kara nima qilamiz
 * terminalda
 * man git file larni statusini kurmokchiman
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    int quantity = 0;
    public void submitOrder(View view) {

        displayMessage(createorderSummary());
    }
    /**
     * Calculates the price of the order.
     *
     *
     */
    private String createorderSummary()
    {

        String ordername = "Jeck Ma";

        String b1 = "Name : " + ordername + "\n";
        String b2 = "Quantity : " + quantity + " finjon \n";
        String total = "Total :  $" + calculatePrice() + "\n";
        String obsh = b1 + b2 + total + "Thank you!";
        return obsh;
    }

    private int calculatePrice() {

        int price = quantity * 5;
        return price;
    }

    public void increment(View view)
    {
        quantity++;
        displayQuantity(quantity);
    }

    public void decriment(View view)
    {
        quantity--;
        displayQuantity(quantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numeric) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numeric);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {

        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);



    }

}


