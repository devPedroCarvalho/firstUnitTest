package app.devpedrocarvalho.firstunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0,0.1)
        val netTax = tax.calculateTax(100.0,0.1)

        Log.v("RESULT", "$netIncome")
        Log.v("RESULT", "$netTax")

    }
}