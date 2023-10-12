fun main() {
    // create threads and start them using the class RunnableWorker
    val w1 = Thread(RunnableWorker(), "worker-1")
    val w2 = Thread(RunnableWorker(), "worker-2")
    val w3 = Thread(RunnableWorker(), "worker-3")
    w1.start()
    w2.start()
    w3.start()


}

// Don't change the code below       
class RunnableWorker : Runnable {
    override fun run() {
        val name = Thread.currentThread().name
        if (name.startsWith("worker-")) {
            println("too hard calculations...")
        } else {
            return
        }
    }
}