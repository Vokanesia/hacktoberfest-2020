fun main() {
    println("Hello World")
    showYourName("hafiz")
    showYourNameInLoop(0..5, "hafiz")
}

fun showYourName(name: String){
    print(name)
}

fun showYourNameInLoop(size: IntRange, name: String){
    for(i in size){
        println(name)
    }
}