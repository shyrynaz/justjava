/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.steve.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);

    }
    /**
     + * Calculates the price of the order.
     + *
     + * @param quantity is the number of cups of coffee ordered

     */
    private int calculatePrice() {
           int totalPrice= quantity * 5;
           return totalPrice;
        }
    private String createOrderSummary(int price){
        String priceMessage = "Name: Nazarene";
        priceMessage = priceMessage + "\nquantity:"  + quantity;
        priceMessage = priceMessage + "\nTotal: $" + price;
        priceMessage = priceMessage + "\nThank you";


        return priceMessage ;
    }
    /**
     * This method increases the quantity of coffee ordered
     */
    public void increment(View view){

              quantity = quantity + 1;
             displayQuantity(quantity);
    }

    /**
     * This method decreases the amount of coffee ordered
     */
    public void decrement(View view){
           quantity =quantity - 1;
        displayQuantity(quantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCups) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCups);

        }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}
