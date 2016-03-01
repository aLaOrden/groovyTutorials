def receiveVarArgs(int a, int... b) {
    println "You passed $a and $b"
}
def receiveArray(int a, int[] b) {
    println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2, 3, 4, 5)
