//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.15 at 09:22:26 AM VET 
//


package com.ula.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ula.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ula.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Initial }
     * 
     */
    public Initial createInitial() {
        return new Initial();
    }

    /**
     * Create an instance of {@link LabelState }
     * 
     */
    public LabelState createLabelState() {
        return new LabelState();
    }

    /**
     * Create an instance of {@link StateMachine }
     * 
     */
    public StateMachine createStateMachine() {
        return new StateMachine();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link BendPoints }
     * 
     */
    public BendPoints createBendPoints() {
        return new BendPoints();
    }

    /**
     * Create an instance of {@link Arc }
     * 
     */
    public Arc createArc() {
        return new Arc();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link EventArc }
     * 
     */
    public EventArc createEventArc() {
        return new EventArc();
    }

    /**
     * Create an instance of {@link EventSM }
     * 
     */
    public EventSM createEventSM() {
        return new EventSM();
    }

}
