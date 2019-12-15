package ru.daryas.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    EditText input_nn, input_mm;
    TextView st11, st12, st21, st22, textTitle;
    Button cal;
    String n, m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nn = findViewById(R.id.n);
        input_mm = findViewById(R.id.m);
        st11 = findViewById(R.id.textView1);
        st12 = findViewById(R.id.textView2);
        st21 = findViewById(R.id.textView3);
        st22 = findViewById(R.id.textView4);
        cal = findViewById(R.id.calculate);

        textTitle = findViewById(R.id.textTitle);



        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_nn.getText().toString().length()==0)
                {

                }
                else {
                    n = input_nn.getText().toString();

                    m = input_mm.getText().toString();

                    main(Integer.parseInt(m), Integer.parseInt(n));
                }
            }
        });

    }
     public  void main(int m, Integer n) {

            if (m > n) {
                Toast.makeText(this, "m не должен быть > n!", Toast.LENGTH_LONG).show();
            }else if(n>10)
            {
                Toast.makeText(this, "n должен быть < 10!", Toast.LENGTH_LONG).show();

            }
            else if(m==0)
            {Toast.makeText(this, "m не должен быть = 0!", Toast.LENGTH_LONG).show();}
            else {

                // Creating an empty Stack
                Stack<String> stack = new Stack<String>();
                Stack<String> stackNew = new Stack<String>();

                // Use add() method to add elements in the Stack
                stack.add("1");
                stack.add("2");
                stack.add("3");
                stack.add("4");
                stack.add("5");
                stack.add("6");
                stack.add("7");
                stack.add("8");
                stack.add("9");
                stack.add("10");

                // Output the Stack
                st11.setText("Stack: " + stack);
                //System.out.println("Stack: " + stack);

                // Remove the element using remove()
                Integer i;
                int len = stack.size();
                while (len != n) {
                    stackNew.add(stack.pop());
                    len--;
                }
                while (len != m - 1) {
                    stack.pop();
                    len--;
                }
                while (len != 0) {
                    stackNew.add(stack.pop());
                    len--;
                }
                len = stackNew.size();
                while (len != 0) {
                    stack.add(stackNew.pop());
                    len--;
                }
                // Print the final Stack
                st21.setText("Final Stack: " + stack);
                // System.out.println("Final Stack: "     + stack);
            }
        }
    }



