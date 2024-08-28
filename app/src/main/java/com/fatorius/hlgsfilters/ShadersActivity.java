package com.fatorius.hlgsfilters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class ShadersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaders);

        ImageView imageView = findViewById(R.id.image_view);

        // Receber o caminho do arquivo
        String imagePath = getIntent().getStringExtra("image_path");
        if (imagePath != null) {
            // Carregar o Bitmap a partir do arquivo
            File imgFile = new File(imagePath);
            if (imgFile.exists()) {
                Bitmap bitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                imageView.setImageBitmap(bitmap);
            }
        }
    }
}