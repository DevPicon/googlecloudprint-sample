package pe.devpicon.android.mycloudprintapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openPdf(View view) {
        Uri docUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ibt_writing_sample_responses);
        String docMimeType = "application/pdf";
        // the final result adopts this name as filename
        String docTitle = "My title";

        Intent printIntent = new Intent(this, PrintDialogActivity.class);
        printIntent.setDataAndType(docUri, docMimeType);
        printIntent.putExtra("title", docTitle);
        startActivity(printIntent);
    }

    public void openPdfKotlin(View view) {
        Uri docUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ibt_writing_sample_responses);
        String docMimeType = "application/pdf";
        // the final result adopts this name as filename
        String docTitle = "My file Kotlin";

        Intent printIntent = new Intent(this, PrintDialogActivity.class);
        printIntent.setDataAndType(docUri, docMimeType);
        printIntent.putExtra("title", docTitle);
        startActivity(printIntent);
    }
}
