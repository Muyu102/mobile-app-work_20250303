package com.example.c11211242

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.editTextNumberDecimal)
        val input2 = findViewById<EditText>(R.id.editTextNumberDecimal2)

        val buttonArea = findViewById<Button>(R.id.button)  // 計算面積按鈕
        val buttonCurrency = findViewById<Button>(R.id.button2)  // 計算匯率按鈕

        val resultText = findViewById<TextView>(R.id.editTextNumberDecimal3)  // 顯示結果

        buttonArea.setOnClickListener {
            val length = input1.text.toString().toDoubleOrNull()
            val width = input2.text.toString().toDoubleOrNull()

            if (length != null && width != null) {
                val area = length * width
                resultText.text = getString(R.string.result_area, area)
            }
        }

        buttonCurrency.setOnClickListener {
            val twd = input1.text.toString().toDoubleOrNull()

            if (twd != null) {
                val usd = twd / 31.0  // 1 USD = 31 TWD
                resultText.text = getString(R.string.result_currency, usd)
            }
        }
    }
}
