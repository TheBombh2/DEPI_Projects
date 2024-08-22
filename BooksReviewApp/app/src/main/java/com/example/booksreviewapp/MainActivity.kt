package com.example.booksreviewapp

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import com.example.booksreviewapp.databinding.ActivityMainBinding
import com.example.booksreviewapp.ui.theme.BooksReviewAppTheme

class MainActivity : ComponentActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val booksList = mutableListOf<Book>(
            Book("Angels","Ahmed",R.drawable.angels,1f),
            Book("Blood","Mohamed",R.drawable.blood,5f),
            Book("Humming","Belal",R.drawable.humming,2f),
            Book("Nostra","Elsayed",R.drawable.nostra,4f),
            Book("Solitude","Salem",R.drawable.solitude,4.5f),
            Book("Spirits","Amr",R.drawable.spirits,1f),
            Book("Sword","Ali",R.drawable.sword,1.3f),
        )

        val booksListAdapter = BooksListAdapter(booksList)
        binding.rvBooksList.adapter = booksListAdapter

        binding.toolbar.materialToolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.notifcation -> {
                    Toast.makeText(this,"Notification Clicked",Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        binding.toolbar.materialToolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }

        binding.navigationDrawer.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.reviews ->{
                    Toast.makeText(this,"Reviews Clicked",Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.favorite ->{
                    Toast.makeText(this,"Favorite Clicked",Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.search ->{
                    Toast.makeText(this,"Search Clicked",Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.profile ->{
                    Toast.makeText(this,"Profile Clicked",Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.settings ->{
                    Toast.makeText(this,"Settings Clicked",Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }
                else -> false
            }
        }



    }
}