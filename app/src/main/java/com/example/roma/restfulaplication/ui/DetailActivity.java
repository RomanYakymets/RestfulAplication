package com.example.roma.restfulaplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roma.restfulaplication.R;
import com.example.roma.restfulaplication.model.helper.Constants;
import com.example.roma.restfulaplication.model.pojo.Flower;
import com.squareup.picasso.Picasso;


public class DetailActivity extends AppCompatActivity {
    private ImageView mPhoto;
    private TextView mName, mId, mCategory, mInstruction, mPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Flower flower = (Flower) intent.getSerializableExtra(Constants.REFERENCE.FLOWER);
        configViews();

        mId.setText(String.valueOf(flower.getProductId()));
        mName.setText(flower.getName());
        mCategory.setText(flower.getCategory());
        mInstruction.setText(flower.getInstructions());
        mPrice.setText(String.valueOf(flower.getPrice()));

        if (flower.isFromDatabase()) {
            mPhoto.setImageBitmap(flower.getPicture());
        } else {
            Picasso.with(getApplicationContext()).load(Constants.HTTP.PHOTO_URL + flower.getPhoto()).into(mPhoto);
        }
    }

    private void configViews() {
        mPhoto = (ImageView) findViewById(R.id.flowerPhoto);
        mName = (TextView) findViewById(R.id.flowerName);
        mId = (TextView) findViewById(R.id.flowerId);
        mCategory = (TextView) findViewById(R.id.flowerCategory);
        mInstruction = (TextView) findViewById(R.id.flowerInstruction);
        mPrice = (TextView) findViewById(R.id.flowerPrice);

    }
}
