package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class LABEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("label", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var for_ : String
        get()  = attributeStringf320f1e5.get(this, "for")
        set(newValue) {attributeStringf320f1e5.set(this, "for", newValue)}

    var form : String
        get()  = attributeStringf320f1e5.get(this, "form")
        set(newValue) {attributeStringf320f1e5.set(this, "form", newValue)}


}

public class LEGEND(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("legend", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class LI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("li", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var value : String
        get()  = attributeStringf320f1e5.get(this, "value")
        set(newValue) {attributeStringf320f1e5.set(this, "value", newValue)}


}

public class LINK(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("link", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var media : String
        get()  = attributeStringf320f1e5.get(this, "media")
        set(newValue) {attributeStringf320f1e5.set(this, "media", newValue)}

    var hrefLang : String
        get()  = attributeStringf320f1e5.get(this, "hreflang")
        set(newValue) {attributeStringf320f1e5.set(this, "hreflang", newValue)}

    var href : String
        get()  = attributeStringf320f1e5.get(this, "href")
        set(newValue) {attributeStringf320f1e5.set(this, "href", newValue)}

    var type : String
        get()  = attributeStringf320f1e5.get(this, "type")
        set(newValue) {attributeStringf320f1e5.set(this, "type", newValue)}

    var sizes : String
        get()  = attributeStringf320f1e5.get(this, "sizes")
        set(newValue) {attributeStringf320f1e5.set(this, "sizes", newValue)}

    var rel : String
        get()  = attributeStringf320f1e5.get(this, "rel")
        set(newValue) {attributeStringf320f1e5.set(this, "rel", newValue)}


}

