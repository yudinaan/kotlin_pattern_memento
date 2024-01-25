class Carataker (){
    private val mementoList = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        mementoList.add(memento)
    }

    fun getMemento(index: Int): Memento? {
        return if (index in 0 until mementoList.size) {
            mementoList[index]
        } else {
            null
        }
    }
}