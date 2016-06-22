package dragonisdesignapp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method m = menu.getClass().getDeclaredMethod(
                        "setOptionalIconsVisible", Boolean.TYPE);
                m.setAccessible(true);
                m.invoke(menu, true);
            } catch (NoSuchMethodException e) {
                Log.e("INFO", "onMenuOpened", e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        View view = item.getActionView();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Item1) {

            Toast.makeText(getApplicationContext(), "Kliknieto w Item 1", Toast.LENGTH_LONG).show();
            startActivity(new Intent(getApplicationContext(), DetailsActivity.class));

        }
        if (id == R.id.Item2) {
            Toast.makeText(getApplicationContext(), "Kliknieto w Item 2", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Item3) {
            Toast.makeText(getApplicationContext(), "Kliknieto w Item 3", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Item4) {
            Toast.makeText(getApplicationContext(), "Kliknieto w Item 4", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
