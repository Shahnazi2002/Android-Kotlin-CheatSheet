override fun onBackPressed() {
    // Create the object of AlertDialog Builder class
    val alertBuilder = AlertDialog.Builder(this)
    
    // Set the message
    alertBuilder.setMessage("Do you want to exit?")
    
    // Set the title
    alertBuilder.setTitle("Exit")
    
    // Set cancelable
    alertBuilder.setCancelable(false)
    
    // Set the positive button
    alertBuilder.setPositiveButton("Yes") { dialog, which ->
            finish()
        }
    
    // Set the negative button
    alertBuilder.setNegativeButton("No") { dialog, which ->
            dialog.cancel()
        }
    
    // Set neutral button
    alertBuilder.setNeutralButton("Rate") { dialog, which ->
        ...
        }
    
    // Create and show the Alert Dialog box
    val alertDialog = alertBuilder.create()
    alertDialog.show()
}
