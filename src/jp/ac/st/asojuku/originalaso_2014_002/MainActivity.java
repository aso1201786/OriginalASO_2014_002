package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnMainte =(Button)findViewById(R.id.btnMainte);
		btnMainte.setOnClickListener(this);
		Button btnInsert =(Button)findViewById(R.id.btnInsert);
		btnInsert.setOnClickListener(this);
		Button btnCheck =(Button)findViewById(R.id.btnCheck);
		btnCheck.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch(v.getId()){
			case R.id.btnMainte:
				intent = new Intent(MainActivity.this, MaintenanceActivity.class);
				startActivity(intent);
				break;
			case R.id.btnInsert:
				break;
			case R.id.btnCheck:
				intent = new Intent(MainActivity.this, HitokotoActivity.class);
				startActivity(intent);
				break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
