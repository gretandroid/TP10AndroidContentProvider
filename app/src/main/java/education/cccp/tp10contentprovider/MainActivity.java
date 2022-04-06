package education.cccp.tp10contentprovider;

import static education.cccp.tp10contentprovider.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }

    public void insertChapitre() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContractProvider.COL_CHAPITRE_NAME,
                );
    }
}