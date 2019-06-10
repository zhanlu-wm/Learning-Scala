1. Scala中的变量分两种：val和var，val变量与Java的final变量类似，var变量与Java的非final变量类似
    ```scala
        val word1 = "who"  //类型推断
        var word2 = "are"  //类型推断
        //word1 = "you" //错误，val变量不允许重新赋值
        word2 = "?"
    ```

1. Java中的i++和++i在Scala中不适用
2. 如果函数字面量只是一个接收单个参数的语句，可以不必给出参数名和参数本身：
    ```scala
        val words = List("who", "are", "you", "?")
        words.foreach(println)
    ```
3. for表达式中的遍历到的变量(word)的类型为val：
    ```scala
        val words = List("who", "are", "you", "?")
        for(word <- words)
            println(word)
    ```
