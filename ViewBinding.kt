// Enabling View Binding
// In module-level build.gradle file, add the following code to enable view binding:

android {
    ...
    buildFeatures {
        viewBinding true
    }
}


// Using View Binding in Activities:

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        ...
    }
}


// Using View Binding in Dialogs:

fun showDialog() {
    val dialog: DialogBinding = DialogBinding.inflate(LayoutInflater.from(this))
    val alertDialog = AlertDialog.Builder(this).setView(dialog.root).create()
    
    ...
    
    alertDialog.show()
}


// Using View Binding in RecyclerView Adapter:

https://github.com/Shahnazi2002/Android-Kotlin-Samples/blob/main/RecyclerView/MyAdapter.kt
