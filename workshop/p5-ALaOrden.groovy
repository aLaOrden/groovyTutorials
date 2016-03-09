def primes(n) {
    if (n < 2) return []
    def list = [true]*(n-1)
    for (i in 2..Math.floor(Math.sqrt(n))) {
        if (list[i - 2]) {
            for (int j = i**2; j < n; j += i) {
                list[j - 2] = false
            }
        }
    }
    for (x in 0..(list.size() - 2)) {
        if (list[x]) {
            print x + 2 + ' '
        }
    }
    println ''
}

primes(12)
