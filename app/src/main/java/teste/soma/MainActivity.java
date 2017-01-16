package teste.soma;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText txtNum1;
    EditText txtNum2;
    private EditText Result;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1=(EditText) findViewById(R.id.num1);
        txtNum2=(EditText) findViewById(R.id.num2);
        Result=(EditText)findViewById(R.id.txtres);
        btn1=(Button) findViewById(R.id.btnsum);
        btn2=(Button) findViewById(R.id.btnmul);
        btn3=(Button) findViewById(R.id.btnsub);
        btn4=(Button) findViewById(R.id.btndiv);
        Result.setKeyListener(null);
        btn1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {Double n1=Double.parseDouble(txtNum1.getText().toString());
                    Double n2=Double.parseDouble(txtNum2.getText().toString());
                    Double res=n1+n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);
                    //AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);

                    /*dialogo.setTitle("Resultado:");
                    dialogo.setMessage("\nA soma de "+n1+" + "+n2+" é = "+res);
                    dialogo.setNeutralButton("SAIR",null);
                    dialogo.show();*/
                }
            });
            btn2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Double n1=Double.parseDouble(txtNum1.getText().toString());
                    Double n2=Double.parseDouble(txtNum2.getText().toString());
                    Double res=n1*n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);
                    /*
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);

                    dialogo.setTitle("Resultado:");
                    dialogo.setMessage("\nA Multiplicação de "+n1+" * "+n2+" é = "+res);
                    dialogo.setNeutralButton("SAIR",null);
                    dialogo.show();*/
                }
            });
            btn3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Double n1=Double.parseDouble(txtNum1.getText().toString());
                    Double n2=Double.parseDouble(txtNum2.getText().toString());
                    Double res=n1-n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);
                    /*
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);

                    dialogo.setTitle("Resultado:");
                    dialogo.setMessage("\nA Subtração de "+n1+" - "+n2+" é = "+res);
                    dialogo.setNeutralButton("SAIR",null);
                    dialogo.show();*/
                }
            });
            btn4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Double n1=Double.parseDouble(txtNum1.getText().toString());
                    Double n2=Double.parseDouble(txtNum2.getText().toString());
                    if (n2==0){
                        AlertDialog.Builder error = new AlertDialog.Builder(teste.soma.MainActivity.this);
                        error.setTitle("Erro");
                        error.setMessage("\nImpossivel Divisão por Zero\n");
                        error.show();
                    }else {
                        Double res = n1 / n2;
                        String Resultado=new Double(res).toString();
                        Result.setText(Resultado);
                        Result.setKeyListener(null);
                        /*AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);

                        dialogo.setTitle("Resultado:");
                        dialogo.setMessage("\nA Divisão de " + n1 + " / " + n2 + " é = " + res);
                        dialogo.setNeutralButton("SAIR", null);
                        dialogo.show();*/
                    }
                }
            });
        }
    }
