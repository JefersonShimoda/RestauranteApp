package alura.com.restaurante;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activityPrincipal extends AppCompatActivity {

    public static final int capacidadeRestaurante = 10;
    private int contagemValor = 0;
    private TextView contagemTexto;
    private TextView capacidadeTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // Cria as Views
        capacidadeTexto = findViewById(R.id.textView3);
        contagemTexto = findViewById(R.id.textView2);

        // Diminui a contagem
        botaoAnterior();

        // Aumenta a contagem
        botaoProximo();
    }

    private void botaoProximo() {
        Button mais = findViewById(R.id.mais);
        mais.setOnClickListener(v -> {
                contagemValor++;
            atualizaView();
        });
    }

    private void botaoAnterior() {
        Button menos = findViewById(R.id.menos);
        menos.setOnClickListener(v -> {
            if(contagemValor > 0){
                contagemValor--;
            }
            atualizaView();
        });
    }

    public void atualizaView(){
        contagemTexto.setText(Integer.toString(contagemValor));
        if(contagemValor == 0){
            capacidadeTexto.setText("Ninguem!");
        }else if (contagemValor <= capacidadeRestaurante){
            capacidadeTexto.setText("Entre, por favor...");
        }else {
            capacidadeTexto.setText("Aguarde!");
        }
    }
}