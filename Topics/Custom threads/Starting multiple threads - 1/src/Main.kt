fun main() {
    // create instances and start threads here
    val w1 = WorkerThread("worker-1")
    val w2 = WorkerThread("worker-2")
    w1.start()
    w2.start()

}

// Don't change the code below
class WorkerThread(name: String) : Thread(name) {
    val numberOfLines = 3

    override fun run() {
        val name = currentThread().name

        if (!name.startsWith("worker-")) {
            return
        }

        for (i in 0 until numberOfLines) {
            println("do something...")
        }
    }
}