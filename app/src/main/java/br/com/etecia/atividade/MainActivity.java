package br.com.etecia.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar os componentes utilizados
    EditText edtlogin, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando os componentes
        edtlogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        //Eventos de clique
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login = edtlogin.getText().toString();
                String senha = edtSenha.getText().toString();

                if(login.equals("eteccia") && senha.equals("etec123")){
                   //abrindo outra janela
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos"+ edtlogin, Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

    public void acessarJanela(View view) {


    }
}