package education.cccp.tp10contentprovider;

import static java.lang.Long.parseLong;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContractProvider extends ContentProvider {
    public static final String DB_NAME = "chapitre.db";
    public static final String TABLE_CHAPITRE = "table_chapitre";
    public static final String COL_CHAPITRE_ID = "chapitre_id";
    public static final String COL_CHAPITRE_NAME = "chapitre_name";
    public static final String COL_CHAPITRE_DESCRIPTION = "chapitre_description";



    // Récupère la derniere partie de l'URI
    // (content://education.cccp.tp9contentprovider.PersonContentProvider/#)
    public long getId(Uri uri) {
        String lastPathSegment = uri
                .getLastPathSegment();
        if (lastPathSegment != null)
            return parseLong(lastPathSegment);
        return -1;
    }


    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri,
                        @Nullable String[] strings,
                        @Nullable String s,
                        @Nullable String[] strings1,
                        @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri,
                      @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri,
                      @Nullable String s,
                      @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri,
                      @Nullable ContentValues contentValues,
                      @Nullable String s,
                      @Nullable String[] strings) {

        return 0;
    }
}
