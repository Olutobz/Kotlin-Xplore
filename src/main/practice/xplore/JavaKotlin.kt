package main.practice.xplore

class SomeClass : SomeInterface<String> {
    override fun doSomething(data: String) {
        println(data)
    }
}

class SomeClassTwo : SomeInterfaceTwo<List<String>> {
    override fun doSomething(data: List<String>) {
        for (item in data) {
            println(item)
        }
    }
}

class InExampleUSage : InExample<String> {
    override fun acceptValue(value: String) {
        println(value)
    }
}

class OutExampleUsage : OutExample<String> {
    override fun returnValue(): String = "Damola Onikoyi"
}