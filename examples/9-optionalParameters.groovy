// toma base como 10 si no se especifica
def log(x, base=10) {
    Math.log(x) / Math.log(base)
}
println log(1024)
println log(1024, 10)
println log(1024, 2)

// agrega al array cualquier otro parámetro
def task(name, String[] details) {
    println "$name - $details"
}
task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '231-546-0987'
task 'Check Mail'
