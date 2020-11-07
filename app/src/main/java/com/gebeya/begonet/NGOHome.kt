package com.gebeya.begonet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.gebeya.begonet.framework.base.BaseActivity
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.activity_n_g_o_home.*

class NGOHome : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n_g_o_home)

        projectDescriptionDialog()
        projectTitleDialog()
        laborDialog()
        professionalsDialog()
        socialWorkersDialog()
        monetaryDialog()
        trainerDialog()
        visibilityItemDialog()
        qty1Dialog()
        qty2Dialog()
        qty3Dialog()

        joinedMembers.setOnClickListener {

            val intent = Intent(this, Volunteers::class.java)
            startActivity(intent)
        }
    }
    private fun projectTitleDialog(){
        editProjectTitle.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit your project title")
                setPositiveButton("Save"){dialog, which ->
                    projectTitle.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun projectDescriptionDialog(){
        editProjectDescription.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit your project description")
                setPositiveButton("Save"){dialog, which ->
                    description.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun laborDialog(){
        labor.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    labor.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun professionalsDialog(){
        professionals.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    professionals.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun socialWorkersDialog(){
        socialWorkers.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    socialWorkers.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun monetaryDialog(){
        monetaryResource.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    monetaryResource.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun trainerDialog(){
        trainers.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    trainers.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun visibilityItemDialog(){
        visibilityItems.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the resource required")
                setPositiveButton("Save"){dialog, which ->
                    visibilityItems.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun qty1Dialog(){
        qty1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the quantity")
                setPositiveButton("Save"){dialog, which ->
                    qty1.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun qty2Dialog(){
        qty2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the quantity")
                setPositiveButton("Save"){dialog, which ->
                    qty2.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun qty3Dialog(){
        qty3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Edit the quantity")
                setPositiveButton("Save"){dialog, which ->
                    qty3.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }
}