package education.cccp.tp10contentprovider;

import static java.lang.String.format;
import static education.cccp.tp10contentprovider.ContractProvider.COL_CHAPITRE_DESCRIPTION;
import static education.cccp.tp10contentprovider.ContractProvider.COL_CHAPITRE_ID;
import static education.cccp.tp10contentprovider.ContractProvider.COL_CHAPITRE_NAME;
import static education.cccp.tp10contentprovider.ContractProvider.TABLE_CHAPITRE;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseSQLiteHelper extends SQLiteOpenHelper {
    public static final int VERSION = 1;


    public static final String CREATE_TABLE_CHAPITRE_TEMPLATE=
            "CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " %s TEXT NOT NULL, %s TEXT NOT NULL);";
    public static final String CREATE_TABLE_CHAPITRE =
            format(CREATE_TABLE_CHAPITRE_TEMPLATE,
                    TABLE_CHAPITRE,
                    COL_CHAPITRE_ID,
                    COL_CHAPITRE_NAME,
                    COL_CHAPITRE_DESCRIPTION);

    public DatabaseSQLiteHelper(@Nullable Context context,
                                @Nullable String name,
                                @Nullable SQLiteDatabase.CursorFactory factory,
                                int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
