package sri.mobile.components

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}



@js.native
@JSImport("react-native","StatusBar")
object StatusBarComponent extends JSComponent[StatusBarProps] {
  def setHidden(hidden:Boolean,animation:js.Any = ???): Unit = js.native
  def setBarStyle(style:js.Any,animated:Boolean = ???): Unit = js.native
  def setBackgroundColor(color:String,animated:Boolean = ???): Unit = js.native
  def setNetworkActivityIndicatorVisible(visible:Boolean): Unit = js.native
  def setTranslucent(translucent:Boolean): Unit = js.native
}


@ScalaJSDefined
trait StatusBarProps extends js.Object {
  val backgroundColor: js.UndefOr[String] = js.undefined
  val translucent: js.UndefOr[Boolean] = js.undefined
  val animated: js.UndefOr[Boolean] = js.undefined
  val barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  val networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  val showHideTransition: js.UndefOr[StatusBarShowHideTransition] = js.undefined
  val hidden: js.UndefOr[Boolean] = js.undefined
}



@js.native
trait StatusBarStyle extends js.Object

object StatusBarStyle {
 @inline def DEFAULT =  "default".asInstanceOf[StatusBarStyle]
 @inline def LIGHT_CONTENT =  "light-content".asInstanceOf[StatusBarStyle]
 @inline def DARK_CONTENT =  "dark-content".asInstanceOf[StatusBarStyle]
}


@js.native
trait StatusBarShowHideTransition extends js.Object

object StatusBarShowHideTransition {
  @inline def FADE =  "fade".asInstanceOf[StatusBarShowHideTransition]
  @inline def SLIDE =  "slide".asInstanceOf[StatusBarShowHideTransition]
  @inline def NONE =  "none".asInstanceOf[StatusBarShowHideTransition]
}
