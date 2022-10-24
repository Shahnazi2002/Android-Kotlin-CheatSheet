// Toasts Overview

val text = "Hello World!"
val duration = Toast.LENGTH_SHORT / Toast.LENGTH_LONG

val toast = Toast.makeText(applicationContext, text, duration)
toast.show()


// Example
Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show()
