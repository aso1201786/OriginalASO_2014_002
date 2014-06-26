package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;

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

		if(sdb == null){
			helper = new MySQLiteOpenHelper(getApplicationContext());
		}
		try{
			sdb = helper.getWritableDatabase();
		}catch(SQLiteException e){
			return;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch(v.getId()){
			case R.id.btnInsert:
				EditText etv = (EditText)findViewById(R.id.edtMsg);
				String inputMsg = etv.getText().toString();
				if(inputMsg != null && !inputMsg.isEmpty()){
					helper.insertHitokoto(sdb, inputMsg);
				}
				etv.setText("");
				break;
			case R.id.btnMainte:
				intent = new Intent(MainActivity.this, MaintenanceActivity.class);
				startActivity(intent);
				break;
			case R.id.btnCheck:
				String strHitokoto = helper.selectRandomHitokoto(sdb);
				intent = new Intent(MainActivity.this,HitokotoActivity.class);
				intent.putExtra("Hitokoto",strHitokoto);
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
