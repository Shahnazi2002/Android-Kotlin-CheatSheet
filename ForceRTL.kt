// https://stackoverflow.com/a/74772405/18139991

fun forceRTLIfSupported() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
    }
}
