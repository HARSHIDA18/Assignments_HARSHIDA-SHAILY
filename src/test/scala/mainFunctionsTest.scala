object mainFunctionsTest {
  val calculator=new Calculator
  def addTest():Unit={
    var actual:Int=12
    var result:Int=calculator.add(10,2)
    assert(actual==result)
  }
  def subtractTest():Unit={
    assert(calculator.subtract(9,10)==1)
    assert(calculator.subtract(100,99)==1)
    assert(calculator.subtract(89,78)==11)
  }

  def multiplicationTest():Unit={
    assert(calculator.multiplication(10,0)==0)
    assert(calculator.multiplication(90,10356)==932040)
    assert(calculator.multiplication(98,100)==9800)
  }
  def divisionTest():Unit={
    assert(calculator.division(8.0,0.0)==0.0)
    assert(calculator.division(9.0,3.0)==3.0)
    assert(calculator.division(10.0,4.0)==2.5)
  }
  def modulusTest():Unit={
    var expected:Int=10
    var actual:Int=calculator.modulus(120,12)
    assert(expected==actual)

  }
  def main(args:Array[String]):Unit={
    addTest()
    subtractTest()
    multiplicationTest()
    divisionTest()
  }
}
