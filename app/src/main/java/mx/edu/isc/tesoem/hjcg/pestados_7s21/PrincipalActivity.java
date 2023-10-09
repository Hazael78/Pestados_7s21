package mx.edu.isc.tesoem.hjcg.pestados_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    Spinner splista;
    ImageView ivimagen;
    List<String> Milista = new ArrayList<>(Arrays.asList("","Durango", "Jalisco", "Nayarit", "Zacatecas", "Puebla","Estado de Mexico", "Aguascalientes", "Baja california sur", "Baja California Norte", "Campeche", "Chiapas", "Chihuaha", "Ciudad de Mexico", "Coahuila", "Colima", "Guanajuato", "Guerrero", "Hidalgo", "Michoacan", "Morelos", "Nuevo Leon", "Oaxaca", "Queretaro", "Quintana roo", "San luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        //Milista.add("Estado de Mexico");

        ivimagen = findViewById(R.id.ivimagen);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Milista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                //Glide.with(ivimagen).load("https://fastly.picsum.photos/id/237/536/354.jpg?hmac=i0yVXW1ORpyCZpQ-CknuyV-jbtU7_x9EBQVhvT5aRr0").into(ivimagen);
                if (i == 1) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1nDb-3OE_BjlJhjH8GOiQJIkId4DbEpv5").into(ivimagen);
                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1F1wfRQFfVWd2oANZQfxJs1qtNtGuPedC").into(ivimagen);
                } else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1FYXjUseMp-SR-3i-Iy69ebxB0uOJX8Vy").into(ivimagen);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1DqQgncQivrdTtTwH_l74lTMBv_S1QV-q").into(ivimagen);
                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=15cE0JKA7Y9_sz-HifIgFqPprZeZrH8dy").into(ivimagen);
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1fkGoUX4KLY3IfuwXCFkygiiULW6wsaCr").into(ivimagen);
                } else if (i == 7){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1xD4UwMYHRU_jrx2HFi3MoXTdO0XaYMpU").into(ivimagen);
                }else if (i == 8){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Ax1vPJ3Ypr6vU6glhV9NI1Pskyk3WJ_C").into(ivimagen);
                }else if (i == 9){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1TTgx1kWMNlxqF0_Uruagff6d7E60zQxZ").into(ivimagen);
                }else if (i == 10){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1X7D-ntETdPtpTFncWw0b3tFpX5RkTM2d").into(ivimagen);
                }else if (i == 11){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1HnHt1aTEBN95wAbFlwtryw8PeeWwQc3b").into(ivimagen);
                }else if (i == 12){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1ru2vVnGn9bEjGsodCMFnjDbngiyJcxty").into(ivimagen);
                }else if (i == 13){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Spetg8A8BeyGWUAX6YiwpU8KroEjSpau").into(ivimagen);
                }else if (i == 14){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1RzWmaJCZrJzxH0pK79rikx5exZ3C-fK0").into(ivimagen);
                }else if (i == 15){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1yv3eAjaWLUTatVUEyRy-ZHMvmoShJ6-Z").into(ivimagen);
                }else if (i == 16){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1PvV85BNh5v2iP-hQtLd9voxENRlsl8DN").into(ivimagen);
                }else if (i == 17){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1X7e4O44Nq5uSTk1z3vOZ80FoDDNjE8S1").into(ivimagen);
                }else if (i == 18){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1x4nEXz-gAOFcjuRAcJzSEGH5u8qgBL0i").into(ivimagen);
                }else if (i == 19){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Knm9xjmx7eJLIv1lR8BCy-80xIHwmTiB").into(ivimagen);
                }else if (i == 20){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1FZ7hGATbnQAaMVVOfvv6xlJ81uWOZ0um").into(ivimagen);
                }else if (i == 21){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1eh0eHh_YpJ9ybURbs_6HreMai3TDHB4Z").into(ivimagen);
                }else if (i == 22){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1nn6m1pGExRP1XvJIFjUO4VnhinIgkmCy").into(ivimagen);
                }else if (i == 23){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1SkxQ65vTQHN8vTIK_9TVxAMgVT-zBAjF").into(ivimagen);
                }else if (i == 24){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1UgSKJt6G8ERTfoqkVvkTGaj-ZJAl2g7X").into(ivimagen);
                }else if (i == 25){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1hZxu5z8g5nMPJZtyObb6EfBpvr5Sa1mg").into(ivimagen);
                }else if (i == 26){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1VqNiBf7Eh25LtbJOiftz1_7Yzb_AO-8m").into(ivimagen);
                }else if (i == 27){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1sfG06HvyYFX3TUwVWZvAchfzviVACxOx").into(ivimagen);
                }else if (i == 28){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1xFO4eDKKz2aViUmf2EHf10kRijpDgNdM").into(ivimagen);
                }else if (i == 29){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1L6ydZ6AQLDGS0NcKPSXtFQgnzEbtGe-3").into(ivimagen);
                }else if (i == 30){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1HVO1EbmDZsiDF0kSK5kpf6V_38eMhm0i").into(ivimagen);
                }else if (i == 31){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1rtpxVjHvjCfA6O6HyAjpDbtQ4LPPjT-L").into(ivimagen);
                }else if (i == 32){
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1K_rE_-kGkkKkmv_LX1qIiVp6uNaYLGNl").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}