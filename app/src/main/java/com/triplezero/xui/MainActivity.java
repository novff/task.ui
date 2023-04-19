package com.triplezero.xui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.triplezero.xui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Переменная для хранения binding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // "Раздувание" разметки
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        // Связывание активности с биндингом
        setContentView(binding.getRoot());

        List<ListEntity> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            strings.add(
                    new ListEntity(
                            "хуй",
                            "Э{SDF{SD{FSD{F{SDF{SD{F{SD",
                            "выеби коня"
                    )
            );

        Adapter adapter = new Adapter(this, strings);

        binding.recyclerView
                .setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
    }
}