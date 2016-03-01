class Worker {
    def work() { println 'get work done' }
    def analyze() { println 'analyze...' }
    def writeReport() { println 'get report written' }
}
class Expert {
    def analyze() { println "expert analysis..." }
}
class Manager {
    @Delegate Expert expert = new Expert()
    @Delegate Worker worker = new Worker()
}
def bernie = new Manager()
bernie.analyze() // expert was called first
bernie.work()
bernie.writeReport()
