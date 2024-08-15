package com.example.imagefrominternet;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.graphics.PictureKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView=findViewById(R.id.imageFilterView);
        imageView2=findViewById(R.id.imageFilterView2);

        String uri="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
        String uri1="https://cookieandkate.com/images/2023/10/pumpkin-mac-and-cheese-768x1152.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.placeholder).into(imageView);
        Picasso.get().load(uri1).placeholder(R.drawable.placeholder).into(imageView2);

    }
}