package com.gebeya.begonet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        showEditTextDialog()
        showEditName()

        backArrow.setOnClickListener {

            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("InflateParams")
    private fun showEditTextDialog(){
        editDescription.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Write a short text about you")
                setPositiveButton("Save"){dialog, which ->
                    aboutVolunteer.text = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("Edit Profile", "Cancel Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }

    private fun showEditName(){
        profileName.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            return@setOnClickListener with(builder){
                setTitle("Write a your full name")
                setPositiveButton("Save"){dialog, which ->
                    profileName.text = editText.text.toString()
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