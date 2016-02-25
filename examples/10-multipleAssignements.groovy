// Bond, James Bond
def splitName(fullName) { fullName.split(' ') }
def (firstName, lastName) = splitName('James Bond')
println "$lastName, $firstName $lastName"

// intercambiar variables
def name1 = "Thomson"
def name2 = "Thompson"
println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"

// Tom and Jerry
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

// Tom, Jerry and null
def (first, second, third) = ['Tom', 'Jerry']
println "$first, $second, and $third"
