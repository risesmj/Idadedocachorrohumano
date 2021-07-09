package idadecachorro.estagiariopleno.com.idadedocachorrohumano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoConfirmar;
    private EditText editarTexto;
    private TextView textoResultado;

    public int calcularIdade(int idade){
        return idade=idade*7;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoConfirmar = (Button) findViewById(R.id.botaoConfirmarId);
        editarTexto = (EditText) findViewById(R.id.editarTexto);
        textoResultado = (TextView) findViewById(R.id.textoResultado);

        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoCapturado  = editarTexto.getText().toString();

                if (textoCapturado.isEmpty()){
                    textoResultado.setText("Por favor, digite um número.");
                }else{
                    int idade = Integer.parseInt(textoCapturado);
                    textoResultado.setText("Idade: " + calcularIdade(idade));
                }
            }
        });

    }

}
