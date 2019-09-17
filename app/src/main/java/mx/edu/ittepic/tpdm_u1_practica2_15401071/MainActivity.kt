package mx.edu.ittepic.tpdm_u1_practica2_15401071

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var editRen:EditText?=null
    var editCeld:EditText?=null
    var radioVec:RadioButton?=null
    var radioMat:RadioButton?=null
    var lopciones:ListView?=null
    var celda:LinearLayout?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editRen = findViewById(R.id.celdillas)
        editCeld = findViewById(R.id.renglon)
        radioVec = findViewById(R.id.vector)
        radioMat = findViewById(R.id.matriz)
        celda = findViewById(R.id.renglones)


        lopciones?.setOnItemClickListener { adapterView, view, i, l ->

            when(i){
                0->InsertaDatos()
                1->AcercaDe()

            }
        }

    }

    fun InsertaDatos(){

        if(radioVec?.text.toString().isEmpty()==true){
            var mensaje = AlertDialog.Builder(this)
            mensaje.setTitle("ERROR").setMessage("campo vacio").show()
            return
        }

    }
    fun AcercaDe(){
        var mensaje = AlertDialog.Builder(this)
        mensaje.setTitle("Acerca de").setMessage("Zermeño Galvan Pablo").setPositiveButton("Cerrar")
        {dialog, which->}.show()
    }

}
