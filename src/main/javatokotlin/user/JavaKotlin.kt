package main.javatokotlin.user

class JavaKotlin {
    fun main() {

//         System.out.println("My name is Olutoba");
        println("My name is Olutoba")

//         String name = "Olutoba Onikoyi";
//        final String otherName = "Damola Onikoyi";
        var name = "Olutoba Onikoyi"
        val otherName = "Damola Onikoyi"


//         String text = "First Line\n" +
//                      "Second Line\n" +
//                      "Third Line";
        val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()


//        In java
//         if (text != null) {
//          int length = text.length();
//        }
        text.let {
            val length = text.length
//             Or
//             val length = text?.length
        }

//         String str = "Java to Kotlin Guide";
//        String substr = "";
//
//        => print java
//        substr = str.substring(0, 4);
//        System.out.println("substring = " + substr);

//        => print kotlin
//        substr = str.substring(8, 14);
//        System.out.println("substring = " + substr);

        val str = "Java to kotlin Guide"
        //print java
        var substr = str.substring(0..3)
        println("substring $substr")
        // print kotlin
        substr = str.substring(8..13)
        println("substring $substr")

//        => In java
//        final int andResult  = a & b;
//        final int orResult   = a | b;
//        final int xorResult  = a ^ b;
//        final int rightShift = a >> 2;
//        final int leftShift  = a << 2;
//        final int unsignedRightShift = a >>> 2;


//        => In kotlin
//        val andResult  = a and b
//        val orResult   = a or b
//        val xorResult  = a xor b
//        val rightShift = a shr 2
//        val leftShift  = a shl 2
//        val unsignedRightShift = a ushr 2

//        => In java
//        if(object instanceOf Car) {
//                Car car = (Car) object
//                }
//
//        => In kotlin
//        if (object is Car) {
//            var car = object as car
//        var car = object // smart casting
//        }

//        => In java & kotlin
//        if(score >= 0 && score <= 300) {}
//        if(score in 0..300) {}

/*        => In java
          int score = 7;
          String grade;
          switch(score) {
                case 10:
                case 9:
                       grade = "Excellent";
                       break;
                case 8:
                case 7:
                case 6:
                       grade = "Good";
                       break;
                case 5:
                case 4:
                       grade = "OK";
                       break;
                case 3:
                case 2:
                case 1:
                       grade = "Fail"
                       break;
                default :
                         grade = "Fail"
          }
* */
        var score = 7
        var grade = when (score) {
            9, 10 -> "Excellent"
            in 6..8 -> "Good"
            4, 5 -> "OK"
            else -> "Fail"
        }

        /* For-loops in java

            for (int i = 1; i <= 10 ; i++) { }

            for (int i = 1; i < 10 ; i++) { }

            for (int i = 10; i >= 0 ; i--) { }

            for (int i = 1; i <= 10 ; i+=2) { }

            for (int i = 10; i >= 0 ; i-=2) { }

            for (Map.Entry<String, String> entry: map.entrySet()) { }

            */

        for (i in 1..10) {
        }

        for (i in 1 until 10) {
        }

        for (i in 10 downTo 0) {
        }

        for (i in 1..10 step 2) {
        }

        for (i in 10 downTo 0 step 2) {
        }

//        for (String item : collection) { }
//        for (item in collection) { }

//        for ((key, value) in map) { }

//        => In java
//        final List<Integer> listOfNumber = Arrays.asList(1,2,3,4);
//        final Map<Integer, String> keyValue = new HashMap<Integer, String>();
//        keyValue.put(1, "Olutoba");
//        keyValue.put(2, "Damola");
//        keyValue.put(3, "Onikoyi");

//        Java 9
//        final List<Integer> listOfNumber = List.of(1,2,3,4);
//        final Map<Integer, String> keyValue = Map.of(1, "Olutoba",
//                                                     2, "Damola",
//                                                     3, "Onikoyi");

        val listOfNUmber = listOf(1, 2, 3, 4)
        val keyValue = mapOf(1 to "Olutoba", 2 to "Damola", 3 to "Onikoyi")

        /* => Java 7 and below
        * for(Car car : cars) {
        *     System.out.println(car.speed);
        * }
        *
        * => Java 8+
        * cars.forEach(car -> System.out.println(car.speed));
        *
        * => Java 7 and below
        * for(Car car : cars) {
        *     if(car.speed > 100) {
        *     System.out.println(car.speed)
        *    }
        * }
        *
        * => Java 8+
        * cars.stream().filter(car -> car.speed > 100).forEach(car -> System.out.println(car.speed));
        * cars.parallelStream().filter(car -> car.speed > 100).forEach(car -> System.out.println(car.speed));
        *
        * */

        /* cars.forEach {
               println(it.speed)
            }

            cars.filter { it.speed > 100 }.forEach { println(it.speed) }

            => Kotlin 1.1+
            cars.stream().filter { it.speed > 100 }.forEach{ println(it.speed) }
            cars.parallelStream().filter { it.speed > 100 }.forEach{ println(it.speed) }
        *
        * */


    }

}