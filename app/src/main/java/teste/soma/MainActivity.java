package teste.soma;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.text.util.Linkify;
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
            public void onClick(View v) {
                Double n1=Double.parseDouble(txtNum1.getText().toString());
                Double n2=Double.parseDouble(txtNum2.getText().toString());
                if(txtNum1.getText().length()==0 || txtNum2.getText().length()==0) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);
                    dialogo.setTitle("Alerta:");
                    dialogo.setMessage("\nSão necessários 2 números!");
                    dialogo.setNeutralButton("Voltar", null);
                    dialogo.show();
                }
                    Double res=n1+n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double n1=Double.parseDouble(txtNum1.getText().toString());
                Double n2=Double.parseDouble(txtNum2.getText().toString());
                if(txtNum1.getText().length()==0 || txtNum2.getText().length()==0) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);
                    dialogo.setTitle("Alerta:");
                    dialogo.setMessage("\nSão necessários 2 números!");
                    dialogo.setNeutralButton("Voltar", null);
                    dialogo.show();
                }
                    Double res = n1 * n2;
                    String Resultado = new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double n1=Double.parseDouble(txtNum1.getText().toString());
                Double n2=Double.parseDouble(txtNum2.getText().toString());
                if(txtNum1.getText().length()==0 || txtNum2.getText().length()==0) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);
                    dialogo.setTitle("Alerta:");
                    dialogo.setMessage("\nSão necessários 2 números!");
                    dialogo.setNeutralButton("Voltar", null);
                    dialogo.show();
                }
                    Double res=n1 - n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double n1=Double.parseDouble(txtNum1.getText().toString());
                Double n2=Double.parseDouble(txtNum2.getText().toString());
                if(txtNum1.getText().length()==0 || txtNum2.getText().length()==0) {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(teste.soma.MainActivity.this);
                    dialogo.setTitle("Alerta:");
                    dialogo.setMessage("\nSão necessários 2 números!");
                    dialogo.setNeutralButton("Voltar", null);
                    dialogo.show();

                }
                if (n2==0){
                    AlertDialog.Builder error = new AlertDialog.Builder(teste.soma.MainActivity.this);
                    error.setTitle("Erro");
                    error.setMessage("\nImpossivel Divisão por zero!\n");
                    error.show();
                    Result.setText("");
                    Result.setKeyListener(null);
                }
                else{
                    Double res=n1 / n2;
                    String Resultado=new Double(res).toString();
                    Result.setText(Resultado);
                    Result.setKeyListener(null);
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("http://www.github.com/RogerMonteiro124");
        Linkify.addLinks(textView, Linkify.WEB_URLS);
    }
}
