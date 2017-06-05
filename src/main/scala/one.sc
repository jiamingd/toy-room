trait HList{}

case class HCons[H, T <: HList](head: H, tail: T) extends HList {

  override def toString = head + " :: " + tail

  def ::[T](t : T) : Unit = HCons(t, this)
}

object HNil extends HList {

}

