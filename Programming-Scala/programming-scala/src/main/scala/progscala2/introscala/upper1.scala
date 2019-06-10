package progscala2.introscala

object Upper {
    def main(args: Array[String]) = {
        args.map(_.toUpperCase()).foreach(printf("%S ", _))
        println("")
    }
}
