def conComas(n) {
    assert n >= 0
    def s = n.toString()
    def f = s.size() % 3
    for (i in 0..(s.size() - 2)) {
        print s[i]
        if (i%3 == (f - 1)) {
            print ','
        }
    }
    println s[s.size()-1]
}

conComas(12045670)
