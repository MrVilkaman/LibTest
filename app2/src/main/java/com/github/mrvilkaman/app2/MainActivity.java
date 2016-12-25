package com.github.mrvilkaman.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String asd = AppClass.MY_TAG +LibClass1.MY_TAG + LibClass2.MY_TAG;

	}
}
