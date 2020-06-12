package pt.ipg.covidtrack2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class SqliteOpenHelper extends SQLiteOpenHelper {
    public static final String NOME_BASE_DADOS = "covid.db";
    private static final int VERSAO_BASE_DADOS = 1;

    public SqliteOpenHelper(@Nullable Context context) {
        super(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        new BdtableRegistos(db).cria();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}