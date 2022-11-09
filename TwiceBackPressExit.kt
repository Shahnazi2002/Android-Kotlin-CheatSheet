// 1
class MainActivity : AppCompatActivity() {
    private var backPressedTime: Long = 0
    ...
    
    override fun onBackPressed() {
        if (backPressedTime + 3000 > System.currentTimeMillis()) {
            finish()
        } else {
            Toast.makeText(this, "Press BACK again to exit.", Toast.LENGTH_LONG).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}

// 2
class MainActivity : AppCompatActivity() {
    private var doubleBackPressed = false
    ...
    
    override fun onBackPressed() {
        if (doubleBackPressed) {
            finish()
        } else {
            Toast.makeText(this, "Press BACK again to exit.", Toast.LENGTH_LONG).show()
            doubleBackPressed = true
            Handler().postDelayed({ doubleBackPressed = false }, 3000)
        }
    }
