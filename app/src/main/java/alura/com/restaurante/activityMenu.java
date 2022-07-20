package alura.com.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class activityMenu extends AppCompatActivity {

    private int cont = 0;
    private TextView contagem;
    private TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        contagem = findViewById(R.id.activity_textview_contagem);
        number = findViewById(R.id.number);

        if (cont == 0 ){
            contagem.setText("Ninguém");
        }
        if (cont == 0 ){
            number.setText("0");
        }

        Button prox = findViewById(R.id.activity_btn_prox);
        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont<16) {
                    cont++;
                }
                atualizaView();
            }
        });

        Button ant = findViewById(R.id.activity_btn_ant);
        ant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont>0) {
                    cont--;
                }
                atualizaView();
            }
        });
    }
    public void atualizaView(){
        number.setText(Integer.toString(cont));
        if (cont < 8 ){
            contagem.setText("Próximo");
        }else{
            contagem.setText("Anterior");
        }
    }
}