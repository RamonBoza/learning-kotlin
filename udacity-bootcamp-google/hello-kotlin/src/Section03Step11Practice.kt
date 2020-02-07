fun main(args: Array<String>){
    check(canAddFish(10.0, listOf(3,3,3))== false)
    check(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    check(canAddFish(9.0, listOf(1,1,3), 3)==false)
    check(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations:Boolean = true) : Boolean {

    val emptySpace = calculateTankSpaceForFish(tankSize,hasDecorations) - calculateCurrentFishSpaceOccupied(currentFish)
    return emptySpace >= fishSize
}

fun calculateCurrentFishSpaceOccupied(currentFish: List<Int>): Int {
    return currentFish.sum()
}

fun calculateTankSpaceForFish(tankSize: Double, hasDecorations: Boolean): Double {
    if(hasDecorations) {
        return tankSize * 0.8
    }
    return tankSize
}
