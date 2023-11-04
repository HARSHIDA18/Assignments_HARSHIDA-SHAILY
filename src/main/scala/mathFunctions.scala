class Calculator
{
  def add(a:Int,b:Int):Int=a+b
  def subtract(a:Int,b:Int):Int={
    if   (a>b) a-b else b-a
  }
  def multiplication(a:BigInt,b:BigInt)=a*b

  def  division(a:Double,b:Double):Double={
    if   (b==0) 0.0
    else a/b
  }
  def modulus(a:Int,b:Int):Int={
    a%b
  }

}
object mathFunctions extends App{
  val calc=new Calculator
  println((calc.add(10,20)))
  println((calc.subtract(10,20)))
  println((calc.multiplication(10,20)))
  println((calc.division(10,20)))
}

