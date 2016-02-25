// el código no corre

def revert (str) {
    // reemplaza -> if (str != null) { str.reverse() }
    str?.reverse()
}
println revert ('evil')
println revert (null)
