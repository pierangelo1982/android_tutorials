package com.example.pierangelo.a07numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }


        public boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;

            while (triangularNumber < number) {
                x++;
                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {
                return true;
            } else  {
                return false;
            }
        }
    }

    public void testNumber(View view) {

        String message = ""; // per toast

        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty()) {

            message = "Inserisci un numero!";

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isSquare()) {

                if (myNumber.isTriangular()) {

                    message = myNumber.number + " è entrambi, sia trinagolare che quadrato";

                } else {

                    message = myNumber.number + " è quadrato ma non triangolare";

                }

            } else {

                if (myNumber.isTriangular()) {

                    message = myNumber.number + " è triangolare ma non quadrato";

                } else {

                    message = myNumber.number + " non è ne triangolare ne quadrato";

                }

            }

        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
