package th.ac.su.pimnipa.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lega = findViewById<EditText>(R.id.lega)
        val legb = findViewById<EditText>(R.id.legb)
        val btn = findViewById<Button>(R.id.btn)
        val valueC = findViewById<TextView>(R.id.valueC)



        btn.setOnClickListener() {

            var a: Int = lega.text.toString().toInt()
            var b: Int = legb.text.toString().toInt()

            var c = ((a*a) + (b*b)).toDouble()

            valueC.text = "C = " + c.toString()
        }



    }
}