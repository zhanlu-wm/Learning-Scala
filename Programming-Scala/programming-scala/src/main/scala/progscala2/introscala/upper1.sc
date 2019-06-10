class Upper {
    def upper(strings: String*): Seq[String] = {
        strings.map((s: String) => s.toUpperCase())
    }
}

val up = new Upper
up.upper("Hello", "World").foreach(printf("%s ", _))
println("")