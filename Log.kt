// Write log messages
// The Log class allows you to create log messages that appear in logcat:
Log.e(TAG, msg: String) // Send an ERROR log message.
Log.w(TAG, msg: String) // Send a WARN log message.
Log.i(TAG, msg: String) // Send an INFO log message.
Log.d(TAG, msg: String) // Send a DEBUG log message.
Log.v(TAG, msg: String) // Send a VERBOSE log message.
// Tag can be any string that you find helpful, such as the name of the current class.

// A good convention is to declare a TAG constant in your class. For example:
private const val TAG = "StatsActivity"
