package lr.iut.androiddialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun buttonClicked(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("My dialog title")
        builder.setMessage("Some very cool text")

        builder.setPositiveButton(R.string.yes) { dialog, which ->
            Toast.makeText(applicationContext, R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton(R.string.no) { dialog, which ->
            Toast.makeText(
                applicationContext,
                R.string.no, Toast.LENGTH_SHORT
            ).show()
        }

        builder.setNeutralButton(R.string.maybe) { dialog, which ->
            Toast.makeText(
                applicationContext,
                R.string.maybe, Toast.LENGTH_SHORT
            ).show()
        }
        builder.show()
    }
}