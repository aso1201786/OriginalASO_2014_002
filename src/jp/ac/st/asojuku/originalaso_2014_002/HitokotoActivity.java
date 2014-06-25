package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HitokotoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hitokoactivity);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Intent intent = this.getIntent();

		String strHitokoto = intent.getStringExtra("Hitokoto");

		TextView txvHITOKOTO = (TextView)findViewById(R.id.txvHITOKOTO);
		txvHITOKOTO.setText(strHitokoto);
	}


}
