import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadorakotlin.R


class MainActivity(val tv: Int) : AppCompatActivity() {
    private var edit1: EditText? = null
    private var edit2: EditText? = null
    private var texto: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        edit1 = findViewById<View>(R.id.et1) as EditText?
        edit2 = findViewById<View>(R.id.et2) as EditText?
        texto = findViewById<View>(tv) as TextView?
    }

    fun Sumar(view: View?) {
        val num1: Int = edit1!!.getText().toString().toInt()
        val num2: Int = edit2!!.getText().toString().toInt()
        val resultado = num1 + num2
        texto!!.setText("la suma es: $resultado")
        limpiar()
    }

    fun Restar(view: View?) {
        val num1: Int = edit1!!.getText().toString().toInt()
        val num2: Int = edit2!!.getText().toString().toInt()
        val resultado = num1 - num2
        texto!!.setText("la resta es : $resultado")
        limpiar()
    }

    fun Multiplicar(view: View?) {
        val num1: Int = edit1!!.getText().toString().toInt()
        val num2: Int = edit2!!.getText().toString().toInt()
        val resultado = num1 * num2
        texto!!.setText("la multiplicacion es : $resultado")
        limpiar()
    }

    fun Dividir(view: View?) {
        val num1: Int = edit1!!.getText().toString().toInt()
        val num2: Int = edit2!!.getText().toString().toInt()
        val resultado = num1 / num2
        texto!!.setText("la dividir es : $resultado")
        limpiar()
    }

    fun limpiar() {
        edit1!!.setText("")
        edit2!!.setText("")
    }
}