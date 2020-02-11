package Section04Exercises

open class Book(val title:String, val author:String) {

    var currentPage = 0

    open fun readPage() {
        currentPage++;
    }
}


class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}