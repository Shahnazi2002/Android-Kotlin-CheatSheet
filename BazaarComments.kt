binding.bazaarButton.setOnClickListener {
    val bazaarIntent = Intent(Intent.ACTION_EDIT, Uri.parse("bazaar://details?id=PACKAGE_NAME"))
    bazaarIntent.setPackage("com.farsitel.bazaar") // Usually optional
    try {
        startActivity(bazaarIntent)
    } catch (e: Exception) {
        Toast.makeText(this, "بازار بر روی دستگاه شما نصب نیست", Toast.LENGTH_SHORT).show()
    }
}

https://developers.cafebazaar.ir/fa/guidelines/feature/intent#Comments
