// We marked the TheUnique class with the annotation to generate the static getInstance() method
// Since we set the value for the lazy property to true, Groovy delays the creation of the instance until requested.
@Singleton(lazy = true)
class TheUnique {
    private TheUnique() { println 'Instance created' }
    def hello() { println 'hello' }
}

println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()
