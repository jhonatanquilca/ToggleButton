package com.example.togglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ActividadPrincipal extends Activity implements OnCheckedChangeListener {
ToggleButton tgb1;
ImageView iv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad_principal);
		
		tgb1=(ToggleButton)this.findViewById(R.id.tgbtn1);
		iv1=(ImageView)this.findViewById(R.id.ivImagen);
		
		tgb1.setOnCheckedChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad_principal, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		if(tgb1.isChecked()){
			iv1.setImageResource(R.drawable.lluvia);
		}else{
			iv1.setImageResource(R.drawable.logo);
		}
	}

}
