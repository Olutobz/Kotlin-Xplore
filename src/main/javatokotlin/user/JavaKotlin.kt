package main.javatokotlin.user

class JavaKotlin {
    fun main() {

//         System.out.println("My name is Olutoba");
        println("My name is Olutoba")

//         String name = "Olutoba Onikoyi";
//        final String otherName = "Damola Onikoyi";
        var name = "Olutoba Onikoyi"
        val otherName = "Damola Onikoyi"
//
//         String text = "First Line\n" +
//                      "Second Line\n" +
//                      "Third Line";
        val text = """
        |First Line
        |Second Line
        |Third Line
        """.trimMargin()

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
//        print java
//        substr = str.substring(0, 4);
//        System.out.println("substring = " + substr);

//        print kotlin
//        substr = str.substring(8, 14);
//        System.out.println("substring = " + substr);
        val str = "Java to kotlin Guide"
        var substr = ""

        //print java
        substr = str.substring(0..3)
        println("substring $substr")

        // print kotlin
        substr = str.substring(8..13)
        println("substring $substr")

//        final int andResult  = a & b;
//        final int orResult   = a | b;
//        final int xorResult  = a ^ b;
//        final int rightShift = a >> 2;
//        final int leftShift  = a << 2;
//        final int unsignedRightShift = a >>> 2;

//        val andResult  = a and b
//        val orResult   = a or b
//        val xorResult  = a xor b
//        val rightShift = a shr 2
//        val leftShift  = a shl 2
//        val unsignedRightShift = a ushr 2

//        if(object instanceOf Car) {
//                Car car = (Car) object
//                }
//
//        if (object is Car) {
//            var car = object as car
//        }


    }

}