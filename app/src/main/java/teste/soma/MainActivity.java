package teste.soma;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNum1;
    EditText txtNum2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1=(EditText) findViewById(R.id.num1);
        txtNum2=(EditText) findViewById(R.id.num2);
        btn1=(Button) findViewById(R.id.btnsum);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Double n1=Double.parseDouble(txtNum1.getText().toString());
                Double n2=Double.parseDouble(txtNum2.getText().toString());
                Double res=n1+n2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Resultado:");
                dialogo.setMessage("\nA soma de "+n1+" + "+n2+" é="+res);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
    }
}
