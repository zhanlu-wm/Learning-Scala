object Upper {
    def upper(strings: String*): Seq[String] = {
        strings.map(_.toUpperCase())
    }
}

Upper.upper("Hello", "World").foreach(printf("%s ", _))
println("")
