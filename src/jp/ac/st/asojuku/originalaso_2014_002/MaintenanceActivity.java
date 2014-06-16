package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaintenanceActivity extends Activity implements View.OnClickListener{



	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch(v.getId()){
		case R.id.btnBack:
			intent = new Intent(MaintenanceActivity.this, MainActivity.class);
			startActivity(intent);
			break;
		case R.id.btnDelete:
			break;
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenanceactivity);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnBack =(Button)findViewById(R.id.btnBack);
		btnBack.setOnClickListener(this);
		Button btnDelete =(Button)findViewById(R.id.btnDelete);
		btnDelete.setOnClickListener(this);
	}


}
