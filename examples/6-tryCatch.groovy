try {
    new FileInputStream("nonexistentfile")
} catch(FileNotFoundException ex) {
    // Do whatever you like about this exception here
    println "Oops: " + ex
}
