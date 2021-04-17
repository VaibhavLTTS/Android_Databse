package com.ltts.database


import android.os.AsyncTask
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log.i
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room


class Signin : AppCompatActivity() {
    lateinit var Name : EditText
    lateinit var Pass : EditText

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
      ): View? {
        var a = inflater.inflate(R.layout.activity_main, container, false)

        a.buttonRegister.setOnClickListener {

            Name = a.findViewById(R.id.editTextTextPersonName)
            Pass = a.findViewById(R.id.editTextTextPassword)

            var task1 = MyTask()
            task1.execute()
            Toast.makeText(MainActivity, "Data" , Toast.LENGTH_SHORT).show()

        }

        return a
    }


    inner class MyTask : AsyncTask<String?, Void?, String>() {
        lateinit var b :String
        lateinit var c : String

        var db = Room.databaseBuilder(MainActivity!!, ContactsContract.Contacts.Data::class.java, "Signindb") .fallbackToDestructiveMigration().build()

        override fun onPreExecute() {
            super.onPreExecute()
            b  = Name.text.toString()
            c = Pass.text.toString()


        }

        override fun doInBackground(vararg params: String?): String {
            var Signin = Entity()

            Signin.Name = b
            Signin.Pass = c


            db.Dao().insert()

            db.Dao().view() {
                Dao.i("My", "Name : " +i.Name +  " : and Pass is : ${i.Pass}")

            }

            return "Vaibhav"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)



        }
    }
}