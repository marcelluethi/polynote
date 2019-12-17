package polynote.kernel.interpreter

import polynote.kernel.interpreter.python.PythonInterpreter
import polynote.kernel.interpreter.scal.{JavaInterpreter, ScalaInterpreter}

class CoreInterpreters extends Loader {
  override def factories: Map[String, Interpreter.Factory] = Map(
    "scala" -> ScalaInterpreter.Factory,
    "python" -> PythonInterpreter.Factory,
    "java" -> JavaInterpreter.Factory
  )
}
