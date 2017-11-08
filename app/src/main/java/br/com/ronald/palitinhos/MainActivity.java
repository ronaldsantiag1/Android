package br.com.ronald.palitinhos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2, edit3, edit4;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        edit3 = (EditText)findViewById(R.id.edit3);
        edit4 = (EditText)findViewById(R.id.edit4);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int ap1 = Integer.parseInt(edit2.getText().toString());
                int num2 = Integer.parseInt(edit3.getText().toString());
                int ap2 = Integer.parseInt(edit4.getText().toString());
                int AP;
                AP = ap1+ap2;
                if(num1 ==AP){  //if (nome1.equals(nome2))){  //if (nome1.equals(nome2))
                    AlertDialog.Builder dialogo = new
                            AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Quem acertou foi o primeiro jogador !");
                    dialogo.setMessage("A soma é " +AP);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();

                }
              else if(num2 == AP){
                    AlertDialog.Builder dialogo = new
                            AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Quem acertou foi o segundo jogador !");
                    dialogo.setMessage("A soma é " +AP);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();

                }

                else{
                    AlertDialog.Builder dialogo = new
                            AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("TENTE NOVAMENTE !");
                    dialogo.setMessage("Tente mais uma vez ");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }

            }
        });

    }
}
