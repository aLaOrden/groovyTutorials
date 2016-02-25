// Java like
for (int i = 0; i < 3; i++) {
    print i
}
println ''

// range like
for (j in 0..2) {
    print j
}
println ''

// upto like
0.upto(2) {
    print "$it" // don't works with sigle quote
}
println ''

// times like
3.times {
    print "$it" // don't works with sigle quote
}
println ''
