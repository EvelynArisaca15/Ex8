package edu.ilp.appcuestionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //pre 1
        for (i in 50 downTo 1 step 2) {
            println("Valor en forma descendente de 2 en 2: $i")
        }
        //pre2
        fun factorialNumero() {

            val num = 50
            var factorialN: Long = 1
            for (i in 1..num) {
                factorialN *= i.toLong()
            }
            println("El factorial es $num = $factorialN")
        }

        //pre3
        fun triangulo(b:Int,h:Int):Int{
            return (b*h)/2;
        }

        //halla
        var trianguloValores = triangulo(25,50)
        println("El area  es : $trianguloValores")

}
}