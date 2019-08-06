package br.com.etecia.quadrinhosbatman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] titulo = {"Batman - Xamã", "Batman e os homens monstro", "Batman e o monge louco", "Batman - O homem que ri",
            "Batman - Gótico", "Batman Veneno", "Batman Neve"};
    int[] imagens = {R.drawable.xama, R.drawable.batman_e_os_homens_monstro, R.drawable.batman_e_o_monge_louco,
            R.drawable.batman_e_o_homem_que_ri, R.drawable.gotico, R.drawable.veneno, R.drawable.neve};
    int[] descricao = {R.string.des_xama, R.string.des_homens_monstro, R.string.monge_louco, R.string.o_homem_que_ri, R.string.gotico, R.string.veneno, R.string.neve};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstQuadrinhos);


    }
}
