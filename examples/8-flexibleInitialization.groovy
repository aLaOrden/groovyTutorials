/*
The access() method receives three parameters, but if the first parameter is a Map we can float around the map’s key-values in the argument list. In the first call to the access() method, we placed the values for the map, followed by the value for weight and the value for fragile. The arguments for the map can be moved further down in the arguments list if we desire, like in the second call to the access() method.
If the number of arguments we send is greater than the number of parameters the method expects and if the excess arguments are name-value pairs, then Groovy assumes the method’s first parameter is a Map and groups all the name-value pairs in the arguments together as values for the first parameter. It then takes the rest of the arguments, in the presented order, as values for the remaining parameters, as we saw in the output.
*/
class Robot {
    def type, height, width
    def access(location, weight, fragile) {
        println "Received fragile? $fragile, weight: $weight, loc: $location"
    }
}
robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"
robot.access(x: 30, y: 20, z: 10, 50, true)
//You can change the order
robot.access(50, true, x: 30, y: 20, z: 10)
