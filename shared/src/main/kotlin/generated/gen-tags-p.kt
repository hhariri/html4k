package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes), CoreAttributeGroupFacade {
    var value : String
        get()  = attributeStringf320f1e5.get(this, "value")
        set(newValue) {attributeStringf320f1e5.set(this, "value", newValue)}

    var name : String
        get()  = attributeStringf320f1e5.get(this, "name")
        set(newValue) {attributeStringf320f1e5.set(this, "name", newValue)}


}

public class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var max : String
        get()  = attributeStringf320f1e5.get(this, "max")
        set(newValue) {attributeStringf320f1e5.set(this, "max", newValue)}

    var value : String
        get()  = attributeStringf320f1e5.get(this, "value")
        set(newValue) {attributeStringf320f1e5.set(this, "value", newValue)}


}

