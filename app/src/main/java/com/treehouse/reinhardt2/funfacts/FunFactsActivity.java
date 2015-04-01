package com.treehouse.reinhardt2.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        /** Dynamically Changing the Background Color **/
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                String fact = mFactBook.getFact();

                // X - THIS CODE HAS BEEN MOVED TO FactBook.java
                // XX - THIS CODE HAS BECOME AN ARRAY

                // Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        /**
        String message = "Yay! Our Activity was created!";
        Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        welcomeToast.show();
        **/
        // Make and show toast in one line instead of the above code
        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!");

    }
// XXX - ACTION BAR AND ...MENU BUT WE HAVE NO ACTION BAR
}


/** The Android Log
 *  Log.v() -- verbose when troubleshooting and want to put alot of info
 *  Log.d() -- debugging during development
 *  Log.i() -- informational events
 *  Log.w() -- for warnings
 *  Log.e() -- for errors
 */

/** Dynamically Changing the Background Color
    1.  Declare a member variable with the data type of Relative Layout.
        The format is just like our other member variables but with this
        other data type and a different name.

    2.  Set this member variable in the onCreate method just like the
        other member variables.

    3.  Where we set a new fun fact, call the 'setBackgroundColor()'
        method on this new variable. Use Color.RED as the parameter.
**/


// X - THIS CODE HAS BEEN MOVED TO FactBook.java
             /*   String[] mColors = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 206.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built.",
                        "Treehouse is not actually in a tree."};

                // The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random(); // Construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(mColors.length);

                fact = mColors[randomNumber];

                //fact = randomNumber + "";
             */
// XX - THIS CODE HAS BECOME AN ARRAY
                /* Convert the randomNumber to a text fact
                 * 0 = Ants stretch when they wake up in the morning.
                 * 1 = Ostriches can run faster than horses.
                 * 2 = Olympic gold medals are actually made mostly of silver.

                if (randomNumber == 0) {
                    fact = "Ants stretch when they wake up in the morning.";
                }
                else if (randomNumber == 1) {
                    // set fact equal to ants fact
                    fact = "Ostriches can run faster than horses.";
                }
                else if (randomNumber == 2) {
                    // set fact equal to ants fact
                    fact = "Olympic gold medals are actually made mostly of silver.";
                }
                else {
                    fact = "Sorry - there was an error. ";
                }
                */
// XXX - ACTION BAR AND ...MENU BUT WE HAVE NO ACTION BAR
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
